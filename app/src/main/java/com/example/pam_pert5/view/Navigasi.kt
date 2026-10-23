package com.example.pam_pert5.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,
            modifier = Modifier.padding(isiRuang)
        ) {
            composable(route = Navigasi.FormulirSaya.name) {
                FormIsian(
                    onSubmitBtnClick = { data ->
                        // data[0] = Nama, data[1] = JK, data[2] = Alamat
                        // Kita buat rute dengan parameter, contoh: Detail/Muhammad/Laki-laki/Jambi
                        val nama = data.getOrNull(0) ?: ""
                        val jk = data.getOrNull(1) ?: ""
                        val alamat = data.getOrNull(2) ?: ""

                        navController.navigate("${Navigasi.Detail.name}/$nama/$jk/$alamat")
                    }
                )
            }

            // Menambahkan argumen pada rute Detail
            composable(
                route = "${Navigasi.Detail.name}/{nama}/{jk}/{alamat}",
                arguments = listOf(
                    navArgument("nama") { type = NavType.StringType },
                    navArgument("jk") { type = NavType.StringType },
                    navArgument("alamat") { type = NavType.StringType }
                )
            ) { backStackEntry ->
                // Mengambil data dari URL navigasi
                val nama = backStackEntry.arguments?.getString("nama") ?: ""
                val jk = backStackEntry.arguments?.getString("jk") ?: ""
                val alamat = backStackEntry.arguments?.getString("alamat") ?: ""
            }
        }
    }
}