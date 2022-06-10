class Rangers {
    fun executar(){
        val serie = 1.rangeTo(10)

        for (item in serie){
            print("$item ")
        }
        println()

        val pares = 1..100 step 2
        for (item in pares){
            print("$item ")
        }
        println()

        val desc = 100 downTo 0
        desc.forEach{item -> print("$item ")}
    }
}