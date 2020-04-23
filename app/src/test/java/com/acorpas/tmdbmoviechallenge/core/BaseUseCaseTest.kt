package com.acorpas.tmdbmoviechallenge.core

import com.acorpas.tmdbmoviechallenge.CoroutineTestRule
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test

/**
 * @author Mango
 * @version 1.0 2020-04-22
 */

class BaseUseCaseTest {

    @ExperimentalCoroutinesApi
    @get:Rule
    val coroutineTestRule = CoroutineTestRule()

    private val useCase = MyUseCase()

    @Test
    fun `running use case should return 'Either' of use case type`() {
        val params = MyParams(TYPE_PARAM)
        val result = runBlocking { useCase.run(params) }

        assertThat(result.b).isEqualTo(MyType(TYPE_TEST))
    }

    @Test
    fun `should return correct data when executing use case`() {
        var result: Either<Failure, MyType>? = null

        val params = MyParams("TestParam")
        val onResult = { myResult: Either<Failure, MyType> ->
            result = myResult
        }

        runBlockingTest { useCase(params, onResult) }

        assertThat(result).isEqualTo(Either.Right(MyType(TYPE_TEST)))
    }

    data class MyType(val name: String)
    data class MyParams(val name: String)
    private inner class MyUseCase : BaseUseCase<MyType, MyParams>() {
        override suspend fun run(params: MyParams) = Either.Right(MyType(TYPE_TEST))
    }

    companion object {
        private const val TYPE_TEST = "Test"
        private const val TYPE_PARAM = "ParamTest"
    }
}