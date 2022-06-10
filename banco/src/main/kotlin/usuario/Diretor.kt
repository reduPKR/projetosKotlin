package usuario

class Diretor(usuario: Pessoa, salario: Double, var plr: Double) : Funcionario(usuario = usuario, salario = salario) {
    //    Quando o metodo não era abstract
//    override val bonificacao: Double
//        get() {
//            return salario * 0.2 + plr
//        }
    override val bonificacao: Double
        get() = salario * 0.2 + plr
}