package com.example.gmailclone.components


import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.gmailclone.R


@Composable
fun AccountDialog(openDialog: MutableState<Boolean>){
    Dialog(onDismissRequest = { openDialog.value = false },
    properties = DialogProperties(dismissOnClickOutside = false)
    ) {
        AccountsDialogUI(openDialog = openDialog)
    }
}

@Composable
fun AccountsDialogUI(modifier: Modifier = Modifier, openDialog: MutableState<Boolean>){
    Card() {
        Column(
            modifier
                .background(Color.White)
                .padding(bottom = 16.dp)) {
            Row(modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = { openDialog.value = false}) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Close")
                }
                Image(painter = painterResource(id = R.drawable.google),
                    contentDescription = "google",
                    modifier = Modifier
                        .size(30.dp)
                        .weight(2.0f))
            }

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 16.dp)) {
                Image(painter = painterResource(id = R.drawable.admin),
                    contentDescription = "Admin",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                )

                Column(modifier = Modifier
                    .weight(2.0f)
                    .padding(start = 16.dp, bottom = 16.dp)) {

                    Text("Aditya Maurya", fontWeight = FontWeight.Bold)

                    Text("adi22maurya@gmail.com")
                }
                Text(text = "99+", modifier = Modifier.padding(end = 16.dp))
            }
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Card(modifier = Modifier.width(150.dp)
                    , shape = RoundedCornerShape(50.dp)
                    , border = BorderStroke(1.dp, color = Color.Gray) ) {

                    Text(text = "Google Account",
                        modifier = Modifier.padding(8.dp)
                        , textAlign = TextAlign.Center)
                }
                Spacer(modifier = Modifier.width(10.dp))
            }
            Divider(modifier = Modifier.padding(top = 16.dp))

            Row(modifier = Modifier.padding(start = 16.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                Text(text = "Privacy Policy", modifier = Modifier.padding(end = 16.dp, bottom = 16.dp))
                Text(text = "Terms Of Service", modifier = Modifier.padding(end = 16.dp, bottom = 16.dp))
            }
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
fun AccountDialogPreview(){
    AccountsDialogUI(openDialog = mutableStateOf(false))
}