package com.example.spacecraft10.data.response

data class Family(
    val description: String,
    val id: Int,
    val maiden_flight: String,
    val manufacturer: Manufacturer,
    val name: String,
    val parent: Parent,
    val response_mode: String
)