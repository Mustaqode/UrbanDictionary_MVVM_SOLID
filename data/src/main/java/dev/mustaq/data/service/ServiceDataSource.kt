package dev.mustaq.data.service

import dev.mustaq.data.model.Dictionary

/**
 * Created by Mustaq Sameer on 07/06/20
 */

/**
 * This data source is implemented in framework layer; hence making sure data layer
 * doesn't have any dependency on presentation layer
 */

interface ServiceDataSource {
    suspend fun getMeaning(string: String): Dictionary
}