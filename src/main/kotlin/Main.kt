fun main() {
    print(solution(2))
}

fun solution(n: Int): Int {
    var numberStr = ""
    for (i in 0 until n) {
        numberStr += "9"
    }

    if (numberStr.isEmpty())
        return 0

    return numberStr.toInt()
}