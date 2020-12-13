package aboutCollections

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)

fun main() {

    val data = listOf(
            Receita(
                    "lasanha",
                    1200,
                    listOf(
                            Ingredientes("Farinha", 1),
                            Ingredientes("Presunto", 5),
                            Ingredientes("Queijo", 10),
                            Ingredientes("Molho de tomate", 2),
                            Ingredientes("Manjericão", 3)
                    )
            ),
            Receita("Panqueca", 500),
            Receita("Omelete", 200),
            Receita("Parmegiana", 700),
            Receita(
                    "Hamburguer", 2000,
                    listOf(
                            Ingredientes("Pão", 1),
                            Ingredientes("Hamburguer", 3),
                            Ingredientes("Queijo", 1),
                            Ingredientes("Catupiry", 1),
                            Ingredientes("Bacon", 3),
                            Ingredientes("Alface", 1),
                            Ingredientes("Tomate", 1)
                    )
            )
    )

    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")

    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")

    // Tenho alguma receita de lasanha?
    println("Tenho receitas de lasanhas? ${if (data.any {it.nome.contains("lasanha")}) "sim" else "não"}.")

    // Quantas receitas de lasanha?
    println("Tenho ${data.count { it.nome.contains("lasanha")}} receitas de lasanha")

    // Qual a primeira e a última receita?
    println("a primeira receita é ${data.first().nome}")
    println("a última receita é ${data.last().nome}")

    // Qual a soma de calorias
    val sumCalorias = data.sumBy { it.calorias }
    println(sumCalorias)

    // Quais são as duas primeiras receitas?
    val firstTwo = data.take(2)
    for(x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }

    val knowPanqueke = data.filter { it.nome == "Panqueca" }.any()
    println("Tem a receita Panqueca? ${if (knowPanqueke) "sim" else "não"}")

    // Quais são as comidas com mais de 500 calorias?
    data.filter{ it.calorias > 500 }.forEach{ println(it.nome)}

    // Qual a receita mais calórica? E a menos calórica?
    val maisCal = data.maxBy { it.calorias }
    val menosCal = data.minBy { it.calorias }
    println("${maisCal?.nome} ${menosCal?.nome}")

    // lista com nome dos pratos
    data.map { it.nome }

    // lista de dados simples
    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
    println("Lista distinta: ${listaInteiros.distinct()}")
    println(data.distinctBy { it.nome })

    listaInteiros.sorted()
    println(listaInteiros.distinct().sorted())
    println(listaInteiros.distinct().reversed())

}
