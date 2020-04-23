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
        val result = Either.Right("IronMan")

        assertTrue(result.isRight)
        assertFalse(result.isLeft)
        assertTrue(result.b == "IronMan")

    }

    @Test
    fun `Either Left should return correct type`() {
        val result = Either.Left("IronMan")

        assertTrue(result.isLeft)
        assertFalse(result.isRight)
        assertTrue(result.a == "IronMan")
    }
}