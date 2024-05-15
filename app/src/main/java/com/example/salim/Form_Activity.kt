package com.example.salim

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.salim.ui.theme.SalimTheme

class Form_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyForm()

        }
    }
}
//Screen Display
@Composable
fun MyForm (){
    var firstname by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var contact by remember { mutableStateOf("") }

    val mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.love),
            contentScale = ContentScale.FillBounds

        )) {
        Box(modifier = Modifier
            .fillMaxWidth(), contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.register),
                contentDescription ="register",
                modifier = Modifier
                    .size(150.dp)
            )
        }
        Spacer(modifier = Modifier.height(0.5.dp))

         Text(
            text = "Register an Account",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
             modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
         )


        Spacer(modifier = Modifier.height(0.5.dp))

        TextField(
            value =firstname ,
            onValueChange ={firstname = it},
            placeholder = { Text(text = "Enter your firstname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person,
                contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value =lastname ,
            onValueChange ={lastname = it},
            placeholder = { Text(text = "Enter your Lastname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person,
                contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value =email ,
            onValueChange ={email = it},
            placeholder = { Text(text = "Enter your Email")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email,
                contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value =password ,
            onValueChange ={password = it},
            placeholder = { Text(text = "Enter your password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock,
                contentDescription = "lock")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value =contact ,
            onValueChange ={contact = it},
            placeholder = { Text(text = "Enter your contact")},
            leadingIcon = { Icon(imageVector = Icons.Default.Call,
                contentDescription = "call")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp),
            colors =  ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
                .padding(end = 30.dp)
        ) {
            Text(
                text = "Register",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black)
            
        }
        Text(
            text = "Already have an account? Sign in!",
            fontSize = 15.sp,
            fontFamily = FontFamily.Default,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    mContext.startActivity(Intent(mContext,Sign_up_Activity::class.java))
                },
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color.Green,
            fontStyle = FontStyle.Italic
        )





    }
}



@Preview(showBackground = true)
@Composable
fun MyFormPreview(){
    MyForm()
}