package com.idn.smart.tiyas.myrecyclerviewfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val list = ArrayList<Hero>()
    private var title = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv_main.setHasFixedSize(true)
        list.addAll(getDataHero())
        setActionBarTitle(title)
        showRecyclerList()



    }

    private fun showRecyclerGrid() {
        rv_main.layoutManager =  GridLayoutManager(this,2)
        val gridHeroAdapter = GridHeroAdapter(list)
        rv_main.adapter = gridHeroAdapter
    }

    private fun showRecyclerCardView() {
        rv_main.layoutManager =  LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewAdapter(list)
        rv_main.adapter = cardViewHeroAdapter
    }

    private fun showRecyclerList() {
        rv_main.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rv_main.adapter = listHeroAdapter

        // terapkan func yg diasable tadi di adpter ke main activity
        listHeroAdapter.setOnItemClickCallback(object : ListHeroAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Hero) {
                Toast.makeText(this@MainActivity, data.name, Toast.LENGTH_SHORT).show()
            }

        })

    }

    private fun getDataHero(): ArrayList<Hero>{
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listHero = ArrayList<Hero>()
        for (position in dataName.indices){
            val hero = Hero (
                dataName[position],
                dataDescription[position],
                dataPhoto[position]
                    )
            listHero.add(hero)
        }
        return listHero
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode){
            R.id.action_list -> {
                title = "Mode LIst"
            showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode grid"
            showRecyclerGrid()
            }

            R.id.action_cardview -> {
                title = "Mode cardview"
            showRecyclerCardView()
            }
        }
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title:String) {
        supportActionBar?.title = title
    }
}