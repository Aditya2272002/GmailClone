package com.example.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

//All data of sealed Class known at Compile time.
sealed class DrawerMenuData(
    val icon:ImageVector? = null,
    val title:String? = null,
    val isDivider:Boolean = false,
    val isHeader:Boolean = false
    ){
    object AllInbox: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All Inbox"
    )

    object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )

    object Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Social"
    )

    object Promotions: DrawerMenuData(
        icon = Icons.Outlined.PersonPin,
        title = "Social"
    )

    object Starred: DrawerMenuData(
        icon = Icons.Outlined.Star,
        title = "Starred"
    )

    object Snoozed: DrawerMenuData(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed"
    )

    object Important: DrawerMenuData(
        icon = Icons.Outlined.LabelImportant,
        title = "Important"
    )

    object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )

    object Scheduled: DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        title = "Scheduled"
    )

    object Outbox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )

    object Drafts: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )

    object AllMails: DrawerMenuData(
        icon = Icons.Outlined.Mail,
        title = "All Mails"
    )

    object Calender: DrawerMenuData(
        icon = Icons.Outlined.CalendarViewMonth,
        title = "Calender"
    )

    object Contact: DrawerMenuData(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )

    object Setting: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )

    object Help: DrawerMenuData(
        icon = Icons.Outlined.Help,
        title = "Help & Feedback"
    )

    object Divider: DrawerMenuData(
        isDivider = true
    )

    object HeaderOne: DrawerMenuData(
        isHeader = true,
        title = "ALL LABELS"
    )

    object HeaderTwo: DrawerMenuData(
        isHeader = true,
        title = "GOOGLE APPS"
    )

}
