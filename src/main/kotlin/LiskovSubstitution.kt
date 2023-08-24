/* A child class object can completely replace a superclass object without affecting the program.
   If a super class variable is assigned with a base class object still the superclass object
   should be able to access only its properties

   If you use a child class object instead of the super class object then also the program functionality should
   remain the same if your code satisfies LSP
 */

interface Color{
    fun printcolor()
}

open class Green: Color{
    override fun printcolor() {
        println("Color is Green")
    }
}

class Blue : Color{
    override fun printcolor(){
        println("Color is Blue")
    }
}

fun main(){
    var green = Blue()
    var blue = Green()
    println(green.printcolor()) // Prints Color is Green even though we are assigning the Blue object hence follows LSP//
    println(blue.printcolor()) // Prints Color is Green even though we are assigning the Green object hence follows LSP//

}