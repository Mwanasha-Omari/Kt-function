fun main() {
    length("Amani")
   modulus (2,4)
    println(statement("I play table tennis"))
    println(identify("Mwanajuma"))
    println(verify("Ali",19))
}




fun length(name:String){
 println (name.length)

}
fun modulus(num1:Int,num2:Int){
    println(num1*num2)
}
fun statement(name:String):String{
  return(name.replace("table","long"))

}
fun identify(name: String){

    (println (name[0]))
    (println(name[4]))
}
fun verify(x:String,y:Int){
  var statement="Hi my name is $x and I am $y years old"
    println(statement)
}
