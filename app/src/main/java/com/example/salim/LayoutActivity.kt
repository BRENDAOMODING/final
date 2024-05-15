package com.example.salim

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.salim.ui.theme.SalimTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.background),
            contentScale = ContentScale.FillBounds)) {



        val mContext = LocalContext.current
        //TopAppbar
        TopAppBar(
            title = { Text(text = "Home Screen",
                color = Color.White,
                fontWeight = FontWeight.Bold)},
                navigationIcon = {
                    IconButton(onClick = {
                        mContext.startActivity(Intent(mContext,MainActivity::class.java))

                    }) {
                        Icon(imageVector = Icons.Default.ArrowBack,
                            contentDescription ="arrow back",
                            tint = Color.White)
                    }
                },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription ="share",
                        tint = Color.White)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription ="settings",
                        tint = Color.White)
                }

            },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black)
        )
        //End of topAppBar
            Text(
                text = "Destinations",
                fontSize = 30.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Cursive
            )
        //First Row
        Row {
            Image(painter = painterResource(id = R.drawable.nai),
                contentDescription = "Nairobi",
                modifier = Modifier.size(width = 200.dp, height =150.dp )
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "Nairobi",
                    fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "The Nairobi City County is the creation of the Constitution of Kenya 2010 and successor of the defunct City Council of Nairobi.  ")

            }
        }
        //End of first Row
        Spacer(modifier = Modifier.width(10.dp))

        //Second Row
        Row {
            Image(painter = painterResource(id = R.drawable.ii),
                contentDescription = "Nairobi",
                modifier = Modifier.size(width = 200.dp, height =150.dp )
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "USA",
                    fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "The Nairobi City County is the creation of the Constitution of Kenya 2010 and successor of the defunct City Council of Nairobi.  ")

            }
        }
        //End of first Row
        Spacer(modifier = Modifier.width(15.dp))
        //Third Row
        Row {
            Image(painter = painterResource(id = R.drawable.germany),
                contentDescription = "Germany",
                modifier = Modifier.size(width = 200.dp, height =150.dp )
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(text = "Germany",
                    fontWeight = FontWeight.Bold, fontSize = 20.sp)
                Text(text = "The Nairobi City County is the creation of the Constitution of Kenya 2010 and successor of the defunct City Council of Nairobi.  ")

            }
        }
        //End of first Row






        Spacer(modifier = Modifier.height(25.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,IntentActivity::class.java))

        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "CONTINUE ",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp)
        }







    }

}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()

}