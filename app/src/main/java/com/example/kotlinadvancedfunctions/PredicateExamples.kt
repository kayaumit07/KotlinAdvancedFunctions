package com.example.kotlinadvancedfunctions

fun main() {
    val myNumList= listOf<Int>(1,3,5,7,9,11,13,15)
    val allCheck= myNumList.all { it>5 }
    println("All Check is "+ allCheck)

    val anyCheck= myNumList.any { it>5 }
    println("Any Check is "+ anyCheck)

    val totalCount= myNumList.count { it>5 }
    println("Total Count "+ totalCount)

    //5'ten büyük İLK elemanı getir
    val findNum= myNumList.find { it>5 }
    println("Find Number "+ findNum)

    //5'ten büyük EN SON elemanı getir
    val findLastNum = myNumList.findLast { it> 5 }
    println("Find Last Number "+ findLastNum)

    val predicate= {num:Int -> num > 5}
    val allCheckWithPredicate= myNumList.all(predicate)
    println("All Check With Predicate" + allCheckWithPredicate)
}