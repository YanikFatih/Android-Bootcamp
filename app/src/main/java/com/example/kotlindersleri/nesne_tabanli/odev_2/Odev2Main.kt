package com.example.kotlindersleri.nesne_tabanli.odev_2

fun main() {
    var f = Odev2() //creating an object from Odev2 class

    //kmToMile() function usage
    println("Enter the km value : ")
    var km = readLine()!!.toInt()
    var mile = f.kmToMile(km)
    println("The mile value : $mile")

    //rectangeArea() function usage
    println("Enter the edges of the rectangle :")
    println("First edge :")
    var edge1 = readLine()!!.toDouble()
    println("Second edge :")
    var edge2 = readLine()!!.toDouble()
    var rectangleArea = f.rectangleArea(edge1,edge2)
    println("The area of the rectangle : $rectangleArea")

    //factorial() function usage
    println("Enter a number to calculate it's factorial : ")
    var num = readLine()!!.toInt()
    var factorial = f.factorial(num)
    println("Factorial of $num = $factorial")

    //howManyE() function usage
    println("Enter a word to find how many 'e' it includes : ")
    var world = readLine()!!
    var eNumber = f.howManyE(world)
    println("e count in $world : $eNumber")

    //interiorAngles() function usage
    println("Enter the edge number to find the value of an interior angle : ")
    var edgeNumber = readLine()!!.toInt()
    var interiorAngles = f.interiorAngles(edgeNumber)
    println("Single interior angle value : $interiorAngles")

    //calculateSalary() function usage
    println("Enter the number of work days to calculate salary : ")
    var dayNum = readLine()!!.toInt()
    var salary = f.calculateSalary(dayNum)
    println("Salary : $salary ₺")

    //calculateParkingPrice() function usage
    println("Enter the parking hour to calculate the price : ")
    var hour = readLine()!!.toInt()
    var parkingPrice =  f.calculateParkingPrice(hour)
    println("Parking price : $parkingPrice ₺")
}