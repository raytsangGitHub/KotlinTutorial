class KolinFunctions {

    //Kotlin Inline Function. Unit means void
    fun InlineFunctions(function:() -> Unit){
        println("this is inline function a")
        function()
        println("this is inline function b")
    }
    // Kotlin Lambda Function

    //Higher-Order Functions

    //Kotlin Tail Recursion

    //Kotlin Recursive Function

    //Unit-returning Functions

    //Return Values functions
    fun simpleFun(x: Double, base: Double) : Double {

        return  Math.pow(base,x)
    }
    //Kotlin Built-in Functions

}