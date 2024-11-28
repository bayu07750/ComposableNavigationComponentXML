package com.bayu07750.composablenavigationcomponentxml

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.findFirstRoot
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.compose.LocalFragment
import androidx.navigation.fragment.findNavController
import java.util.UUID

@Composable
fun MainScreen() {
    val navController = LocalFragment.current.findNavController()

    Scaffold(modifier = Modifier) {
        Box(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .background(Color.Red),
            contentAlignment = Alignment.Center,
        ) {
            Button(onClick = {
                navController.navigate(
                    R.id.detail_screen,
                    bundleOf(KEY_ID to UUID.randomUUID().toString()),
                    NavOptions.Builder()
                        .setEnterAnim(androidx.navigation.ui.R.anim.nav_default_enter_anim)
                        .setExitAnim(androidx.navigation.ui.R.anim.nav_default_exit_anim)
                        .setPopExitAnim(androidx.navigation.ui.R.anim.nav_default_pop_exit_anim)
                        .setPopEnterAnim(androidx.navigation.ui.R.anim.nav_default_enter_anim)
                        .build()
                )
            }) {
                Text("Detail")
            }
        }
    }
}
