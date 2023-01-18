package com.example.togglebutton


import android.app.Activity
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.Icon as Icon1
import androidx.compose.ui.platform.LocalContext

val cardVisible = mutableStateOf(true)
@Composable
fun TipCard() {


    val cornerRadius = 20.dp

    val whiteColor = Color.White


    if (cardVisible.value) {


        Card(backgroundColor = Color(0xFF263238),modifier = Modifier
            .padding(bottom = 500.dp, top = 10.dp, start = 10.dp, end = 10.dp)
            .clip(RoundedCornerShape(cornerRadius))) {
            Column(modifier = Modifier.padding(start = 10.dp, top = 8.dp, bottom = 5.dp, end = 20.dp)) {

                Row {
                    Text(
                        "Stay In The Known",
                        style = TextStyle(color = whiteColor, fontSize = 25.sp),
                        modifier = Modifier.padding(top = 2.dp, bottom = 8.dp)
                    )

                    CrossIcon(modifier = Modifier.padding(20.dp)){

                    }
                }

                Row(modifier = Modifier
                    .padding(bottom = 2.dp))
                {
                    Column(modifier = Modifier.fillMaxWidth(0.6f)) {
                        Text(
                            "Capsyl would like to send you notifications so you can stay up to date with your backups, and more.",
                            style = TextStyle(color = Color.White, fontSize = 15.sp),
                            modifier = Modifier.padding( start=3.dp,end=5.dp)
                        )
                    }
                    Spacer(modifier = Modifier.weight(0.1f))
                    CardImage(modifier = Modifier.padding(start = 1.dp))

                }

                Button(onClick = { /* handle click here */ },
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .clip(RoundedCornerShape(30.dp)),

                    content = {
                        Text(
                            "Allow Notifications",
                            style = TextStyle(color = whiteColor, fontSize = 20.sp)
                        )
                    })
            }
        }
    }
}


@Composable
fun CrossIcon(modifier: Modifier = Modifier, onClick: () -> Unit) {
    IconButton(onClick = {cardVisible.value = false}) {
        Icon1(imageVector = Icons.Filled.Close,
            contentDescription ="" ,
            tint = Color.White,
            modifier = Modifier.padding(start = 100.dp)
        )
    }

}

@Composable
fun CardImage(modifier: Modifier=Modifier) {
    Image(
        painter = painterResource(id = R.drawable.image1),
        contentDescription = "Profile Picture Holder",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .height(80.dp)
            .padding(2.dp)
            .clip(RoundedCornerShape(20.dp))
    )
}









