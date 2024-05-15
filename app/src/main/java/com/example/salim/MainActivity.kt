package com.example.salim

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.salim.ui.theme.SalimTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
   Column(modifier = Modifier.fillMaxSize()) {

       val mContext = LocalContext.current

       Text(text = "Welcome to our tour guide",
           fontSize = 30.sp,
           color = Color.Black,
           fontWeight = FontWeight.Bold,
           fontStyle = FontStyle.Normal,
           textDecoration = TextDecoration.Underline)
       Text(text = "Android is a mobile operating system based on a modified version of the Linux kernel and other open-source software, designed primarily for touchscreen mobile devices such as smartphones and tablets",
       fontSize = 10.sp)
       Spacer(modifier = Modifier.height(20.dp))

       //Lottie Animation
       val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.contact))
       val progress by animateLottieCompositionAsState(composition)
       LottieAnimation(composition, progress,
           modifier = Modifier
               .size(250.dp)
               .padding(start = 100.dp)

       )
       //End of lottie Animation
       Spacer(modifier = Modifier.height(10.dp))
       Text(
           text = "Contact us",
           fontWeight = FontWeight.Bold,
           fontSize = 30.sp,
           modifier = Modifier.padding(start =100.dp)
       )




       Text(text = "Our Destinations",
           fontSize = 20.sp,
           modifier = Modifier
               .fillMaxWidth()
               .background(Color.Red)
               .height(30.dp)


           , textAlign = TextAlign.Center,
      color = Color.White, fontWeight = FontWeight.Bold )
       Text(text = "1.Nairobi")
       Text(text = "Kisumu")
       Text(text = "mombasa")
       Text(text = "Nakuru")
       Text(text = "Naivasha")

       Spacer(modifier = Modifier.height(20.dp))
       Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
           Button(onClick = {
               mContext.startActivity(Intent(mContext,DestinationActivity::class.java))
           },
               shape = RoundedCornerShape(5.dp),
               colors = ButtonDefaults.buttonColors(Color.Black),
               ) {
               Text(text = "Destination",
                   fontWeight = FontWeight.Bold,)
           }
       }
       Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
           Button(onClick = {
               mContext.startActivity(Intent(mContext,FirstActivity::class.java))
           },
               shape = RoundedCornerShape(5.dp),
               colors = ButtonDefaults.buttonColors(Color.Black),
           ) {
               Text(text = "Activities",
                   fontWeight = FontWeight.Bold,)
           }
       }


      Text(text = "Briefing about nice places",
          fontSize = 20.sp,
          modifier = Modifier
              .fillMaxWidth()
              .background(Color.Red)
              .height(30.dp),
          textAlign = TextAlign.Center,
          color = Color.White)
       Text(text = "The car is considered an essential part of the developed economy. Cars have controls for driving, parking, passenger comfort, and a variety of lamps. Over the decades, additional features and controls have been added to vehicles, making them progressively more complex.")
       Spacer(modifier = Modifier.height(10.dp))
       Divider()
       Spacer(modifier = Modifier.height(0.5.dp))
        Text(text = "tour guide application system",
           fontWeight = FontWeight.Bold,
           fontSize = 20.sp,
           modifier = Modifier
               .fillMaxWidth()
               .background(Color.Red)
               .height(30.dp),
           textAlign = TextAlign.Center,
           color = Color.White)
           Spacer(modifier = Modifier.height(20.dp))
         // centering an image
         Box(modifier = Modifier.fillMaxWidth(),
             contentAlignment = Alignment.Center) {
             Image(
                 painter = painterResource(id = R.drawable.camera),
                 contentDescription ="High 2",
                 modifier = Modifier
                     .size(200.dp)
                     .clip(shape = CircleShape),
                 contentScale = ContentScale.Crop
             )
         }
       Button(onClick = {
           mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
       },
           shape = RoundedCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Black),
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp)
               .padding(end = 30.dp)
       ) {
           Text(text = "Continue",
               fontWeight = FontWeight.Bold,)
       }
       Button(onClick = {
           mContext.startActivity(Intent(mContext,LottieActivity::class.java))
       },
           shape = RoundedCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Black),
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp)
               .padding(end = 30.dp)
       ) {
           Text(text = "Continue",
               fontWeight = FontWeight.Bold,)
       }
   }
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()

}