package com.idn.listviewcountry


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private var array = arrayOf ("Sragen","Surakarta", "Klaten", "Surabaya", "Jakarta",
        "Tangerang", "Bandung", "Bogor", "lampung", "Palembang", "Medan", "Jambi", "Aceh", "Bangkok")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter(
            this, R.layout.listview_item, array)

        val listView : ListView = findViewById(R.id.listvew_1)
        listView.adapter = adapter

        listView.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>, view : View, position: Int,
            id :Long){

                // value item ketika di click
                val itemValue = listView.getItemAtPosition(position) as String

                //toast the values
                Toast.makeText(applicationContext, "Position : $position\nItem Value : $itemValue", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}