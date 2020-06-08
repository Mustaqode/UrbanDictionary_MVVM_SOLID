package dev.mustaq.data.datasource

import dev.mustaq.data.service.ServiceDataSource
import dev.mustaq.data.utils.toMeaningObject
import dev.mustaq.domain.model.Meaning
import dev.mustaq.domain.responseutil.Result
import dev.mustaq.domain.responseutil.Result.Companion.build
import java.lang.Exception

/**
 * Created by Mustaq Sameer on 07/06/20
 */

/**
 * This datasource relies on abstraction; it is implemented by the real data source in the
 * in the framwework layer which is either from database or from network. It does not have
 * to know as this {Data} higher level module should not depened on {framework} lower level module
 * as per `Dependency Inversion` principle of SOLID
 */

class DictionaryDataSource(private val dataSource: ServiceDataSource) {

    suspend fun getMeaning(string: String): Result<Meaning, Exception> {
        return build {
            val dictionaryObject = dataSource.getMeaning(string)
            dictionaryObject.toMeaningObject
        }
    }

}