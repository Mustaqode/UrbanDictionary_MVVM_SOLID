package dev.mustaq.urbandictionaryapp.framework.rest

import dev.mustaq.data.model.Dictionary
import dev.mustaq.data.service.ServiceDataSource

/**
 * Created by Mustaq Sameer on 08/06/20
 */
class DictionaryService(private val dictionaryApi: DictionaryApi): ServiceDataSource {

    override suspend fun getMeaning(string: String): Dictionary =
        dictionaryApi.getMeaning(string)

}