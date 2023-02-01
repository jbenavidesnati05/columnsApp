package com.example.columnsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.columnsapp.ui.theme.ColumnsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}



@Preview
@Composable
fun app(){
    var counter by rememberSaveable{ mutableStateOf(0) }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)){
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        );
        Row(modifier = Modifier.padding(top = 4.dp)) {
            Image(
                painter = painterResource(id = R.drawable.baseline_favorite_24),
                contentDescription = "like",
                modifier = Modifier.clickable { counter++ }
                )
            Text(text = counter.toString(), color = Color.White,
                modifier = Modifier.padding(start = 4.dp),
                fontSize = 20.sp,
            )
        }

        Text(text = "JORGE",
            fontSize = 42.sp,
            color= Color.White,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        );
        Text(text = "Benavides ",
            color= Color.White,
            fontSize = 32.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        );
        Text(text = "Nati ",
            color= Color.White,
            fontSize = 32.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        );
        Row (horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth() )
        {
            Text(text = "STACK TECH:",color = Color.Red)
            Text(text = "java",color = Color.Red)
            Text(text = "KOTLIN",color = Color.Red)

        }

    }
}
