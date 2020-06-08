package dev.mustaq.usecases

import dev.mustaq.domain.repository.DictionaryRepository
import dev.mustaq.domain.responseutil.Result

class GetMeaning(private val dictionaryRepository: DictionaryRepository) {
    suspend operator fun invoke(urbanWord : String) : Result<Unit, Exception> =
        dictionaryRepository.getMeaning(urbanWord)
}
