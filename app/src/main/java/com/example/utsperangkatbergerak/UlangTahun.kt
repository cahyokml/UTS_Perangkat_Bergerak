package com.example.utsperangkatbergerak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
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
    // Warna gradasi background
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFFFFC1CC), // pink lembut
            Color(0xFFFFF8E1)  // krem muda
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradientBrush),
        contentAlignment = Alignment.Center
    ) {
        // Kartu utama
        Surface(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
                .wrapContentHeight()
                .shadow(12.dp, RoundedCornerShape(24.dp)),
            shape = RoundedCornerShape(24.dp),
            color = Color.White.copy(alpha = 0.95f)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Selamat Ulang Tahun Satya 🎉",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFFEC407A),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 12.dp)
                )

                Text(
                    text = nama,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF5D4037),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                Text(
                    text = pesan,
                    fontSize = 18.sp,
                    color = Color(0xFF4E342E),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 32.dp, start = 8.dp, end = 8.dp)
                )

                Divider(
                    color = Color(0xFFFFCDD2),
                    thickness = 1.dp,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth(0.6f)
                )

                Text(
                    text = pengirim,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF6D4C41),
                    textAlign = TextAlign.End,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewBirthdayCard() {
    UTSPerangkatBergerakTheme {
        BirthdayCard(
            nama = "To: Satya",
            pengirim = "Dari: Cahyo",
            pesan = "Semoga hari ulang tahunmu penuh kebahagiaan dan senyum, peace out men!"
        )
    }
}
