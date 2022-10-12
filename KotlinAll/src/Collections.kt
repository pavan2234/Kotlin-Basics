fun main() {
    var List= listOf<Any>(1,2,"pavan","Aishu",2,1,"pavan","Aishu")
    for (elements in List){
        println(elements)
    }
    println()
    var Set= setOf<Any>(2,1,"pavan","Aishu",2,1,"pavan","Aishu")
    print(Set)
    println()
    var Map= mutableSetOf<Any>(1,2,3,4,8,4,5,6)
    println(Map)
    println()
        //  var mapo= hashSetOf<Any>(1,2,3,4,8,4,5,6)
    //println(mapo)
}