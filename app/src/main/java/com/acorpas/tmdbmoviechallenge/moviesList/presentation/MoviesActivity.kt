package com.acorpas.tmdbmoviechallenge.moviesList.presentation

import android.content.Context
import android.content.Intent
import com.acorpas.tmdbmoviechallenge.core.platform.BaseActivity

class MoviesActivity : BaseActivity() {

    override fun fragment() =
        MoviesFragment()


    companion object {
        fun callingIntent(context: Context) = Intent(context, MoviesActivity::class.java)
    }
}
