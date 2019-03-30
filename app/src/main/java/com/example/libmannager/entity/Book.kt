package com.example.libmannager.entity

import com.google.gson.annotations.SerializedName

class Book (
    @SerializedName("nome")
    val nome: String,
    @SerializedName("edicao")
    val edicao: String,
    @SerializedName("editora")
    val editora: String,
    @SerializedName("autor")
    val autor: String,
    @SerializedName("ano")
    val ano: Int
)