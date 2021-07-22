package com.example.composable_column_row_box_concepts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composable_column_row_box_concepts.ui.theme.Composable_Column_Row_Box_ConceptsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composable_Column_Row_Box_ConceptsTheme {
                MainScreen()

            }
        }
    }
}

@Composable
fun MainScreen() {
  /*  Column() {
        Text(text = "Hello Android!",color = Color.Red
            ,fontStyle = FontStyle.Italic
            ,fontWeight = FontWeight.Bold
            ,fontSize = 22.sp
            ,overflow = TextOverflow.Visible)
        Text(text = "Hello World!",color = Color.Magenta
            ,fontStyle = FontStyle.Normal
            ,fontWeight = FontWeight.Black
            ,fontSize = 20.sp
            ,overflow = TextOverflow.Visible)
    }
    Row() {
        Text(text = "Hello Android!",color = Color.Red
            ,fontStyle = FontStyle.Italic
            ,fontWeight = FontWeight.Bold
            ,fontSize = 22.sp
            ,overflow = TextOverflow.Visible)
        Text(text = "Hello World!",color = Color.Magenta
            ,fontStyle = FontStyle.Normal
            ,fontWeight = FontWeight.Black
            ,fontSize = 20.sp
            ,overflow = TextOverflow.Visible)
    }*/
    Box() {
        Text(text = "Hello Android!",color = Color.Red
            ,fontStyle = FontStyle.Italic
            ,fontWeight = FontWeight.Bold
            ,fontSize = 22.sp
            ,overflow = TextOverflow.Visible)
        Text(text = "Hello World!",color = Color.Magenta
            ,fontStyle = FontStyle.Normal
            ,fontWeight = FontWeight.Black
            ,fontSize = 20.sp
            ,overflow = TextOverflow.Visible)
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}