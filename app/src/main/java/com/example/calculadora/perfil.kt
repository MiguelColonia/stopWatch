package com.example.calculadora
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.net.URL

@Composable
fun perfil() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {


        // agregar la imagen desde un archivo local
        val imageResource = painterResource(R.drawable.agustina)
        Image(
            painter = imageResource,
            contentDescription = "Imagen",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        // Agregar otros elementos de la interfaz de usuario debajo de la imagen
        Text(
            text = "Hola,como estás?",
            fontSize = 24.sp,
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(16.dp)
        )
    }
}
