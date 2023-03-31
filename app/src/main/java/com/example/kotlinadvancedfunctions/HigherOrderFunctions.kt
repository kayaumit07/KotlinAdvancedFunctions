package com.example.kotlinadvancedfunctions

fun main(){

    //Filter
    println("hello")
    val myNumList= listOf(1,3,5,7,9,11,13,15)
    val smallNumList = myNumList.filter{ it < 6}
    for (num in smallNumList){
        println(num)
    }


    //Map
    println("\n *********************** \n ***** Map Section *****   \n ***********************")
    val squeredNumber= myNumList.map {num-> num*num }
    for (num in squeredNumber){
        println(num)
    }


    //Map and Filter Combined
    println("\n *********************** \n **** Map and Filter ****   \n ***********************")
    val filteredSqueredNumber =  myNumList.filter { it <6 }.map {it*it}
    for (num in filteredSqueredNumber){
        println(num)
    }

    val musician = listOf<Musician>(
        Musician("James",60,"Guitar"),
        Musician("Lars",55,"Drum"),
        Musician("Kirk",50,"Guitar")
    )

    val onlyInstrumentOfMusician= musician.filter { it.age < 60 }.map { it.instrument }
    for (instrument in onlyInstrumentOfMusician)
    {
        println(instrument)
    }

}

data class Musician(val name:String,val age:Int,val instrument:String){

}