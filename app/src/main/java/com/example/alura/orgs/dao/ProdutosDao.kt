package com.example.alura.orgs.dao

import com.example.alura.orgs.model.Produto
import java.math.BigDecimal

class ProdutosDao {

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>(
            Produto(nome = "Salada de Fruta",
            descricao = "Uva, Laranja e Maça,",
            valor = BigDecimal("19.83")
            )
        )
    }

}