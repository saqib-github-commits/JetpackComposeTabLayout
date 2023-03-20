package com.jetpackcompose.tablayout.tabs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Place

val tabs = listOf(
    TabItem(
        title = "Account",
        icon = Icons.Filled.AccountBox,
        screen = { TabScreen(content = "Account Page") }
    ),
    TabItem(
        title = "Favorite",
        icon = Icons.Filled.Favorite,
        screen = { TabScreen(content = "Favorite list")}
    ),
    TabItem(
        title = "Place",
        icon = Icons.Filled.Place,
        screen = { TabScreen(content = "Places")}
    )
)