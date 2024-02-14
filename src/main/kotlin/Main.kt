fun main() {
    val analyze = "Анализ"
    val pay = "Оплата"
    val cancel = "Отмена"

    printMainMenu()
    val selectedItemMenu = readItemMenu()
    when (selectedItemMenu) {
        analyze -> analyzeOrder()
        pay -> payOrder()
        cancel -> cancelOrder()
    }
}

fun printMainMenu() {
    println(
        "1. Посчитать стоимость продуктовой корзины\n" +
                "2. Оплатить покупку\n" +
                "3. Отменить покупку\n"
    )
}

fun readItemMenu(): String {
    val userChoice = readln()
    var retunrnedString = ""

    when (userChoice) {
        "Анализ" -> {
            println("Идет анализ продуктовой корзины\n")
            retunrnedString = "Анализ"
        }

        "Оплата" -> {
            println("Происходит процесс оплаты\n")
            retunrnedString = "Оплата"
        }

        "Отмена" -> {
            println("Идет отмена покупки\n")
            retunrnedString = "Отмена"
        }
    }
    return retunrnedString
}

fun analyzeOrder() {
    val productsArray = arrayOf("Макарошки", "Гречка", "Сало", "Пшено", "Рис", "Кусок металла")
    val productsCostArray = arrayOf(14, 69, 240, 31, 46, 10000)
    var costBag = 0
    var indexInputProduct = 0

    while (true) {
        val inputProduct = readln()
        if (inputProduct == "Продуктовая корзина пустая") {
            break
        }
        indexInputProduct = productsArray.indexOf(inputProduct)
        if (indexInputProduct > -1) {
            costBag += productsCostArray[indexInputProduct]
        } else {
            println("Товар \"$inputProduct\" не найден в базе данных\n")
            break
        }
    }
    if (indexInputProduct > -1) {
        println("Стоимость всех товаров в продуктовой корзине: $costBag кредитов")
    }
}

fun payOrder() {
    println("Оплата прошла успешно")
}

fun cancelOrder() {
    println("Покупка отменена")
}