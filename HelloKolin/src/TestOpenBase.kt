//  ref https://www.tutorialspoint.com/kotlin/kotlin_keywords.htm

//test Open keyword
open class TestOpenBase {

    open fun testForOpen(){
        println("test for open Keyword");
    }
}

    // test private
private class TestPrivateBase(){
    fun testForPrivate(){
        println(" test for private");
    }
}

class InheritTest : TestOpenBase(){
    override fun testForOpen(){
        println("test for inheritance with open keyword")
    }


}
