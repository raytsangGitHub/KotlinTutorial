// ref: https://www.youtube.com/watch?v=F9UC9DY-vIU
//
class KolinFunctions {

    //Inline Function. Unit means void
    fun InlineFunction(function:() -> Unit){
        println("this is inline function a")
        function()
        println("this is inline function b")
    }
    //more inline function --

    // Kotlin single line function
    fun multiply(x:Int, y: Int) = x * y

    // Kotlin Lambda Function - this function is stored as object which introduce memory over head
    // use an inline keyword reduce overhead.


    //Higher-Order Functions -this function is stored as object which introduce memory over head
    //use an inline keyword reduce overhead.

    //Kotlin Tail Recursion

    //Kotlin Recursive Function

    //Unit-returning Functions

    //Return Values functions
    fun simpleFun(x: Double, base: Double) : Double {

        return  Math.pow(base,x)
    }
    //Kotlin Built-in Functions

}