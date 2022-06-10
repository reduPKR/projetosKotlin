package conta

import usuario.Pessoa

class ContaPoupanca(titular: Pessoa, numeroConta: String, cvv: String, agencia: String) :
    Conta(titular, numeroConta, cvv, agencia) {
}