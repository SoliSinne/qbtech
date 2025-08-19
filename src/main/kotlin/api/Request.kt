package org.example.api

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.math.BigInteger

@Serializable
data class InputData(
    val chiLevel: Int,
    val documentData: String,
    @Contextual val test: BigInteger? = null,
)