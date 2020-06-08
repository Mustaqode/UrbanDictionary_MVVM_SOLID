package dev.mustaq.urbandictionaryapp.framework.rest

import dev.mustaq.data.model.Dictionary
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Mustaq Sameer on 08/06/20
 */
interface DictionaryApi {
    @GET("/v0/define")
    suspend fun getMeaning(@Query("term") word: String ) : Dictionary
}