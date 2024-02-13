fun main() {
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
            println("Товар \"$inputProduct\" не найден в базе данных")
            break
        }
    }
    if (indexInputProduct > -1) {
        println("Стоимость всех товаров в продуктовой корзине: $costBag кредитов")
    }
}