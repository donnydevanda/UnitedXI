package com.devanda.unitedxi

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvPlayers: RecyclerView
    private var list: ArrayList<Player> = arrayListOf()

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPlayers = findViewById(R.id.rv_player)
        rvPlayers.setHasFixedSize(true)

        list.addAll(PlayersData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val moveAbout = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(moveAbout)
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList(){
        rvPlayers.layoutManager = LinearLayoutManager(this)
        val listPlayerAdapter = ListAdapter(list)
        rvPlayers.adapter = listPlayerAdapter

        listPlayerAdapter.setOnItemClickCallback(object : ListAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Player){
                showSelectedPlayer(data)
                detailPlayer(data)
            }
        })
    }

    private fun showSelectedPlayer(player: Player){
        Toast.makeText(this, "You Choose " + player.name, Toast.LENGTH_SHORT).show()
    }

    private fun detailPlayer(player: Player){
        val moveDetail = Intent(this@MainActivity, DetailActivity::class.java)
        moveDetail.putExtra(DetailActivity.EXTRA_NAME, player.name)
        moveDetail.putExtra(DetailActivity.EXTRA_DESCRIPTION, player.description)
        moveDetail.putExtra(DetailActivity.EXTRA_IMAGE, player.image)
        startActivity(moveDetail)
    }
}