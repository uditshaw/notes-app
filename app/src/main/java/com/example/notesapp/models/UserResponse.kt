package com.example.notesapp.models


import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("token")
    val token: String = "",
    @SerializedName("user")
    val user: User = User()
)