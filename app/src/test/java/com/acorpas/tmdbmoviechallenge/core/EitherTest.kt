package com.acorpas.tmdbmoviechallenge.core

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Test


/**
 * @author Mango
 * @version 1.0 2020-04-23
 */
class EitherTest {

    @Test
    fun `Either Right should return correct type`() {
        val result = Either.Right(TEST_STRING)

        assertTrue(result.isRight)
        assertFalse(result.isLeft)
        assertTrue(result.b == TEST_STRING)

    }

    @Test
    fun `Either Left should return correct type`() {
        val result = Either.Left(TEST_STRING)

        assertTrue(result.isLeft)
        assertFalse(result.isRight)
        assertTrue(result.a == TEST_STRING)
    }

    companion object {
        private const val TEST_STRING = "IronMan"
    }
}