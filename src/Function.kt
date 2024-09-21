class Function(val name: String) {
    fun greet(){
 print("hi $name")
    }
}
fun main(args:Array<String>){
val function=Function("name")
    function.greet()
}

