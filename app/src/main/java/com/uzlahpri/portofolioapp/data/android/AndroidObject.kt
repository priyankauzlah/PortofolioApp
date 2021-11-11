package com.uzlahpri.portofolioapp.data.android

import com.uzlahpri.portofolioapp.R

object AndroidObject {

    private val title = arrayOf(
        "Portofolio App",
        "Meditation App",
        "Contact App",
        "Online Learning App",
        "Weather App",
        "News App",
        "Movie App",
        "Event App",
        "Redesign Chatime App"
    )

    private val poster = intArrayOf(
        R.drawable.portofolio,
        R.drawable.meditation,
        R.drawable.chatting,
        R.drawable.jenius,
        R.drawable.weather,
        R.drawable.news,
        R.drawable.movie,
        R.drawable.event,
        R.drawable.chatime
    )

    private val link = arrayOf(
        "https://dribbble.com/shots/16767584-Portfolio-App",
        "https://dribbble.com/shots/14615527-Meditation-Mobile-App",
        "https://dribbble.com/shots/15521623-Chatting-App",
        "https://dribbble.com/shots/14723334-Jenius-Online-Learning-App",
        "https://dribbble.com/shots/15146040-Weather-App-mountain",
        "https://dribbble.com/shots/15170337-News-App-Daily",
        "https://dribbble.com/shots/15293440-Movie-Catalog-App",
        "https://dribbble.com/shots/15734521-Event-App",
        "https://dribbble.com/shots/16389000-Redesign-Chatime-Mobile-App"
    )

    val listAppAndroid: ArrayList<Android>
        get() {
            val list = arrayListOf<Android>()
            for (position in title.indices){
                val android = Android()
                android.title = title[position]
                android.poster = poster[position]
                android.link = link[position]
                list.add(android)
            }
            return list
        }
}