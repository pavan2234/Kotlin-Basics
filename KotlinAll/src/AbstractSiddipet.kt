
abstract class Siddipet {
    abstract var name:String
   abstract fun Shop()
   fun myMethod(){
       println("This is Jakkapur")
   }
}
class JAkkapur:Siddipet(){
    override var name:String="pavan"
    override fun Shop() {
        println("This is suryaprt")
    }
}

fun main() {
    var obj=JAkkapur()
    println(obj.name)
    obj.myMethod()
    obj.Shop()
}