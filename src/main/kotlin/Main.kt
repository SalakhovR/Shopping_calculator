fun main() {
    val productsArray = arrayOf("Макарошки", "Гречка", "Сало", "Пшено", "Рис", "Кусок металла")
    val productsCostArray = arrayOf(14, 69, 240, 31, 46, 10000)
    var costBag = 0

    while (true) {
        val inputProduct = readln()
        if (inputProduct == "Продуктовая корзина пустая") {
            break
        } else {
            costBag += productsCostArray[productsArray.indexOf(inputProduct)]
        }
    }
    println("Стоимость всех товаров в продуктовой корзине: $costBag кредитов")
}