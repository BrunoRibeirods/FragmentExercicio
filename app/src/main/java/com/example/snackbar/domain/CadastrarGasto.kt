package com.example.snackbar.domain

data class CadastrarGasto(
    val descricao: String,
    val categoria: String,
    val dataHora: String,
    val valor: Double
)
