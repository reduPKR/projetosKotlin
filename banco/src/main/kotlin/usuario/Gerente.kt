package usuario

class Gerente(usuario: Pessoa, salario: Double, var plr: Double) : Funcionario(usuario = usuario, salario = salario) {
    //    Quando o metodo não era abstract
//    override val bonificacao: Double
//        get() {
//            return super.bonificacao + plr
//        }
    override val bonificacao: Double
        get() = salario * 0.1 + plr
}