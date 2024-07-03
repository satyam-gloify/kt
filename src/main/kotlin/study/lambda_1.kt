
fun main() {
    println("Hello World!")
    //assign trick with trickF
//    val trickF = :: trick
//    trickF()
//    val trickF1 =  trick1
//    trickF1()
////Treat
//     treat1()
//
//    val result = treat(200)
//    print(result)


    //true
//    print(trickOrTreat(true,null)())
//    sum(3,4).run{
//        print(this)
//    }

    //with didn't work like this
    //Grouping function calls on an object
//    sum(3,4).with{
//        print(this)
//    }
    with(sum(4,5)){
        println(this)
    }
//    sum(3,4).apply{
//        print(this)
//    }
    sum(8,4).also{
        //also do
        println(it.compareTo(9))
    }

        val str = "Hello"
        // this
        str.run {
            println("The string's length: $length")
            println("The string's length: ${this.length}") // does the same
        }

        // it
        str.let {
            println("The string's length is ${it.length}")
        }

//false
//    trickOrTreat(false, treat)
//    print(trickOrTreat(false) {
//        print("with $it quarters")
//        " Return MY quarter" //last expression works as return
//    }())
//
//    for( a in 1..5){
//        print("Hello")
//    }
//    repeat(4){ print("Bella Chao")}

}
fun trick(){
    println("Trick!")
}
//convert Trick function to a lambda expression
val trick1={
    println("Trick 1 !")
}

//Use function as a Data Type
//Return Type is String
val treat: (Int) -> String = {
    println(" with Extra $it Treats")

    "Return MY treat lambda" //last expression works as return
}
val sum: (Int, Int) -> Int = { a, b -> a + b }

//Return Type is void
val treat1 : ()->Unit={
    println("Treat 1 ")
}

fun trickOrTreat(isTrick : Boolean,extraTreats: ((Int)->String)?):()->Unit{
//     isTrick ? trick1 : treat1
    return if(isTrick){
        trick1
    }else{
        if(extraTreats!=null){
            print(extraTreats(5))
        }
        treat1
    }
}



// fun fetchData(completion: (Result) -> Unit) {
// Perform data fetching
//     val result = fetchFromNetwork()
//        completion(result)
//     }

// Usage: fetchData { result -> // Handle result }
