package com.acorpas.tmdbmoviechallenge

import android.app.Application
import com.acorpas.tmdbmoviechallenge.moviesList.koinMoviesListModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author Mango
 * @version 1.0 2020-04-17
 */

class TMBDbMovieChallengeApp : Application() {

    private val koinModules = listOf(
        koinMoviesListModule
    )

    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }

    private fun initializeKoin() {
        startKoin {
            androidContext(this@TMBDbMovieChallengeApp)
            modules(koinModules)
        }
    }
}