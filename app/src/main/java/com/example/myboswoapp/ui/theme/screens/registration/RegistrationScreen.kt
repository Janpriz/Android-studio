package com.example.myboswoapp.ui.theme.screens.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myboswoapp.navigation.ROUTE_LOGIN
import com.example.myboswoapp.navigation.ROUTE_REGISTER

@Composable
fun Registration_Screen(navController: NavHostController){
    var email by remember{ mutableStateOf(TextFieldValue("")) }
    var firstname by remember { mutableStateOf(TextFieldValue("")) }
    var lastname by  remember{ mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var confirmpassword by remember { mutableStateOf(TextFieldValue("")) }
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ){
        Spacer( modifier = Modifier.height(50.dp))
        Text(
            text = "Registration",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp
        )
        Spacer(modifier=Modifier.height(25.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter Email") },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription ="emailIcon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(20.dp)
        )
        OutlinedTextField(
            value = firstname,
            onValueChange = { firstname = it },
            label = { Text(text = "First Name") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription ="personIcon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(20.dp)
        )
        Spacer(modifier=Modifier.height(25.dp))
        OutlinedTextField(
            value = lastname,
            onValueChange = { lastname = it },
            label = { Text(text = "Enter Email") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription ="personIcon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(20.dp)
        )
        Spacer(modifier=Modifier.height(25.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Enter password") },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription ="PasswordIcon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(20.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value =confirmpassword,
            onValueChange = { confirmpassword = it },
            label = { Text(text = "Confirm password") },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription ="emailIcon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(20.dp)
        )
        Button(
            onClick = {navController.navigate(ROUTE_LOGIN) },
            modifier = Modifier.width(150.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue))
        {
            Text(
                text = "Register",
                fontFamily = FontFamily.SansSerif,
                fontSize = 25.sp,

            )

        }
        Spacer( modifier = Modifier.height(20.dp))
        Text(
            color = Color.Blue,
            text = "You have an account? Click here to LOGIN.",
            fontFamily = FontFamily.Serif,
            fontSize = 11.sp,
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_LOGIN)
                }
        )

    }

}

@Preview
@Composable
private fun Registrationpre() {
    Registration_Screen(rememberNavController())
    
}