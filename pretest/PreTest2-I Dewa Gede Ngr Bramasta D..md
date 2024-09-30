### Optional
1. a
2. d
3. c
4. b
5. c

### Short Answer
6. var adalah cara untuk mendeklarasikan variable yang dapat diganti nilainya, sedangkan val adalah cara untuk mendeklarasikan variable yang tidak dapat diganti nialainya
7. val x = listOf(1, 2, 3, 4)
8. val x == 6 
if (x == 3){
    println("3")
}else if (x == 4){
    println("4")
}else {
    println("")
}
9. menggunakan RequireNotNull () dan !! operator
10. fungsi lambda adalah fungsi yang dimasukan sebagai variabele
11. dengan menggunakan keyword class
12. var language = arrayOf("Ruby", "Kotlin", "Python", "Java")
    for (item in language)
        println(item)
13. when statement mirip dengan switch-case di java, cara menggunakannya juga sama
14. dengan menggunakan modulus (%) 2, contoh jika 4 % 2 = 0 maka nilai angka tersebut adalah genap
15. val x = arrayOf("1", "2", "3", "4", "5", ")

### Yes/No question
16. Yes
17. Yes
18. Yes
19. Yes
20. Yes

### Correct The Code
21. 
    var x = "Hello"
    x = "World"

22. 
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    sum(5, 10)

23. 
    val myList = mutablelistOf(1, 2, 3)
    myList.add(4)

24. 
    var name: String? = null

25. 
    if (x > 5) {
        println("x is greater than 5")
    }

26. 
   when (x) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other")
    }

27. 
    fun greet(val name: String) {
        println("Hello, $name")
    }

28. 
    val myVar = 10
    val result = myVar + 5

29. 
    val numbers = arrayOf(1, 2, 3)
    println(numbers[2])

30. 
    class Person(val name: String, val age: Int) {
        fun greet() {
            print("Hello, my name is $name and I'm $age")
        }
    }

### Story question

val reservedSeats = mutableSetOf<Int>()
val availableSeats = arrayOf(1, 2, 3, 4, 5)

fun reserveSeat(name: String, seatNumber: Int) {
    if (availableSeats.contains(seatNumber) && !reservedSeats.contains(seatNumber)) {
        reservedSeats.add(seatNumber)
        println("$name reserved seat $seatNumber.")
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}