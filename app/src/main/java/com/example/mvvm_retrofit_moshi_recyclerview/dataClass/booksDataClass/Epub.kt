package com.example.mvvm_retrofit_moshi_recyclerview.dataClass.booksDataClass


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Epub(
    @Json(name = "acsTokenLink")
    val acsTokenLink: String?,
    @Json(name = "isAvailable")
    val isAvailable: Boolean?
)