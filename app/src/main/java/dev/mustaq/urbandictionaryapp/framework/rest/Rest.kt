package dev.mustaq.urbandictionaryapp.framework.rest

import com.google.gson.GsonBuilder
import dev.mustaq.domain.constants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by Mustaq Sameer on 08/06/20
 */
object Rest {

    private val client = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor())
        .build()

    private fun loggingInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory. create())
        .client(client)
        .build()

    val service: DictionaryApi = retrofit.create(DictionaryApi::class.java)

}