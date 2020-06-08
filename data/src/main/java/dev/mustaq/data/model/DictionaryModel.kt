package dev.mustaq.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Mustaq Sameer on 07/06/20
 */

/**
 * These models are used by retrofit
 */

data class Dictionary(
    @SerializedName("list")
    val meaningList: ArrayList<Definition>
)

data class Definition(
    @SerializedName("definition")
    val meaning: String,
    val example: String
)