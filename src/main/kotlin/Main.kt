abstract class Shape(
    var shapeType: String,
    var width: Number,
    var height:Number
) {
    open fun showArea() {
    }
}

class Circle(val redian:Double):Shape(
    "Circle",
    2*redian,
    2*redian
) {
    override
    fun showArea(){
        val pi:Double = 3.14
        println("The $shapeType , ${pi * redian*redian},$pi")
    }
}

class Squear(val side:Int):Shape(
    "squear",
    side,
    side
){
    override
    fun showArea(){
        println("${side* side}")
    }
}

class Rectangle(){}

fun main() {
    val circleArea = Circle(9.9)
    circleArea.showArea()

    val squearArea = Squear(9)
    squearArea.showArea()


}