package br.com.reneluan.news.domain.entity

import com.google.gson.annotations.SerializedName

class ArticleEntity {
    @SerializedName("id") var id: Long? = null
    @SerializedName("author") var author: String? = null
    @SerializedName("title") var title: String? = null
    @SerializedName("description") var description: String? = null
    @SerializedName("url") var url: String? = null
    @SerializedName("urlToImage") var urlToImage: String? = null
    @SerializedName("publishedAt") var publishedAt: String? = null
}