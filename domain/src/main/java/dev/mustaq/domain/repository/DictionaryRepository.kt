package dev.mustaq.domain.repository

import dev.mustaq.domain.model.Meaning
import dev.mustaq.domain.responseutil.Result
import java.lang.Exception

/**
 * Created by Mustaq Sameer on 07/06/20
 */

/**
 * This interface got behavior of the dictionaryRepository
 */

interface DictionaryRepository {

    suspend fun getMeaning(word: String) : Result<Meaning, Exception>

}