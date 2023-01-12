package com.example.togglebutton

import android.app.Activity
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextHeading() {
    Text(
        "Select what you want to back up", style = TextStyle(
            fontSize = 32.sp
        ), fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, color = Color.Black,
        modifier = Modifier
            .width(200.dp)
            .padding(40.dp)
    )
}
@Composable
fun Buttonsalignment() {
    Column(
        modifier = Modifier
            .padding( top = 2.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        BackButton()


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp, top = 200.dp, bottom = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally)

        ) {
            Photo_Button()
            Vedio_Button()

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp, bottom = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally)

        ) {
            Doc_Button()
            Music_Button()
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp, bottom = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally)

        ) {
            Contacts_Button()
            Message_Button()
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 2.dp, bottom = 120.dp),
            horizontalArrangement = Arrangement.Center

        ) {
            CallHistory_Button()
        }
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.Bottom

        ) {
            BackUpSelectionButton()
        }

    }

    }




@Composable
fun BackButton(){
    val activity = (LocalContext.current as? Activity)
    IconButton(onClick = { activity?.finish() }) {
        Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "AddCircle Icon",
            tint = MaterialTheme.colors.secondary
        )
    }
}
@Composable
fun Photo_Button() {

    var isToggle by remember { mutableStateOf(false) }
    Box(contentAlignment = Center){
        Card (
            shape = RoundedCornerShape(25.dp),
            elevation = 0.dp,
            border = BorderStroke(1.dp, Color.LightGray),

            ){
            Box(modifier = Modifier
                .background(
                    if (isToggle) Color.White else Color.White
                )
                .clickable {
                    isToggle = !isToggle
                }, contentAlignment = Alignment.Center){
                if (isToggle){
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_check_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Photos" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_cancel_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
                } else{
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_add_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Photos" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))

                    }

                }
            }
        }
    }
}
@Composable
fun Vedio_Button() {

    var isToggle by remember { mutableStateOf(false) }
    Box(contentAlignment = Center){
        Card (
            shape = RoundedCornerShape(25.dp),
            elevation = 0.dp,
            border = BorderStroke(1.dp, Color.LightGray),

            ){
            Box(modifier = Modifier
                .background(
                    if (isToggle) Color.White else Color.White
                )
                .clickable {
                    isToggle = !isToggle
                }, contentAlignment = Alignment.Center){
                if (isToggle){
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_check_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Vedio" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_cancel_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
                } else{
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_add_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Vedio" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))

                    }

                }
            }
        }
    }
}
@Composable
fun Doc_Button() {

    var isToggle by remember { mutableStateOf(false) }
    Box(contentAlignment = Center){
        Card (
            shape = RoundedCornerShape(25.dp),
            elevation = 0.dp,
            border = BorderStroke(1.dp, Color.LightGray),

            ){
            Box(modifier = Modifier
                .background(
                    if (isToggle) Color.White else Color.White
                )
                .clickable {
                    isToggle = !isToggle
                }, contentAlignment = Alignment.Center){
                if (isToggle){
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_check_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Documents" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_cancel_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
                } else{
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_add_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Documents" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))

                    }

                }
            }
        }
    }
}
@Composable
fun Music_Button() {

    var isToggle by remember { mutableStateOf(false) }
    Box(contentAlignment = Center){
        Card (
            shape = RoundedCornerShape(25.dp),
            elevation = 0.dp,
            border = BorderStroke(1.dp, Color.LightGray),

            ){
            Box(modifier = Modifier
                .background(
                    if (isToggle) Color.White else Color.White
                )
                .clickable {
                    isToggle = !isToggle
                }, contentAlignment = Alignment.Center){
                if (isToggle){
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_check_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Music" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_cancel_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
                } else{
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_add_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Music" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))

                    }

                }
            }
        }
    }
}
@Composable
fun Contacts_Button() {

    var isToggle by remember { mutableStateOf(false) }
    Box(contentAlignment = Center){
        Card (
            shape = RoundedCornerShape(25.dp),
            elevation = 0.dp,
            border = BorderStroke(1.dp, Color.LightGray),

            ){
            Box(modifier = Modifier
                .background(
                    if (isToggle) Color.White else Color.White
                )
                .clickable {
                    isToggle = !isToggle
                }, contentAlignment = Alignment.Center){
                if (isToggle){
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_check_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Contacts" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_cancel_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
                } else{
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_add_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Contacts" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))

                    }

                }
            }
        }
    }
}
@Composable
fun Message_Button() {

    var isToggle by remember { mutableStateOf(false) }
    Box(contentAlignment = Center){
        Card (
            shape = RoundedCornerShape(25.dp),
            elevation = 0.dp,
            border = BorderStroke(1.dp, Color.LightGray),

            ){
            Box(modifier = Modifier
                .background(
                    if (isToggle) Color.White else Color.White
                )
                .clickable {
                    isToggle = !isToggle
                }, contentAlignment = Alignment.Center){
                if (isToggle){
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_check_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Messages" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_cancel_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
                } else{
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_add_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Messages" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))

                    }

                }
            }
        }
    }
}
@Composable
fun CallHistory_Button() {

    var isToggle by remember { mutableStateOf(false) }
    Box(contentAlignment = Center){
        Card (
            shape = RoundedCornerShape(25.dp),
            elevation = 0.dp,
            border = BorderStroke(1.dp, Color.LightGray),

            ){
            Box(modifier = Modifier
                .background(
                    if (isToggle) Color.White else Color.White
                )
                .clickable {
                    isToggle = !isToggle
                }, contentAlignment = Alignment.Center){
                if (isToggle){
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_check_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Call History" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_cancel_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )

                    }
                } else{
                    Row (
                        modifier = Modifier.padding(5.dp)
                    ){
                        Icon(painter = painterResource(id = R.drawable.ic_baseline_add_circle_24), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                        Text(text = "Call History" , style = TextStyle(
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400
                        ), color = Color.Black, modifier = Modifier
                            .padding(5.dp)
                            .align(CenterVertically))

                    }

                }
            }
        }
    }
}
@Composable
fun BackUpSelectionButton() {
    Column(
        modifier = Modifier
            .height(150.dp)
            .background(color = colorResource(android.R.color.holo_blue_dark))
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val context = LocalContext.current
            Button(
                onClick = {
                    Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier.padding(all = Dp(10F)),
                enabled = true,
                border = BorderStroke(width = 1.dp, brush = SolidColor(Color.White)),
                shape = RoundedCornerShape(25.dp),
            )
            {
                Text(
                    text = "Back up selected",
                    color = colorResource(android.R.color.holo_blue_dark),
                    fontWeight = FontWeight.Bold
                )
            }
            Text(
                "i'll do this later in Settings", style = TextStyle(
                    fontSize = 10.sp
                ), textAlign = TextAlign.Center, color = Color.White,
                modifier = Modifier.width(150.dp)
            )
        }
    }
    @Composable
    fun BackUpButton() {
        Column(
            modifier = Modifier
                .height(150.dp)
                .background(color = colorResource(android.R.color.holo_blue_dark))
        ) {
            Spacer(modifier = Modifier.weight(1f))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                val context = LocalContext.current
                Button(
                    onClick = {
                        Toast.makeText(context, "BackUp Options Selected", Toast.LENGTH_LONG).show()
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                    modifier = Modifier.padding(all = Dp(10F)),
                    enabled = true,
                    border = BorderStroke(width = 1.dp, brush = SolidColor(Color.White)),
                    shape = RoundedCornerShape(25.dp),
                )
                {
                    Text(
                        text = "Back up selected",
                        color = colorResource(android.R.color.holo_blue_dark),
                        fontWeight = FontWeight.Bold
                    )
                }
                Text(
                    "i'll do this later in Settings", style = TextStyle(
                        fontSize = 10.sp
                    ), textAlign = TextAlign.Center, color = Color.White,
                    modifier = Modifier.width(150.dp)
                )
            }
        }
    }
}
