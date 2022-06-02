package com.example.gitrepositoriesapp

data class DataModels(
    val id: String,
    val name: String,
    val description: String,
    val owners: Owners,
    val url: String
)
data class Owners(
    val login: String
)
