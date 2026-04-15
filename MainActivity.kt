package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(modifier = Modifier.padding(innerPadding)) {
                        

                        Box {
                            Imagen()
                            Texto(name = "Jenna")
                        }
                        

                        Column {
                            Descripcion()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Imagen() {
    Image(
        painter = painterResource(id = R.drawable.jenna),
        contentDescription = null
    )
}

@Composable
fun Texto(name: String) {
    Text(
        text = "Ella es: $name",
        color = Color.Blue
    )
}

@Composable
fun Descripcion() {
    Text(
        text = "Ella es la mascota de mi hermana, es una husky, hembra, tiene 2 años y es muy latosa",
        color = Color.Black,
        fontSize = 20.sp
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Scaffold { innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                Imagen()
                Texto("Jenna")
                Descripcion()
            }
        }
    }
}
