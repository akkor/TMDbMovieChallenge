package com.acorpas.tmdbmoviechallenge.moviesList.presentation

import com.acorpas.tmdbmoviechallenge.R
import com.acorpas.tmdbmoviechallenge.core.platform.BaseFragment
import org.koin.android.ext.android.inject

/**
 * @author Mango
 * @version 1.0 2020-04-21
 */

class MoviesFragment : BaseFragment() {

    private val moviesListViewModel: MoviesListViewModel by inject()

    override fun layoutId() = R.layout.fragment_movies

}