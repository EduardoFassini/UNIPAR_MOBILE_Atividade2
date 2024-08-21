fun main() {

    var nome: String
    var idade: Int
    var salario: Double
    var mesesTrabalhados: Int
    var produtosComprados: Int

    nome = "João"
    idade = 19
    salario = 1500.0
    mesesTrabalhados = 3
    produtosComprados = 20

    var salAnualBruto = salario * mesesTrabalhados
    var salAnualLiq = salario - 200
    var mediaProdutos = salAnualLiq / produtosComprados
    var mensagem = "Nome: $nome - Salário líquido anual: $salAnualLiq."

    println("Nome: $nome")
    println("Idade: $idade")
    println("Salário bruto mensal: R$ $salario")
    println("Meses trabalhados no ano: $mesesTrabalhados")
    println("Produtos comprados: $produtosComprados")
    println("Salário anual bruto: R$ $salAnualBruto")
    println("Salário anual líquido: R$ $salAnualLiq")
    println("Média dos gastos por produto: R$ $mediaProdutos")
    println(mensagem)
}