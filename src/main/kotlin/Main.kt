fun main() {
    val productsArray = arrayOf("Макарошки", "Гречка", "Сало", "Пшено", "Рис", "Кусок металла")
    val productsCostArray = arrayOf(14, 69, 240, 31, 46, 10000)

    val inputProduct = readln()
    val costProduct = productsCostArray[productsArray.indexOf(inputProduct)]

    println("Товар \"$inputProduct\" стоит $costProduct кредитов")
}