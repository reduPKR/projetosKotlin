package usuario

class Pessoa(var nome: String, var sobrenome: String, dataNascimento: String, cpf: String) {
    var dataNascimento = dataNascimento
        private set
     var cpf = cpf
        private set

    fun nomeCompleto(): String {
        return "${nome} ${sobrenome}"
    }
}