package com.ramonsl.listas_adapters_ciclo_de_vida


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class ProdutoAdapter (private val produtos: List<Produto>): RecyclerView.Adapter<ProdutoAdapter.VH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        val vh = VH(v)
        return vh
    }
    override fun getItemCount(): Int {
        return produtos.size
    }
    override fun onBindViewHolder(holder: VH, position: Int) {

        var produto=produtos[position]
        holder.txtProduto.text =produto.nome
        holder.txtQtd.text=produto.qtd.toString()
        holder.txtValor.text=produto.preco.toString()
    }
    class VH(view: View) : RecyclerView.ViewHolder(view) {
        var txtProduto = view.findViewById<TextView>(R.id.txtProduto)
        var txtValor = view.findViewById<TextView>(R.id.txtValor)
        var txtQtd = view.findViewById<TextView>(R.id.txtQtd)
        init {
            // Define click listener for the ViewHolder's View.
            txtProduto = view.findViewById(R.id.txtProduto)
             txtValor = view.findViewById(R.id.txtQtd)
             txtValor= view.findViewById(R.id.txtValor)
        }
    }
}