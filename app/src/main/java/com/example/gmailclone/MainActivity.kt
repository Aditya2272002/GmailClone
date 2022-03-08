package com.example.gmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmailclone.components.*
import com.example.gmailclone.ui.theme.GmailCloneTheme
import kotlinx.coroutines.CoroutineScope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {

    val scaffoldState:ScaffoldState = rememberScaffoldState()
    val coroutineScope:CoroutineScope = rememberCoroutineScope()
    val scrollState : ScrollState = rememberScrollState()
    val openDialog =  remember {
        mutableStateOf(false)
    }


    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {HomeAppBar(scaffoldState,coroutineScope, openDialog = openDialog)},
        drawerContent = {
            GmailDrawerMenu(scrollState  = scrollState)
        },
        bottomBar = {
            HomeBottomBarMenu()
        },
        floatingActionButton = { GmailFab(scrollState = scrollState) }
        ){
            MailList(paddingValues = it, scrollState = scrollState)
        }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailCloneTheme {
        GmailApp()
    }
}
