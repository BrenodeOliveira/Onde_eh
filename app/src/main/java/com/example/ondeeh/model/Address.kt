package com.example.ondeeh.model

import com.squareup.moshi.Json

data class Address(
    @Json(name = "cep") val cep: String,
    @Json(name = "logradouro" ) val streetName: String,
    @Json(name = "complemento" ) val complement: String,
    @Json(name = "bairro") val district: String,
    @Json(name = "localidade" ) val city: String,
    @Json(name = "uf") val uf: String
)
