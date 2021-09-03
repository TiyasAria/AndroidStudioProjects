package com.idn.listviewcontact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_listview.view.*


class listViewAdapter(val nama : Array<String>, val notelp : Array<String>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // 1 buat objek viewnya dg cara inflase
        val view = LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_listview, parent, false)
        //kita isikan tiap item dari item_listview disini
        view.nama.text = nama.get(position)
        view.nomer_telepon.text = notelp.get(position)

        //return objek view yang telah kita modif
        return view

    }

    override fun getItem(p0: Int): Any = 0

    override fun getItemId(p0: Int): Long = 0

    override fun getCount(): Int = nama.size
}