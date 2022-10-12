class Employee (EmployeeID:Int,EmployeeName:String,EmployeeRole:String) {
    init {
        println(EmployeeID)
        println(EmployeeName)
        println(EmployeeRole)
    }
}

fun main() {
    var obj=Employee(18039,"Pavan","Devoloper")
}