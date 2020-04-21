package com.acorpas.tmdbmoviechallenge.core.platform

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.acorpas.tmdbmoviechallenge.R
import com.acorpas.tmdbmoviechallenge.R.id
import com.acorpas.tmdbmoviechallenge.core.extension.inTransaction
import kotlinx.android.synthetic.main.toolbar.*

/**
 * Base Activity class with helper methods for handling fragment transactions and back button
 * events.
 *
 * @see AppCompatActivity
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        addFragment(savedInstanceState)
    }

    override fun onBackPressed() {
        (supportFragmentManager.findFragmentById(
            id.fragmentContainer
        ) as BaseFragment).onBackPressed()
        super.onBackPressed()
    }

    private fun addFragment(savedInstanceState: Bundle?) =
        savedInstanceState ?: supportFragmentManager.inTransaction {
            add(
                id.fragmentContainer, fragment()
            )
        }

    abstract fun fragment(): BaseFragment
}