package usuario

abstract class Funcionario(val usuario: Pessoa, var salario: Double) {
//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }

    abstract val bonificacao: Double
}