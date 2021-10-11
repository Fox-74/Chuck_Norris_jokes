package com.example.chucknorrisjokes.data.model

import com.google.gson.annotations.SerializedName
import java.util.*

class Joke(
    @SerializedName("id")
    val id: String,
    @SerializedName("icon_url")
    val iconUrl: String,
    @SerializedName("created_at")
    val dataCreated: String,
    @SerializedName("updated_at")
    val dataUpdate: String,
    @SerializedName("categories")
    val category: String,
    @SerializedName("value")
    val value: String,
    @SerializedName("url")
    val url: String
)