package com.zybooks.picturegame

import kotlin.random.Random

const val GRID_SIZE = 3

class PictureGame {

    private val blackGrid = Array(GRID_SIZE) { Array(GRID_SIZE) { true } }

    fun newGame() {
        for (row in 0 until GRID_SIZE) {
            for (col in 0 until GRID_SIZE) {
                blackGrid[row][col] = true
            }
        }
    }

    fun buttonTansparent(row: Int, col: Int){
        blackGrid[row][col] = true
    }

}