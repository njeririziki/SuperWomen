package com.njeri.superwomenapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.njeri.superwomenapp.data.Hero
import com.njeri.superwomenapp.data.heroes
import com.njeri.superwomenapp.ui.theme.SuperWomenAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperWomenAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SuperWomanApp()
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SuperWomanApp(){
    Scaffold(
        topBar = {HeroesTopBar()}
    ) {
        LazyColumn(modifier = Modifier.background(MaterialTheme.colorScheme.background)){
         items(heroes){
             HeroCard(hero = it)
         }
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeroCard(hero: Hero,modifier: Modifier = Modifier){
    Card(modifier = modifier.padding(8.dp)) {
        Column {
            Image(
                painter = painterResource(hero.imageResourceId),
                contentDescription = stringResource(hero.name),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(hero.description),
                modifier = Modifier.padding(16.dp),
               style = MaterialTheme.typography.titleLarge
            )
        }
    }
}

@Composable
fun HeroesTopBar(){

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SuperWomenAppTheme(darkTheme = false) {
        SuperWomanApp()
    }
}
@Preview(showBackground = true)
@Composable
fun DarkPreview() {
    SuperWomenAppTheme(darkTheme = true) {
        SuperWomanApp()
    }
}