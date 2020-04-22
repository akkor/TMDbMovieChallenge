package com.acorpas.tmdbmoviechallenge.moviesList

import com.acorpas.tmdbmoviechallenge.moviesList.presentation.MoviesListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * @author Mango
 * @version 1.0 2020-04-22
 */

val koinMoviesListModule = module {

    viewModel { MoviesListViewModel() }
}