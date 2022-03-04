package com.concesionario.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.concesionario.databinding.ConcesionarioFilaBinding

class ConcesionarioAdapter : RecyclerView.Adapter<ConcesionarioAdapter.ConcesionarioViewHolder>() {
    inner class ConcesionarioViewHolder(private val itemBinding: ConcesionarioFilaBinding) :
            RecyclerView.ViewHolder(itemBinding.root) {

            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConcesionarioViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ConcesionarioViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}