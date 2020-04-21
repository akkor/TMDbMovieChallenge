package com.acorpas.tmdbmoviechallenge.core

/**
 * @author Mango
 * @version 1.0 2020-04-21
 */

sealed class Failure {
    object NetworkConnection : Failure()
    object ServerError : Failure()

    /** * Extend this class for feature specific failures.*/
    abstract class FeatureFailure : Failure()
}