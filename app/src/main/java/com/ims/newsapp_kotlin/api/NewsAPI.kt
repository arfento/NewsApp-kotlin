package com.ims.newsapp_kotlin.api

import com.ims.newsapp_kotlin.NewsResponse
import com.ims.newsapp_kotlin.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {

    //    api = https://newsapi.org/v2/top-headlines?country=us&apiKey=d73f274b69324246816486dc4527138c
//    key = d73f274b69324246816486dc4527138c
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode: String = "us",
        @Query("page") page : Int = 1,
        @Query("apiKey") apiKey : String = API_KEY
    ) : Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") countryCode: String = "us",
        @Query("page") page : Int = 1,
        @Query("apiKey") apiKey : String = API_KEY
    ) : Response<NewsResponse>
}