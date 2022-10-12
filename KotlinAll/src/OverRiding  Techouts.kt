open class Techouts {
    open var Name:String="pavan"
    open var Id:Int=1839
    open var Role:String="Devoloper"
    open fun work(){
        println("pavan -Android Devoloper")
    }
}
class Devoloper:Techouts(){
    override var Name="Raghu"
    override var Id=1840
    override var Role="Devoloper"
    override fun work(){
        super.work()
        println("Raghu -Web Devoloper")
    }
}

fun main() {
    var DevoloperObj=Devoloper()
    DevoloperObj.work()
}