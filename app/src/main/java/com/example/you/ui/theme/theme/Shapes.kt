package com.example.you.ui.theme.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

class Shapes {
    val shapes = Shapes(
        small = RoundedCornerShape(50.dp),
        medium = RoundedCornerShape(bottomStart = 16.dp, topEnd = 16.dp)
    )
}