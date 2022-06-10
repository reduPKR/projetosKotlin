package conta

import usuario.Pessoa

open class Conta(val titular: Pessoa,
                 val numeroConta: String,
                 val cvv: String,
                 var agencia: String) {
    var saldo = 0.0
        private set
    var credito = 1000
        private set

    //Quanto tem uma unica linha posso gerar property
    val limite: Double
        get() {
            return saldo + credito;
        }

    open fun sacar(valor: Double){
        if((limite - valor) >= 0.00){
            saldo -= valor;
        }
    }

    fun depositar(valor: Double){
        saldo += valor;
    }

    fun transferir(valor: Double, conta: Conta){
        if((limite - valor) >= 0.00){
            sacar(valor);
            conta.depositar(valor);
        }
    }
}