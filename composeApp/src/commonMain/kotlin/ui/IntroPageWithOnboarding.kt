package ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.ui.tooling.preview.Preview

import kotlin.math.absoluteValue

@Composable
fun IntroPageWithOnboardingMain() {
    IntroPageWithOnboardingUi()
}
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun IntroPageWithOnboardingUi() {
    val state = rememberPagerState { 10 }
    HorizontalPager(
        beyondBoundsPageCount = 4,
        state = state,
        contentPadding = PaddingValues(horizontal = 32.dp),
        modifier = Modifier.fillMaxSize()
        ){ page ->
        Card(
            modifier = Modifier
                .graphicsLayer {
                    val pageOffset = (
                            (state.currentPage - page) + state
                                .currentPageOffsetFraction
                            ).absoluteValue
                    // We animate the scaleX + scaleY, between 85% and 100%
                    lerp(
                        start = 0.85f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale
                        scaleY = scale
                    }
                    alpha = lerp(
                        start = 0.5f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )
            }
        ) {
            Box(){
                Text("Page $page")
            }
        }

    }
}
@Composable
@Preview
fun IntroPageWithOnboardingPreview() {
    IntroPageWithOnboardingUi()
}


@OptIn(ExperimentalResourceApi::class)
@Composable
private fun ProfilePicture(modifier: Modifier = Modifier) {

//    Icon(imageResource(Res.drawable.kin) ,contentDescription = null)
    Card(
        modifier = modifier,
        shape = CircleShape,
        border = BorderStroke(4.dp, MaterialTheme.colorScheme.surface)
    ) {
//        Image(
////         painterResource(),
//
//            contentDescription = null,
//            modifier = Modifier.size(72.dp),
//        )
    }
}