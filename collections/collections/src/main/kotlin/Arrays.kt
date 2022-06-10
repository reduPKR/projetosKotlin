class Arrays {
    fun executar(){
        val array = IntArray(4)
        array[0] = 52
        array[1] = 23
        array[2] = 57
        array[3] = 42

        var maior = Int.MIN_VALUE
        for(item in array){
            if (item > maior){
                maior = item
            }
        }

        println("Maioor valor {$maior}")

        var menor = Int.MAX_VALUE
        array.forEach { valor ->
            if (valor < menor){
                menor = valor
            }
        }

        println("Menor valor {$menor}")
        print(array.contentToString())

        //iterando atribuindo valores
        var index = 0
        for(item in array){
            array[index] = item * 2
            index++
        }
        //maneira mais segura de percorrer o array
        for(indice in array.indices){
            array[indice] = array[indice] * 2
        }
        //melhor maneira
        array.forEachIndexed{ indice, valor ->
            array[indice] = valor * 2
        }

        print(array.contentToString())
    }
}