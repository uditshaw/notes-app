package com.example.notesapp.models
import com.google.gson.annotations.SerializedName
// retrofit setup for api call response

data class User(
    @SerializedName("createdAt")
    val createdAt: String = "",
    @SerializedName("email")
    val email: String = "",
    @SerializedName("_id")
    val id: String = "",
    @SerializedName("password")
    val password: String = "",
    @SerializedName("updatedAt")
    val updatedAt: String = "",
    @SerializedName("username")
    val username: String = "",
    @SerializedName("__v")
    val v: Int = 0
)