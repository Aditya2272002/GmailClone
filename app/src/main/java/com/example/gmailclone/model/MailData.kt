package com.example.gmailclone.model

import android.graphics.Color

data class MailData(
    val mailId:Int,
    val userName:String,
    val subject:String,
    val contentBody:String,
    val timeStamp:String = "",
    val color: androidx.compose.ui.graphics.Color
    )