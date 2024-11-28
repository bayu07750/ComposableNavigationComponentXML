package com.bayu07750.composablenavigationcomponentxml

import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.fragment.compose.LocalFragment

const val KEY_ID = "id_key"

@Composable
fun DetailScreen() {
    val args = LocalFragment.current.arguments ?: Bundle()
    val id = args.getString(KEY_ID).orEmpty()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        contentAlignment = Alignment.Center,
    ) {
        Text("Your id: $id")
    }
}