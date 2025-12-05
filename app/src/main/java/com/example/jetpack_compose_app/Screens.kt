package com.example.jetpack_compose_app

import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Profile(val name: String)