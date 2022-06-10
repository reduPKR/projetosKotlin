package conta

import usuario.Pessoa

class ContaCorrente(titular: Pessoa, numeroConta: String, cvv: String, agencia: String) :
    Conta(titular, numeroConta, cvv, agencia) {
    override fun sacar(valor: Double) {
        val taxa = valor * 0.02
        super.sacar(valor + taxa)
    }
}