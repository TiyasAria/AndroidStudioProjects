package com.idn.recycleviewfruit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recyclerview.view.*

class RecyclerViewAdapter(val gambar : Array<Int>, val nama : Array<String>) : RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> () {
    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mGambar = itemView.gambar
        val mNama = itemView.nama

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        //buat objek view itemnya dengan cara inflate
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recyclerview, parent, false)
        //lalu return my holder
        return MyHolder(view)
    }

    override fun getItemCount(): Int = nama.size
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.mGambar.setImageResource(gambar.get(position))
        holder.mNama.text = nama.get(position)
    }
}