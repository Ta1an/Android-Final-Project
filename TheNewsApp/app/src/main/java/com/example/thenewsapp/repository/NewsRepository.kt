package com.example.thenewsapp.repository

import com.example.thenewsapp.database.ArticleDB
import com.example.thenewsapp.models.Article
import com.example.thenewsapp.network.RetroFitInstance

class NewsRepository(private val db: ArticleDB) {
    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetroFitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetroFitInstance.api.searchNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getFavouriteNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}
