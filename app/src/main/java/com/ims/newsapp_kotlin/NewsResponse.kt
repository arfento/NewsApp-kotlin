package com.ims.newsapp_kotlin

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)