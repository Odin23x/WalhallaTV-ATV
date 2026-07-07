package org.jellyfin.androidtv.ui.startup.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.offset
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.fragment.compose.content
import org.jellyfin.androidtv.R
import org.jellyfin.androidtv.ui.base.JellyfinTheme
import org.jellyfin.androidtv.ui.base.Text

@Composable
fun SplashScreen() {
	Box(modifier = Modifier.fillMaxSize()) {
		Image(
			painter = painterResource(R.drawable.splash_banner),
			contentDescription = null,
			modifier = Modifier.fillMaxSize(),
			contentScale = ContentScale.Crop,
		)
		Box(
			modifier = Modifier
				.fillMaxWidth()
				.padding(top = 48.dp),
			contentAlignment = Alignment.TopCenter,
		) {
			// Black outline effect: multiple offset copies behind the gold text
			val offsets = listOf(
				-2.dp to -2.dp, 2.dp to -2.dp, -2.dp to 2.dp, 2.dp to 2.dp,
				0.dp to -2.dp, 0.dp to 2.dp, -2.dp to 0.dp, 2.dp to 0.dp,
			)
			offsets.forEach { (x, y) ->
				Text(
					text = "Walhalla.TV",
					color = Color.Black,
					fontSize = 72.sp,
					fontFamily = FontFamily(Font(R.font.unifraktur_maguntia)),
					textAlign = TextAlign.Center,
					modifier = Modifier.offset(x = x, y = y),
				)
			}
			Text(
				text = "Walhalla.TV",
				color = Color(0xFFF0C060),
				fontSize = 72.sp,
				fontFamily = FontFamily(Font(R.font.unifraktur_maguntia)),
				textAlign = TextAlign.Center,
			)
		}
	}
}

class SplashFragment : Fragment() {
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	) = content {
		JellyfinTheme {
			SplashScreen()
		}
	}
}
