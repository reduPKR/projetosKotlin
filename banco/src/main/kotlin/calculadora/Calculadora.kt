package calculadora

import usuario.Funcionario

class Calculadora {
    var salario: Double = 0.0
        private set
    var bonificacao: Double = 0.0
        private set
    var total: Double = 0.0
        private set
        get() = salario + bonificacao

    fun registrar(funcionario: Funcionario){
        salario += funcionario.salario
        bonificacao += funcionario.bonificacao
    }
}