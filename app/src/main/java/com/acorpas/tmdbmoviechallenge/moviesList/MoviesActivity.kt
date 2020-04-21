package com.acorpas.tmdbmoviechallenge.moviesList

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.acorpas.tmdbmoviechallenge.R
import com.acorpas.tmdbmoviechallenge.core.platform.BaseActivity
import com.acorpas.tmdbmoviechallenge.core.platform.BaseFragment

class MoviesActivity : BaseActivity() {

    override fun fragment() = MoviesFragment()


    companion object {
        fun callingIntent(context: Context) = Intent(context, MoviesActivity::class.java)
    }
}
