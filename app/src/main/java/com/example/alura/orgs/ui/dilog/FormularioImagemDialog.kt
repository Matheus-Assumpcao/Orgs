package com.example.alura.orgs.ui.dilog

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.example.alura.orgs.databinding.FormaularioImagemBinding
import com.example.alura.orgs.extensions.tentaCarregarImagem

class FormularioImagemDialog(private val context: Context) {

    fun mostra(){
        val binding = FormaularioImagemBinding.inflate(LayoutInflater.from(context))
        binding.formularioImagemBotaoCarregar.setOnClickListener {
            val url = binding.formularioImagemUrl.text.toString()
            binding.formalurioImagemImageview.tentaCarregarImagem(url)
        }

        AlertDialog.Builder(context)
            .setView(binding.root)
            .setPositiveButton("Confirmar") { _, _ ->
                val url = binding.formularioImagemUrl.text.toString()
                Log.i("FormularioImagemDialog", "mostra: $url")
//                binding.activityFormularioProdutoImagem.tentaCarregarImagem(url)
            }
            .setNegativeButton("Cancelar") { _, _ -> }
            .show()
    }

}