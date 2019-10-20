package com.example.listview258

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<tipe>()

        list.add(tipe("Ruby", "Ruby is an opensource anf fully object-oriented progrmaming", R.drawable.rubyd))
        list.add(tipe("Rails", "Ruby on Rails is a server-side web application", R.drawable.railsd))
        list.add(tipe("Phyton", "Phyton is interprested and object-oriented", R.drawable.piton))
        list.add(tipe("Java Script", "JavaScript is an object-oriented scripting language", R.drawable.jsd))
        list.add(tipe("PHP", "PHP is an interprested languegae Le, there is no need for compilation", R.drawable.phpd))

        listview.adapter = adapterlist(this, R.layout.set, list)

        listview.setOnItemClickListener { parent, view, position, id ->

            if (position == 0) {
                Toast.makeText(this@MainActivity, "Item One",   Toast.LENGTH_SHORT).show()
            }
            if (position == 1) {
                Toast.makeText(this@MainActivity, "Item Two",   Toast.LENGTH_SHORT).show()
            }
            if (position == 2) {
                Toast.makeText(this@MainActivity, "Item Three",   Toast.LENGTH_SHORT).show()
            }
            if (position == 3) {
                Toast.makeText(this@MainActivity, "Item Four",   Toast.LENGTH_SHORT).show()
            }
            if (position == 4) {
                Toast.makeText(this@MainActivity, "Item Five",   Toast.LENGTH_SHORT).show()
            }
        }
    }
}
