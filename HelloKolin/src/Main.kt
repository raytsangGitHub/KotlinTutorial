 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val funTutorial = KolinFunctions()

    val  base = 3.0
    val p = 2.0
    //testing typical function
    val res= funTutorial.simpleFun(base, p)
    println("the result of: $p to the power of $base = $res")

    //testing inline function
    val multipleRes = funTutorial.multiply(6, 5)
    println("the multiplication result: $multipleRes")

    //test for targetSum
    val targetsum = TargetSum()
    val test = arrayOf(1, 5, 10, 20, 80)
    val t = 90
    val resTargetSum = targetsum.hasPairWithTarget(test, t)
    if(resTargetSum == 1) {
        println("there exist the target sum of $t")
    }else   {
        println("there no target sum of $t")
    }

    // ** test process word
    val processWord= WordBreakDp()
    processWord.processWord()

    //merge master to main and delete the master branch
    
    //Simple return function



    //val testOpen= InheritTest()

    //testOpen.testForOpen();

    //test for inline function
   /* val inlineFun = KolinFunctions()
    inlineFun.InlineFunctions({println("Inline function parameter")})*/
}

