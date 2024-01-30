fun main() {
    HigherOrder(50,34, 23 ::customFunction)
}

fun customFunction(num1: Int, num2: Int, num3: Int): Int {
    return ((num1 + num2 + num3) /2)
}

fun HigherOrder(num1: Int, num2: Int, funcName:(num1:Int, num2: Int, num3:Int):Int ) {
    print(funcName(num1, num2, num3))
}