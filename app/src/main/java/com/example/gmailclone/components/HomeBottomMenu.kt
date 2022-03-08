package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.gmailclone.model.HomeButtonMenuData

@Composable
fun HomeBottomBarMenu(){
    val menuList = listOf(
        HomeButtonMenuData.Mail,
        HomeButtonMenuData.Meet,
        HomeButtonMenuData.NewMail
    )

    BottomNavigation(backgroundColor = Color.White,
        contentColor = Color.Black) {
        menuList.forEach {
                BottomNavigationItem(
                    label = { Text(text = it.title)},
                    alwaysShowLabel = true,
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { Icon(imageVector = it.icon, contentDescription = it.title)}
                )
        }
    }


}

@Composable
fun HomeBottomItem(item: HomeButtonMenuData){
    Column {
        Image(imageVector = item.icon,item.title)
    }
}