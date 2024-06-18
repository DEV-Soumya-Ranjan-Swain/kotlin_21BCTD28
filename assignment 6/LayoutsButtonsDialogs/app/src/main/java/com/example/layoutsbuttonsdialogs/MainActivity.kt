package com.example.layoutsbuttonsdialogs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layoutsbuttonsdialogs.ui.theme.LayoutsButtonsDialogsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsButtonsDialogsTheme {
                ScaffoldExample()
            }
        }
    }
}

@Composable
fun ScaffoldExample() {
    val showDialog = remember { mutableStateOf(false) }

    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { showDialog.value = false },
            title = {
                Text(text = "This is a sample alert")
            },
            text = {
                Text(text = "This is a sample alert message")
            },
            confirmButton = {
                Button(onClick = { showDialog.value = false }) {
                    Text(text = "Ok")
                }
            }
        )
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Button(onClick = { showDialog.value = true }) {
            Text("Show Dialog")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        AllButtons()
        Spacer(modifier = Modifier.padding(8.dp))
        LayoutExamples()
    }
}

@Composable
fun AllButtons() {
    Column {
        Button(onClick = { println("Filled Button Clicked") }) {
            Text("Filled Button")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        OutlinedButton(onClick = { println("Outlined Button Clicked") }) {
            Text("Outlined Button")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        TextButton(onClick = { println("Text Button Clicked") }) {
            Text("Text Button")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        ElevatedButton(onClick = { println("Elevated Button Clicked") }) {
            Text("Elevated Button")
        }
    }
}

@Composable
fun LayoutExamples() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Soumya Ranjan Swain",
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.Cyan)
                    .clickable {
                        println("Text Clicked")
                    }
            )
        }
        Spacer(modifier = Modifier.padding(8.dp))
        Column {
            Text(text = "Hello Soumya", fontSize = 40.sp)
            Row {
                Text(text = "Row Item 1", fontSize = 30.sp)
                Spacer(modifier = Modifier.padding(8.dp))
                Text(text = "Row Item 2", fontSize = 30.sp)
            }
            Box(modifier = Modifier.padding(16.dp)) {
                Text(text = "Inside a Box", fontSize = 30.sp)
            }
        }
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
    LayoutsButtonsDialogsTheme {
        Greeting("Android")
    }
}
