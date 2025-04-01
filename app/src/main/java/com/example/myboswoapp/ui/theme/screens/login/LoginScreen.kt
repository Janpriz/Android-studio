package com.example.myboswoapp.ui.theme.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login_screen(modifier: Modifier = Modifier) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Text(
            text = "Login",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter Email") },
            leadingIcon = { Icons.Default.Email },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(20.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Enter Password") },
            leadingIcon = { Icons.Default.Lock },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(20.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {/*TODO*/ },
            modifier = Modifier.width(150.dp)
        ) {
            Text(
                text = "LOGIN",
                fontFamily = FontFamily.Cursive,
                fontSize = 25.sp,
            )
    }

    }


    }

@Preview
@Composable
private fun Loginpre() {
    Login_screen()

}