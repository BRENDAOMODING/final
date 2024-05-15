package com.example.salim

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.salim.ui.theme.SalimTheme
import kotlin.math.E

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination() {
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext = LocalContext.current
        TopAppBar(
            title = {
                Text(
                    text = "Intents",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            },
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))
                })
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrow back",
                        tint = Color.White
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Place,
                        contentDescription = "place",
                        tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Favorite,
                        contentDescription = "favorite",
                        tint = Color.White
                    )
                }

            }, colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black)
        )
        //End of top bar

        //Start of box
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
           )
        {
        Image(painter = painterResource(id = R.drawable.rob),
            contentDescription = "love",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
            Text(text = "Let's Plan your next Vacation",
                fontSize =35.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center)

        }

        // end of box
        Spacer(modifier = Modifier.height(10.dp))
        var search by remember {
            mutableStateOf("")}
        OutlinedTextField(
            value =search ,
            onValueChange = {search = it},
            placeholder = { Text(text = "What is your current location?")},
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription ="search" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        )
        //End of search bar
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Recently Viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        // start of row
Row(modifier = Modifier
    .horizontalScroll(rememberScrollState())) {
    // start of card 1
    Card(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
    ){
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center)
            {
                Image(painter = painterResource(id = R.drawable.germany), contentDescription ="germany",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
            Text(text = "Boston",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
        }

    }
    //End of card 1
    Spacer(modifier = Modifier.width(10.dp))
    // start of card 1
    Card(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
    ){
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center)
            {
                Image(painter = painterResource(id = R.drawable.germany), contentDescription ="germany",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
            Text(text = "Boston",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
        }

    }
    //End of card 1
    Spacer(modifier = Modifier.width(10.dp))
    // start of card 1
    Card(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
    ){
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center)
            {
                Image(painter = painterResource(id = R.drawable.germany), contentDescription ="germany",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
            Text(text = "Boston",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
        }

    }
    //End of card 1
    Spacer(modifier = Modifier.width(10.dp))
    // start of card 1
    Card(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
    ){
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center)
            {
                Image(painter = painterResource(id = R.drawable.germany), contentDescription ="germany",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
            Text(text = "Boston",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
        }

    }
    //End of card 1
    Spacer(modifier = Modifier.width(10.dp))
    // start of card 1
    Card(modifier = Modifier
        .height(200.dp)
        .width(200.dp)
    ){
        Column {
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
                contentAlignment = Alignment.Center)
            {
                Image(painter = painterResource(id = R.drawable.germany), contentDescription ="germany",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
            Text(text = "Boston",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
        }

    }
    //End of card 1
    Spacer(modifier = Modifier.width(10.dp))
}
        //End of row
Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Button(onClick = {
                mContext.startActivity(Intent(mContext,ExploreActivity::class.java))
            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.LightGray),
            ) {
                Text(text = "Destination",
                    fontWeight = FontWeight.ExtraBold, color = Color.Black)
            }
        }


    }
  }


@Preview(showBackground = true)
@Composable
fun MyDestination(){
    Destination()

}