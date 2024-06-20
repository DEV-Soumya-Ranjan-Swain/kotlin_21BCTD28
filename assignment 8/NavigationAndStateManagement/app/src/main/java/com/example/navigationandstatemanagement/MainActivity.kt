package com.example.navigationandstatemanagement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.*
import com.example.navigationandstatemanagement.ui.theme.NavigationAndStateManagementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()
        setContent {
            AppNavigation()
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen1") {
        composable("screen1") { Screen1(navController) }
        composable("screen2") { Screen2(navController) }
        composable("lazyColumnScreen") { ScreenWithLazyColumn() }
    }
}

@Composable
fun Screen1(navController: NavController) {
    Column {
        Text(
            text = "This is screen 1",
            color = Color.Red,
            fontSize = 50.sp,
            modifier = Modifier.padding(20.dp)
        )
        Button(onClick = { navController.navigate("screen2") }) {
            Text(text = "Next")
        }
        CounterButton()
    }
}

@Composable
fun Screen2(navController: NavController) {
    Column {
        Text(
            text = "This is screen 2",
            color = Color.Blue,
            fontSize = 50.sp,
            modifier = Modifier.padding(20.dp)
        )
        Button(onClick = { navController.navigate("screen1") }) {
            Text(text = "Previous")
        }
        UserInput()
    }
}

@Composable
fun CounterButton() {
    var count by remember { mutableStateOf(0) }
    Column(modifier = Modifier.padding(30.dp)) {
        Text(text = "Count Value : $count", fontSize = 40.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { count++ }) {
            Text(text = "Increment Count")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { count-- }) {
            Text(text = "Decrement Count")
        }
    }
}

@Composable
fun UserInput() {
    var text by remember { mutableStateOf("") }
    var text1 by remember { mutableStateOf("") }
    Column {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text(text = "Enter Username") },
            placeholder = { Text(text = "Unique Username") }
        )
        OutlinedTextField(
            value = text1,
            onValueChange = { text1 = it },
            label = { Text(text = "Enter Email") },
            placeholder = { Text(text = "abc@mail.com") }
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationAndStateManagementTheme {
        Greeting("Android")
    }
}

@Composable
fun LazyColumnExample() {
    LazyColumn {
        items(100) { index ->
            Text("Item #$index", fontSize = 20.sp, modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun ScreenWithLazyColumn() {
    Column {
        Text(
            text = "LazyColumn Example",
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        LazyColumnExample()
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenWithLazyColumnPreview() {
    NavigationAndStateManagementTheme {
        ScreenWithLazyColumn()
    }
}
