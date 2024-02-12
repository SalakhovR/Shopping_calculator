fun main(args: Array<String>) {

    var userChoice = readln()

    when(userChoice) {
        "Анализ" -> {
            println("Идет анализ продуктовой корзины")
        }
        "Оплата" -> {
            println("Происходит процесс оплаты")
        }
        "Отмена" -> {
            println("Идет отмена покупки")
        }
    }
}