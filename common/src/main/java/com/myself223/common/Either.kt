package com.myself223.common

sealed class Either<out A,out B> {
    class Left<out A>(val value:A):Either<A,Nothing>()
    class Right<out B>(val value:B):Either<Nothing,B>()
}