package edu.iesam.superheroes.feature.superheroes.domain

sealed class ErrorApp: Throwable() {
    object InternetError : ErrorApp()
}