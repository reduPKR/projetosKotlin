package Lista

class Lista {
    fun executar(){
        var lista: MutableList<Pessoa> = mutableListOf();

        lista.add(Pessoa("Rafael","123456789","28/02/94"))
        lista.add(Pessoa("Sara","234567891","29/06/97"))

        lista.forEach { item -> println(item) }
        lista.sortedBy { it.nome }
    }
}