package com.mulatya.mvvmcoroutinesample

class MainRepository constructor(private  val retrofitService: RetrofitService) {

    suspend fun getAllMovies() = retrofitService.getAllMovies()
}