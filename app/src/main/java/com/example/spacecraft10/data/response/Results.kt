package com.example.spacecraft10.data.response

data class Results(
    val agency: Agency,
    val family: List<Family>,
    val id: Int,
    val image: Image,
    val in_use: Boolean,
    val name: String,
    val response_mode: String,
    val type: TypeXX,
    val url: String
)