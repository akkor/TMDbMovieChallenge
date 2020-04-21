package com.acorpas.tmdbmoviechallenge.splash

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.acorpas.tmdbmoviechallenge.R
import com.acorpas.tmdbmoviechallenge.moviesList.MoviesActivity
import java.util.concurrent.TimeUnit

/**
 * @author Mango
 * @version 1.0 2020-04-17
 */

class MainActivity : AppCompatActivity() {
    private val delayHandler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        delayHandler.postDelayed({
            navigateToMainScreen()
        }, SPLASH_DELAY)
    }

    private fun navigateToMainScreen() {
        val intent = MoviesActivity.callingIntent(this)
        startActivity(intent)
        finish()
    }

    companion object {
        private val SPLASH_DELAY = TimeUnit.SECONDS.toMillis(2)
    }
}