package com.example.salim

import android.content.Intent
import android.media.Image
import android.os.Bundle
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.salim.ui.theme.SalimTheme

class woof : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Woof()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Woof(){
    var koda by remember { mutableStateOf("") }
    var Lola by remember { mutableStateOf("") }
    var Frankie by remember { mutableStateOf("") }
    var Nox by remember { mutableStateOf("") }
    var Faye by remember { mutableStateOf("") }
    var Bella by remember { mutableStateOf("") }
    var Moana by remember { mutableStateOf("") }
    var Tzeitel by remember { mutableStateOf("") }


    Column(modifier = Modifier.fillMaxSize()) {
        Row {
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center){
                Text(text = "Woof",
                    modifier = Modifier.padding(start = 160.dp),
                    fontSize = 35.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold)


                Box(modifier = Modifier
                    .fillMaxWidth(), contentAlignment = Alignment.Center){

                    Image(
                        painter = painterResource(id = R.drawable.dogpaw),
                        contentDescription ="register",
                        modifier = Modifier
                            .size(90.dp)
                            .padding(end = 10.dp, start = 10.dp)

                    )
                }
            }
        }
        //Start of textfield
        TextField(

            value =koda ,
            onValueChange ={koda = it},
            placeholder = { Column {
                Text(text = "Koda", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(text = "2 years old", fontSize = 10.sp)
            } },
            leadingIcon = { androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .height(70.dp)

        )
        //End of textfield
        Spacer(modifier = Modifier.height(10.dp))

        //Start of textfield
        TextField(

            value =Lola ,
            onValueChange ={Lola = it},
            placeholder = { Column {
                Text(text = "Lola", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(text = "2 years old", fontSize = 10.sp)
            } },
            leadingIcon = { androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .height(70.dp)

        )
        //End of textfield
        Spacer(modifier = Modifier.height(10.dp))
        //Start of textfield
        TextField(

            value =Frankie ,
            onValueChange ={Frankie = it},
            placeholder = { Column {
                Text(text = "Frankie", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(text = "2 years old", fontSize = 10.sp)
            } },
            leadingIcon = { androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .height(70.dp)

        )
        //End of textfield
        Spacer(modifier = Modifier.height(10.dp))
        //Start of textfield
        TextField(

            value =Nox ,
            onValueChange ={Nox = it},
            placeholder = { Column {
                Text(text = "Nox", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(text = "2 years old", fontSize = 10.sp)
            } },
            leadingIcon = { androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .height(70.dp)

        )
        //End of textfield
        Spacer(modifier = Modifier.height(10.dp))
        //Start of textfield
        TextField(

            value =Faye ,
            onValueChange ={Faye = it},
            placeholder = { Column {
                Text(text = "Faye", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(text = "2 years old", fontSize = 10.sp)
            } },
            leadingIcon = { androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .height(70.dp)

        )
        //End of textfield
        Spacer(modifier = Modifier.height(10.dp))
        //Start of textfield
        TextField(

            value =Bella ,
            onValueChange ={Bella = it},
            placeholder = { Column {
                Text(text = "Bella", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(text = "2 years old", fontSize = 10.sp)
            } },
            leadingIcon = { androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .height(70.dp)

        )
        //End of textfield
        Spacer(modifier = Modifier.height(10.dp))
        //Start of textfield
        TextField(

            value =Moana ,
            onValueChange ={Moana = it},
            placeholder = { Column {
                Text(text = "Moana", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(text = "2 years old", fontSize = 10.sp)
            } },
            leadingIcon = { androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .height(70.dp)

        )
        //End of textfield
        Spacer(modifier = Modifier.height(10.dp))
        //Start of textfield
        TextField(

            value =Tzeitel ,
            onValueChange ={Tzeitel = it},
            placeholder = { Column {
                Text(text = "Tzeitel", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(text = "2 years old", fontSize = 10.sp)
            } },
            leadingIcon = { androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .height(70.dp)

        )
        //End of textfield
        Spacer(modifier = Modifier.height(10.dp))
        //Start of textfield
        TextField(

            value =koda ,
            onValueChange ={koda = it},
            placeholder = { Column {
                Text(text = "Koda", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(0.5.dp))
                Text(text = "2 years old", fontSize = 10.sp)
            } },
            leadingIcon = { androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.camera),
                contentDescription ="High 2",
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            }
            ,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .height(70.dp)

        )
        //End of textfield
        Spacer(modifier = Modifier.height(10.dp))
















    }

}

@Preview(showBackground = true)
@Composable
fun WoofPreview(){
    Woof()

}