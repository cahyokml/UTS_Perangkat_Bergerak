package com.example.utsperangkatbergerak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.utsperangkatbergerak.ui.theme.UTSPerangkatBergerakTheme

class UlangTahun : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UTSPerangkatBergerakTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayCard(
                        nama = "Rina",
                        pengirim = "Dari: Ahmad",
                        pesan = "Semoga hari ulang tahunmu penuh kebahagiaan dan senyum!"
                    )
                }
            }
        }
    }
}

@Composable
fun BirthdayCard(nama: String, pengirim: String, pesan: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF8E1))  // background krem muda
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Happy Birthday, $nama!",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = pesan,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 24.dp)
        )
        Text(
            text = pengirim,
            fontSize = 16.sp,
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBirthdayCard() {
    UTSPerangkatBergerakTheme {
        BirthdayCard(
            nama = "Rina",
            pengirim = "Dari: Ahmad",
            pesan = "Semoga hari ulang tahunmu penuh kebahagiaan dan senyum!"
        )
    }
}