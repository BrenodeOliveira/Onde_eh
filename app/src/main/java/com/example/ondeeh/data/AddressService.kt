package com.example.ondeeh.data

import com.example.ondeeh.model.Address
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AddressService {
    @GET("/ws/{cep}/json")
    fun search(@Path("cep") cep: String): Call<Address>
}