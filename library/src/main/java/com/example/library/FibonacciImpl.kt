package com.example.library

class FibonacciImpl : Fibonacci {

    override fun invoke(n: Int): Int =
        (2 until n).fold(1 to 1) { (prev, curr), _ -> curr to (prev + curr) }.second
}
