package com.example.nonameapp.ui.signUp

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.nonameapp.R
import com.example.nonameapp.ui.signUp.signUpNavigation.BackHandler
import com.example.nonameapp.ui.signUp.signUpNavigation.SignUpRouter
import com.example.nonameapp.ui.signUp.signUpNavigation.SignUpScreen
import com.example.nonameapp.ui.signUp.tinyComposableElements.ButtonComponent
import com.example.nonameapp.ui.signUp.tinyComposableElements.DividerComponent
import com.example.nonameapp.ui.signUp.tinyComposableElements.FeatureListComponent
import com.example.nonameapp.ui.signUp.tinyComposableElements.FeaturePicture
import com.example.nonameapp.ui.signUp.tinyComposableElements.OrdinaryTextComponent
import com.example.nonameapp.ui.signUp.tinyComposableElements.PasswordTextFieldComponent
import com.example.nonameapp.ui.signUp.tinyComposableElements.SocialNetworksComponent
import com.example.nonameapp.ui.signUp.tinyComposableElements.TextFieldComponent
import com.example.nonameapp.ui.signUp.tinyComposableElements.ToLoginTextComponent
import com.example.nonameapp.ui.signUp.tinyComposableElements.ToRegisterTextComponent

@Composable
fun LoginComposable() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.White, Color.White),
                    startY = 0f,
                    endY = 1f
                )
            )
            .padding(0.dp)
            .verticalScroll(ScrollState(0))
    ) {
        BackHandler {
            SignUpRouter.navigateTo(SignUpScreen.RegistrationScreen)
        }
        FeatureListComponent(list = listOf<FeaturePicture>(
            FeaturePicture(R.drawable.japan, "vs"),
            FeaturePicture(R.drawable.noodles, "vs"),
            FeaturePicture(R.drawable.pizza, "vs"),
            FeaturePicture(R.drawable.sandwich, "vs"),
            FeaturePicture(R.drawable.breakfast, "vs"),
            FeaturePicture(R.drawable.burger, "vs"),
            FeaturePicture(R.drawable.chicken, "vs"),
        ),
            modifier = Modifier
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent)) {
            OrdinaryTextComponent(content = stringResource(id = R.string.hello), topPadding = 24)
            OrdinaryTextComponent(content = stringResource(id = R.string.welcome), topPadding = 8,
                size = 26,
                fontWeight = FontWeight.Bold,
                heightMin = 0)
            Spacer(modifier = Modifier.height(20.dp))
            TextFieldComponent(labelValue = stringResource(id = R.string.email),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
                onChangeTextAction = { },
                iconResource = {
                    Icon(
                        painter = painterResource(id = R.drawable.email1_icon),
                        contentDescription = ""
                    )
                })
            Spacer(modifier = Modifier.height(16.dp))
            PasswordTextFieldComponent(labelValue = stringResource(id = R.string.password),
                onChangeTextAction = {} )
            ButtonComponent(text = stringResource(id = R.string.login_button)) {

            }
            DividerComponent()
            SocialNetworksComponent(icon1 = ImageVector.vectorResource(R.drawable.google_icon),
                icon2 = ImageVector.vectorResource(R.drawable.facebook_icon),
                onIcon1Click = { /*TODO*/ },
                ) {
            }
            ToRegisterTextComponent()
        }
    }
}