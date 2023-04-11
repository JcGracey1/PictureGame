package com.zybooks.picturegame

import android.os.Bundle
import android.view.View
import android.widget.GridLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.children

class MainActivity : AppCompatActivity() {

    private lateinit var game: PictureGame
    private lateinit var darkGridLayout: GridLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        darkGridLayout = findViewById(R.id.light_grid)

        for (gridButton in darkGridLayout.children) {
            gridButton.setOnClickListener(this::onDarkButtonCLick)
        }


        game = PictureGame()
    }

    private fun onDarkButtonCLick(view: View){

        // Find the button's row and col
        val buttonIndex = darkGridLayout.indexOfChild(view)
        val row = buttonIndex / GRID_SIZE
        val col = buttonIndex % GRID_SIZE

        game.buttonTansparent(row, col)
    }
}