package com.example.alura.orgs.dao

import com.example.alura.orgs.model.Produto

class ProdutosDao {

    fun adiciona(produto: Produto) {
        Companion.produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> {
        return Companion.produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }

}