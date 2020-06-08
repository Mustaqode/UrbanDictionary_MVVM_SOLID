package dev.mustaq.urbandictionaryapp.presentation.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.mustaq.data.repository.DictionaryRepositoryImpl
import dev.mustaq.domain.responseutil.Result
import kotlinx.coroutines.launch

/**
 * Created by Mustaq Sameer on 08/06/20
 */
class MainViewModel(private val dictionaryRepositoryImpl: DictionaryRepositoryImpl): ViewModel() {

    private val meaningLd = MutableLiveData<String>()
    private val errorLd = MutableLiveData<String>()

    val meaning: LiveData<String> = meaningLd
    val error: LiveData<String> = errorLd

    fun getMeaning(word: String){
        viewModelScope.launch {
            val result = dictionaryRepositoryImpl.getMeaning(word)
            when(result) {
                is Result.Value -> {
                    meaningLd.value = result.value.meaning
                }
                is Result.Error -> {
                    errorLd.value = result.error.message.toString()
                }
            }
        }
    }
}