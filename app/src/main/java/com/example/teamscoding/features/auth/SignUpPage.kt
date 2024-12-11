package com.example.teamscoding.features.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teamscoding.R
import com.example.teamscoding.ui.theme.poppinsFontFamily

@Composable
fun SignUpPage() {
    var email by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showEmailError by remember { mutableStateOf(false) }
    var showUsernameError by remember { mutableStateOf(false) }
    var showPasswordError by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 40.dp, end = 40.dp, bottom = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(400.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.iconsignup),
                contentDescription = "Sign Up Illustration",
                modifier = Modifier.fillMaxSize()
            )
            Text(
                text = "SIGN UP",
                fontSize = 40.sp,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.W900,
                color = Color(0xFF2C5F2D),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(8.dp)
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        BasicTextField(
            value = email,
            onValueChange = {
                email = it
                showEmailError = email.isEmpty()
            },
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                .padding(15.dp),
            decorationBox = { innerTextField ->
                Box(modifier = Modifier.fillMaxWidth()) {
                    if (email.isEmpty()) {
                        Text(text = "Email", color = Color.Gray)
                    }
                    innerTextField()
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            maxLines = 1,
            singleLine = true
        )

        if (showEmailError) {
            Text(text = "Email cannot be empty", color = Color.Red, fontSize = 12.sp)
        }

        Spacer(modifier = Modifier.height(20.dp))

        BasicTextField(
            value = username,
            onValueChange = {
                username = it
                showUsernameError = username.isEmpty()
            },
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                .padding(15.dp),
            decorationBox = { innerTextField ->
                Box(modifier = Modifier.fillMaxWidth()) {
                    if (username.isEmpty()) {
                        Text(text = "Username", color = Color.Gray)
                    }
                    innerTextField()
                }
            },
            maxLines = 1,
            singleLine = true,
        )

        if (showUsernameError) {
            Text(text = "Username cannot be empty", color = Color.Red, fontSize = 12.sp)
        }

        Spacer(modifier = Modifier.height(20.dp))

        BasicTextField(
            value = password,
            onValueChange = {
                password = it
                showPasswordError = password.isEmpty()
            },
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
                .padding(15.dp),
            decorationBox = { innerTextField ->
                Box(modifier = Modifier.fillMaxWidth()) {
                    if (password.isEmpty()) {
                        Text(text = "Password", color = Color.Gray)
                    }
                    innerTextField()
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            maxLines = 1,
            singleLine = true,
            visualTransformation = PasswordVisualTransformation()
        )

        if (showPasswordError) {
            Text(text = "Password cannot be empty", color = Color.Red, fontFamily = poppinsFontFamily, fontSize = 12.sp)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                showEmailError = email.isEmpty()
                showUsernameError = username.isEmpty()
                showPasswordError = password.isEmpty()
                if (!showEmailError && !showUsernameError && !showPasswordError) {
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF08B28D))
        ) {
            Text(text = "Sign Up", color = Color.White, fontFamily = poppinsFontFamily,)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Already have an account? ",
                fontSize = 14.sp,
                fontFamily = poppinsFontFamily,
                color = Color.Black
            )
            Text(
                text = "Login",
                fontSize = 14.sp,
                fontFamily = poppinsFontFamily,
                color = Color.Blue
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun signUpPreview() {
    SignUpPage()
}
