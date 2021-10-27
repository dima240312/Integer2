fun main() {
    Integer2()
}
fun Integer2() {

    print("Integer2. Дана масса M в килограммах. Используя операцию деления нацело,\n" +
            "найти количество полных тонн в ней (1 тонна = 1000 кг). \n")
    print("Введите массу в килограммах:")
    var M_kilo = readLine()!!.toInt()
    var full_t = M_kilo/1000
    print("масса в тоннах $full_t ")

}

