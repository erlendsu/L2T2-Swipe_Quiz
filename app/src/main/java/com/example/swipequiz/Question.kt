package com.example.swipequiz

data class Question(var question: String, var right: Boolean) {
    companion object {
        val QUESTIONS = arrayOf(
            "The moon is blue",
            "Amsterdam is the capitol of The Netherlands",
            "2+2=4",
            "16-0.6=10",
            "Coffee is black"
        )
        val ANSWERS = arrayOf(
            false,
            true,
            true,
            false,
            true
        )
    }
}