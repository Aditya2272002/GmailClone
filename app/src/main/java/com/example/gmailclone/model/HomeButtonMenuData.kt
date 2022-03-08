package com.example.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AllInbox
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class HomeButtonMenuData(
    val icon:ImageVector,
    val title:String
) {
    object Mail: HomeButtonMenuData(
        icon = Icons.Outlined.Mail,
        title = "Mail"
    )

    object Meet: HomeButtonMenuData(
        icon = Icons.Outlined.VideoCall,
        title = "Meet"
    )

    object NewMail: HomeButtonMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "New Mail"
    )
}