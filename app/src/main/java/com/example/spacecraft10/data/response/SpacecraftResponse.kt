package com.example.spacecraft10.data.response

data class SpacecraftResponse(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Results>
)