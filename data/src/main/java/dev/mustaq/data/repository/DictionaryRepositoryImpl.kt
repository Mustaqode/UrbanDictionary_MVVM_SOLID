package dev.mustaq.data.repository

import dev.mustaq.data.datasource.DictionaryDataSource
import dev.mustaq.domain.model.Meaning
import dev.mustaq.domain.repository.DictionaryRepository
import dev.mustaq.domain.responseutil.Result
import java.lang.Exception

/**
 * Created by Mustaq Sameer on 07/06/20
 */

/**
 * This repo implementation is also depend on abstraction; only domain layer which
 * handles business logic can know what this repo should contain
 */
class DictionaryRepositoryImpl(
    private val dictionaryDataSource: DictionaryDataSource
) : DictionaryRepository {

    override suspend fun getMeaning(word: String): Result<Meaning, Exception> {
        return dictionaryDataSource.getMeaning(word)
    }
}