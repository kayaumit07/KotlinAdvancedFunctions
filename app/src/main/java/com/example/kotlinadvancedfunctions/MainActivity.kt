package com.example.kotlinadvancedfunctions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var myInt: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (myInt != null) {
            val num = myInt!! + 1
            println(num)
        }

        //LET

        myInt?.let {
            val num = it + 1
        }

        val myNum = myInt?.let {
            val num = it + 1
        } ?: 0


        //ALSO soldakileri yaptın bi de also ları yap
        val umit = Person("Umit", 31)
        val onur = Person("Onur", 29)
        val sevki = Person("Sevki", 65)

        val people = listOf<Person>(umit, onur, sevki)
        people.filter { it.age > 18 }.also {
            for (person in it) {
                println(person.name)
            }
        }

        //Apply
        val intent = Intent()
        intent.putExtra("", "")
        intent.putExtra("", "")
        intent.`package` = ""
        intent.action = ""

        //Apply with Intent instead of intent.PutExtra
        val intentWithApply = Intent().apply {
            putExtra("", "")
            putExtra("", "")
            `package` = ""
            action = ""

        }

        //With
        Person("barley", 4).apply {
            name = "Barley"
        }.also {
            println(it.name)
        }

        val newBarley = Person("Bar", 4).apply {
            name = "Barley"
        }
        println(newBarley.name)

        val anotherBarley = with(Person("arley", 4)) {
            name = "Barley"
        }
        println(anotherBarley) /// -> NO ACTION | you can not create new state use with like this

        val withBarley = Person("arley", 4)
        with(withBarley) {
            name = "Barley"
            age = 5
        }
        println("last barley: " + withBarley.name) //-> ACTION OK | You can create new state like this

    }
}

data class Person(var name: String, var age: Int)