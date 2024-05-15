package com.example.salim

import android.content.Intent
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri

class ExploreActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Explore()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Explore() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val mContext = LocalContext.current
        TopAppBar(
            title = {
                Text(
                    text = "Cities",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            },
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))
                })
                {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "arrow back",
                        tint = Color.Black
                    )
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "share",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "search",
                        tint = Color.Black
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notification",
                        tint = Color.Black
                    )
                }
            }, colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White)
        )
        //End of top bar
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(20.dp,20.dp,)
        ) {
            Text(
                text = "Tickets",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 20.dp, end = 20.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            //column 1
            Row {
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.germany),
                                contentDescription = "germany",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )
                        }
                    }
                    //End of column 1
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Colosseum",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "433 reviews",
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From Ksh 40,000",
                        color = Color.Blue,
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0114730095".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        })
                        {
                            Text(text = "Email")

                        }
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.rob),
                                contentDescription = "germany",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )
                        }
                    }
                    //End of column 1
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Nairobi",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "433 reviews",
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From Ksh 40,000",
                        color = Color.Blue,
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0114730095".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        })
                        {
                            Text(text = "Email")

                        }
                    }



                }

            }
            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.ii),
                                contentDescription = "germany",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )
                        }
                    }
                    //End of column 1
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Germany",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "433 reviews",
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From Ksh 40,000",
                        color = Color.Blue,
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0114730095".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        })
                        {
                            Text(text = "Email")

                        }
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.nai),
                                contentDescription = "germany",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )
                        }
                    }
                    //End of column 1
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "HongKong",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "433 reviews",
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From Ksh 40,000",
                        color = Color.Blue,
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0114730095".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        })
                        {
                            Text(text = "Email")

                        }
                    }



                }

            }


            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.usa),
                                contentDescription = "germany",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )
                        }
                    }
                    //End of column 1
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "USA",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "433 reviews",
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From Ksh 40,000",
                        color = Color.Blue,
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0114730095".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        })
                        {
                            Text(text = "Email")

                        }
                    }
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth()) {
                            Image(
                                painter = painterResource(id = R.drawable.tra2),
                                contentDescription = "germany",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "favorite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(10.dp)
                            )
                        }
                    }
                    //End of column 1
                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = "Hawaiii",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.ExtraBold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Row {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "star",
                            tint = Color.Red
                        )
                    }
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "433 reviews",
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "From Ksh 40,000",
                        color = Color.Blue,
                        fontSize = 12.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(2.dp))

                    Row {
                        OutlinedButton(onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0114730095".toUri()
                            mContext.startActivity(callIntent)
                        })
                        {
                            Text(text = "Call")
                        }
                        Spacer(modifier = Modifier.width(2.dp))

                        OutlinedButton(onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                            mContext.startActivity(shareIntent)
                        })
                        {
                            Text(text = "Email")

                        }
                    }



                }

            }



















        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyExplorePreview(){
    Explore()
}
