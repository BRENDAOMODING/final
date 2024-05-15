package com.example.salim

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.salim.ui.theme.Pink80
import com.example.salim.ui.theme.SalimTheme

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Third()

        }
    }
}

@Composable
fun Third(){
    val mContext = LocalContext.current
    Column (modifier = Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(50.dp,),
            contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(300.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
        }

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center ){
            Text(
                text = "Pay by Cart",
                fontFamily = FontFamily.SansSerif,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp),
            contentAlignment = Alignment.Center )
        {
            Text(
                text = "The car is considered an essential part of the developed economy. Cars have controls for driving, parking, passenger comfort, and a variety of lamps. Over the decades, additional features and controls have been added to vehicles, making them progressively more complex.",
                fontFamily = FontFamily.SansSerif,
                color = Color.Gray,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 15.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Button(onClick = {
                mContext.startActivity(Intent(mContext,FunitureActivity::class.java))
            },
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(Pink80),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp)
            )
            {
                Text(text = "Next",
                    fontWeight = FontWeight.Bold,)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyThirdPreview(){
    Third()
}
