package com.example.kotlindersleri.nesne_tabanli.odev_2

class Odev2 {
    fun kmToMile(kmValue:Int) : Double  {
        var mileValue = kmValue * 0.621 //
        return mileValue
    }

    fun rectangleArea(edge1:Double, edge2:Double) : Double {
        var rectangeArea = edge1 * edge2
        return rectangeArea
    }

    fun factorial(num:Int) : Int {
        if (num == 1) {
            return 1
        } else {
            return num * factorial(num - 1)
        }
    }

    fun howManyE(word:String) : Int {
        var count = 0
        for (i in word) {
            if (i == 'e') {
                count++
            }
        }
        return count
    }

    fun interiorAngles(edgeNum:Int) : Int {
        var sumOfAngles = ((edgeNum - 2) * 180) / edgeNum
        return sumOfAngles
    }

    fun calculateSalary(dayNum:Int) : Int {
        var workingHour = dayNum * 8
        var salary = workingHour * 40
        if (workingHour > 150) {
            salary = (150 * 40) + ((workingHour - 150) * 80)
        }
        return salary
    }

    fun calculateParkingPrice(hour:Int) : Int {
        var price = 50
        if (hour > 1) {
            price = price + 10 * (hour - 1)
        }
        return price
    }
}