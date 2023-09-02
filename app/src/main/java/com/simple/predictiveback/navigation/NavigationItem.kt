package com.simple.predictiveback.navigation

import com.simple.predictiveback.R

enum class NavigationItem(val route: String, val icon: Int, val title: String, val color: String) {
    Home("home", R.drawable.ic_home, "Home", "#FFFF00"),
    Music("music", R.drawable.ic_music, "Music", "#FF00FF"),
    Movies("movies", R.drawable.ic_movie, "Movies", "#00FFFF"),
    Books("books", R.drawable.ic_book, "Books", "#FFAAAA"),
    Profile("profile", R.drawable.ic_profile, "Profile", "#AAAAFF")
}
