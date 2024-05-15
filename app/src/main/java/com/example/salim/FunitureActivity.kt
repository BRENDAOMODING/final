package com.example.salim

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import androidx.core.net.toUri
import com.example.salim.ui.theme.SalimTheme
import com.example.salim.ui.theme.jiv

class FunitureActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFuniture()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyFuniture() {
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.background),
        contentScale = ContentScale.FillBounds)) {
        val mContext = LocalContext.current
        TopAppBar(
            title = {

            },
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, ThirdActivity::class.java))
                })
                {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrow back",
                        tint = Color.Black
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "delete",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu",
                        tint = Color.Black
                    )
                }
            }, colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White)
        )
        //End of top bar


        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {


            ///Start of Row
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                Text(
                    text = "Chairs",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    text = "Tables",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    text = "Sofa",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Gray
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    text = "Beds",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Gray
                )
            }
            //End of Row


            Spacer(modifier = Modifier.height(20.dp))


            //Row
            Row(modifier = Modifier.fillMaxWidth()) {

                Text(
                    text = "120 Products",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 10.dp)
                )
                Spacer(modifier = Modifier.width(150.dp))
                Text(
                    text = "Popular",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 10.dp)
                )

                IconButton(onClick =
                {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))
                })
                {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "arrow back",
                        tint = Color.Black
                    )
                }
            }
            //End of Row
        }
        Row {
            Column() {
                Card(
                    modifier = Modifier
                        .height(250.dp)
                        .width(160.dp)
                )
                {
                    Box(modifier = Modifier.fillMaxWidth())
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chb),
                            contentDescription = "germany",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Amos Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Amos Chair is the only stable price ",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 15.dp),
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "$ 680",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 15.dp)
                    )
                }
                //End of column 1
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Amos Chair",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(2.dp))

                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Amos Chair is available",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp),
                    color = Color.Gray

                )

                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "$ 680",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    modifier = Modifier.padding(start = 15.dp)
                )

                Spacer(modifier = Modifier.height(2.dp))
            }
            Spacer(modifier = Modifier.width(30.dp))
            Column {
                Card(
                    modifier = Modifier
                        .height(250.dp)
                        .width(160.dp)
                )
                {
                    Box(modifier = Modifier.fillMaxWidth())
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chf),
                            contentDescription = "germany",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Amos Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Amos Chair is the only stable price ",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 15.dp),
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "$ 680",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 15.dp)
                    )
                }
                //End of column 1
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Amos Chair",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(2.dp))

                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Amos Chair is Available ",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 15.dp),
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "$ 680",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    modifier = Modifier.padding(start = 15.dp)
                )

                Spacer(modifier = Modifier.height(2.dp))
            }
        }
        //End of row two

        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Column() {
                Card(
                    modifier = Modifier
                        .height(250.dp)
                        .width(160.dp)
                )
                {
                    Box(modifier = Modifier.fillMaxWidth())
                    {
                        Image(
                            painter = painterResource(id = R.drawable.chac),
                            contentDescription = "germany",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Amos Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Amos Chair is the only stable price ",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 15.dp),
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "$ 680",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 15.dp)
                    )
                }
                //End of column 1
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Amos Chair",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(2.dp))

                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Amos Chair is available",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 10.dp),
                    color = Color.Gray

                )

                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "$ 680",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    modifier = Modifier.padding(start = 15.dp)
                )

                Spacer(modifier = Modifier.height(2.dp))
            }
            Spacer(modifier = Modifier.width(30.dp))
            Column {
                Card(
                    modifier = Modifier
                        .height(250.dp)
                        .width(160.dp)
                )
                {
                    Box(modifier = Modifier.fillMaxWidth())
                    {
                        Image(
                            painter = painterResource(id = R.drawable.che),
                            contentDescription = "germany",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Amos Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Amos Chair is the only stable price ",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 15.dp),
                        color = Color.Gray,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "$ 680",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Default,
                        modifier = Modifier.padding(start = 15.dp)
                    )
                }
                //End of column 1
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Amos Chair",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.ExtraBold
                )
                Spacer(modifier = Modifier.height(2.dp))

                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Amos Chair is Available ",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 15.dp),
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "$ 680",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Default,
                    modifier = Modifier.padding(start = 15.dp)
                )

                Spacer(modifier = Modifier.height(2.dp))
            }
        }
        //End of row two

    }


}
@Preview(showBackground = true)
        @Composable
        fun MyFuniturePreview() {
            MyFuniture()
        }

