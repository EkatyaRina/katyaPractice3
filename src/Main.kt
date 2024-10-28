import java.lang.Math.pow
import kotlin.math.sqrt
import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Ex 1
    val myAge = 17
    val isTeenager = myAge in 13..19
    println("Мой возраст находится в промежутке от 13 до 19: $isTeenager")

    //Ex 2
    val theirAge = 30
    val bothTeenagers = (myAge in 13..19) && (theirAge in 13..19)
    println("Оба человека в промежутке от 13 до 19: $bothTeenagers")

    //Ex 3
    val reader = "Kashminova Ekaterina"
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    println("равно ли '$reader' и '$author' по количеству символов: $authorIsReader")

    //Ex 4
    val readerBeforeAuthor = reader < author
    println("стоит ли '$reader' перед  '$author' по алфавиту: $readerBeforeAuthor")

    //Ex 5
    val myAge2 = 17
    if (myAge2 in 13..19)
    {
        println("ПОДРОСТОК")
    }
    else println("NO ПОДРОСТОК")

    //Ex 6
    val answer = if (reader < author) println("YES") else println( "NONONO")

    //Ex 7
    var counter = 0
    print("Result = ")
    while (counter < 10)
    {
        var x = counter
        print("$x ")
        counter += 1
    }
    println()
    //Ex 8
    var counterOneElse = 0
    var roll = 0
    do {
        roll = Random.nextInt(0, 6)
        counterOneElse += 1
    } while ( roll != 0)
    println("После $counterOneElse бросков roll = $roll")

    //Ex 9
    print("квадраты чисел: ")
    for (range in 1..10 step 1)
    {
        print("%.0f".format (pow(range.toDouble(), 2.0)) + " " )
    }
    println()

    //Ex 10
    print("квадратный корень из каждого числа: ")
    for (range in 1..10 step 1)
    {
        print("%.2f".format (sqrt(range.toDouble() )) + " " )
    }
    println()

    //Ex 11

    var sum = 0
    for (row in 0 until 8 step 2) {
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println(sum)
}