package com.example.salim

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.salim.ui.theme.SalimTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class splashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Splash()
            //Delay code
            val mContext = LocalContext.current
            val coroutine = rememberCoroutineScope()
            coroutine.launch {
                delay(2000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                finish()
             //End of Delay code
            }

        }
    }
}

@Composable
fun Splash(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {

        Spacer(modifier = Modifier.height(300.dp))


        Box(modifier = Modifier
            .fillMaxWidth(), contentAlignment = Alignment.Center){

            Image(
                painter = painterResource(id = R.drawable.liont),
                contentDescription ="register",
                modifier = Modifier
                    .size(200.dp)
                    .padding(end = 1.dp, start = 1.dp)
            )
        }
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center ){
            Text(
                text = "tour guide...Your Option",
                fontFamily = FontFamily.SansSerif,
                color = Color.Gray,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 15.sp
            )
        }

        Spacer(modifier = Modifier.height(10.dp))
       /* Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center ){
            Text(
                text = "Welcome...",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.White
            )
        }*/
        Spacer(modifier = Modifier.height(10.dp))

    }

}


@Preview(showBackground = true)
@Composable
fun MySplashPreview(){
    Splash()

}
