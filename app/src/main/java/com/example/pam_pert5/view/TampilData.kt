package com.example.pam_pert5.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TampilData(
    nama: String,
    jenisKelamin: String,
    alamat: String,
    onBackBtnClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Halaman Detail / Tampil Data")

        Spacer(modifier = Modifier.height(20.dp))

        // Menampilkan data yang dikirim
        Text(text = "Nama: $nama")
        Text(text = "Jenis Kelamin: $jenisKelamin")
        Text(text = "Alamat: $alamat")

        Spacer(modifier = Modifier.height(20.dp))

        // Tombol kembali
        Button(
            onClick = onBackBtnClick,
        ) {
            Text(text = "Kembali ke Form")
        }
    }
}
