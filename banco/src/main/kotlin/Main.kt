import conta.Conta
import usuario.Diretor
import usuario.Funcionario
import usuario.Gerente
import usuario.Pessoa

fun main(args: Array<String>) {
    val titular = Pessoa("Rafael","Eduardo", "28-02-1994", "12345678910")
    val conta = Conta(titular,"123456","123","789")
    println("Titular ${conta.titular.nomeCompleto()}")

    conta.depositar(5000.0)
    println("Saldo ${conta.saldo}")
    println("credito ${conta.credito} Limite ${conta.limite}")

    conta.sacar(500.0)
    println("Saldo ${conta.saldo}")

    //Caso tive uma interface poderia fazer val funcionario: Interface = Gerente(...) igual fiz na classe abaixohh
    val funcionario: Funcionario = Gerente(titular, 2000.0, 1500.0)
    val funcionario2 = Gerente(titular, 2000.0, 1500.0)

    val gerente = Gerente(titular, 3000.0, 1500.0)
    val diretor = Diretor(titular, 10000.0, 5000.0)

}