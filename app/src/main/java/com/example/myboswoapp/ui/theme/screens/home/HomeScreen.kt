package com.DanG.dang.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myboswoapp.R


@Composable
fun Homescreen(modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top)


    { Text("Welcome to  my app",
        color = Color.Magenta,
        fontSize = 30.sp,
        fontFamily = FontFamily.SansSerif,
        fontStyle = FontStyle.Italic
    )
        Image(painter = painterResource(id = R.drawable.mangoes),
            contentDescription = "t",modifier=Modifier
                .height(200.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {  },
            modifier = Modifier.width(200.dp)) {
            Text(text = "Login",
                fontSize = 30.sp)

        }
        Spacer(modifier=Modifier.height(20.dp))
        Button(onClick = { /*TODO*/   },
            modifier=Modifier.width(150.dp)) {
            Text(text = "Register",
                fontFamily = FontFamily.Cursive,
                fontSize = 25.sp,

                )
        }


        Text("The best fruits",
            color = Color.Black,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
        )
    }

}




@Preview
@Composable
private fun homepreview() {
    Homescreen()}