package com.FinalPackage

fun main() {
    val name="pavan"
    if(name is String){
        println("The name is $name")
    }else{
        println("Not a string")
    }
    var Name = "Aishu"
    if(Name is String){
        println(Name.length)
        print(Name)
    }
}