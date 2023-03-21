package com.njeri.superwomenapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.njeri.superwomenapp.R

data class Hero(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val imageResourceId: Int
)


    val heroes = listOf(
        Hero(
           R.string.hero1,
             R.string.description1,
            R.drawable.dark_pocket
        ),
        Hero(
            R.string.hero2,
            R.string.description2,
            R.drawable.hourglass
        ),
        Hero(
           R.string.hero3,
           R.string.description3,
             R.drawable.architecture_document
        ),
        Hero(
            R.string.hero4,
             R.string.description4,
             R.drawable.money
        ),
        Hero(
             R.string.hero5,
            R.string.description5,
            R.drawable.vision_2372177_1920
        ),
        Hero(
            R.string.hero6,
             R.string.description6,
             R.drawable.goal_setting
        )
    )
