package org.example.api

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.math.BigInteger

@Serializable
data class Decision(
    val expected: Int,
    val actual: Int,
    val decision: String,
    @Contextual val test: BigInteger? = null,
)