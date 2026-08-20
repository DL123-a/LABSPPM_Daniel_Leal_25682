package com.example.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab4.ui.theme.LAB4Theme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LAB4Theme {
                Screen()

                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun ScreenPreview(){
    LAB4Theme {
        Screen()

    }
}
@Composable
fun Screen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .border(
                width = 10.dp,
                color = Color(0xFF006633)
            )
    ) {


        Image(
            painter = painterResource(id = R.drawable.uvg),
            contentDescription = "Fondo",
            alpha = 0.3f,
            modifier = Modifier
                .size(400.dp)
                .align(Alignment.Center)
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 200.dp,
                    start = 30.dp,
                    end = 30.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Universidad del Valle de Guatemala",
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )

            Text(
                text = "Programación De Plataformas Móviles, Sección 21",
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "INTEGRANTES",fontWeight = FontWeight.Bold
                )

                Column(
                    horizontalAlignment = Alignment.End
                ){
                    Text(text = "Daniel Leal")
                    Text(text = "Cristiano Ronaldo")
                    Text(text = "Lionel Messi")
                }
            }

            Spacer(
                modifier = Modifier.height(20.dp)
            )


            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "CATEDRÁTICO",fontWeight = FontWeight.Bold
                )

                Column(
                    horizontalAlignment = Alignment.End
                ){
                    Text(text = "Juan Carlos Durini")
                }
            }


        }

        Text(
            text = "Daniel Alejandro Leal Sáenz",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 600.dp)
        )

        Text(
            text = "25682",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 620.dp)
        )
    }
}




