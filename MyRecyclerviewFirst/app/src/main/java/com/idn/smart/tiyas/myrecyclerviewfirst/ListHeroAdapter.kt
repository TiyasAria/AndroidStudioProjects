package com.idn.smart.tiyas.myrecyclerviewfirst

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_tiyas.view.*

class ListHeroAdapter(private val listHero: ArrayList<Hero>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    private var onItemClickCallback : OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(hero: Hero){
            with(itemView){
                // untuk menampilkan gambar
                Glide.with(itemView.context)
                    .load(hero.photo)
                    .apply(RequestOptions()
                        .override(60,60))
                    .into(iv_list_tiyas)
                // untuk menampilkan nama dan description
                tv_nama_list.text = hero.name
                tv_description_list.text = hero.description

                // untuk deklarasi itemview ketika diklik akan menyalurkan ke main activity
             itemView.setOnClickListener { onItemClickCallback?. onItemClicked(hero) }
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_tiyas, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListHeroAdapter.ListViewHolder, position: Int) {
        holder.bind(listHero[position])
    }

    override fun getItemCount(): Int = listHero.size

    // make interface untuk click item
    interface OnItemClickCallback {
        fun onItemClicked(data : Hero)
    }


}