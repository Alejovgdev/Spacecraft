package com.example.spacecraft10.data.response

data class Image(
    val credit: String,
    val id: Int,
    val image_url: String,
    val license: License,
    val name: String,
    val single_use: Boolean,
    val thumbnail_url: String,
    val variants: List<Any>
)