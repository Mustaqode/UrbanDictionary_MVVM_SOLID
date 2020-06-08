package dev.mustaq.domain.responseutil

import java.lang.Exception

/**
 * Created by Mustaq Sameer on 07/06/20
 */


/**
 * V - value, E - Exception
 */
sealed class Result<out V, out E> {

    data class Value<out V>(val value: V) : Result<V, Nothing>()
    data class Error<out E>(val error: E) : Result<Nothing, E>()

    companion object {
        inline fun <V> build(
            function: () -> V
        ): Result<V, Exception> =
            try {
                Value(function.invoke())
            } catch (e: Exception) {
                Error(e)
            }
    }
}