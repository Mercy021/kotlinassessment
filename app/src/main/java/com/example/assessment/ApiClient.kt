package com.example.assessment

object ApiClient {
    var retrofit = Retrofit
        .baseUrl("<your base url goes here>")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun<T>buildApiClient(apiInterface: Class<T>): T{
        return retrofit.create(apiInterface)}}

class GsonConverterFactory {

}

