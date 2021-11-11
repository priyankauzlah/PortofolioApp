package com.uzlahpri.portofolioapp.data.experience

import com.uzlahpri.portofolioapp.R

object ExperienceObject {
    private val title = arrayOf(
        "Belajar Dasar Pemrograman JavaScript",
        "Memulai Perograman dengan Dart",
        "Computer Science 101",
        "MUN - UNICEF",
        "IT Intern at SisterHoods",
        "Kursus HTML & CSS",
    )

    private val detail = arrayOf(
        "Belajar Dasar Pemrograman JavaScript merupakan course yang diadakan oleh Dicoding untuk memulai belajar pemrograman JavaScript",
        "Android pemula merupakan course yang diadakan oleh dicoding untuk memulai belajar program android",
        "memulai program bahasa kotlin merupakan course yang bertujuan untuk mempelajari bahas kotlin",
        "memulai program bahasa kotlin merupakan course yang bertujuan untuk mempelajari bahas python",
        "solid principle mempeljari tentang oop, clean code, dll"
    )

    private val image = intArrayOf(
        R.drawable.javascript,
        R.drawable.dart,
        R.drawable.coputerscience,
        R.drawable.mun,
        R.drawable.itintern,
        R.drawable.html_css
    )

    val listData: ArrayList<Experience>
        get() {
            val list = arrayListOf<Experience>()
            for (position in title.indices) {
                val experience = Experience()
                experience.title = title[position]
                experience.detail = detail[position]
                experience.image = image[position]
                list.add(experience)
            }

            return list
        }
}