
fun main(args: Array<String>) {
//1
    val exercises: Int=13
    var exercisesSolved: Int = 0
    exercisesSolved +=1

    //2
    val myAge: Int=19

    //3
    var arithmeticMeanOfAge: Double = 19.0
    arithmeticMeanOfAge = (arithmeticMeanOfAge + 30)/2


    //4
    val testNumber: Int = 5
    val evenOdd: Int=testNumber%2


    //5
    var answer: Int=0
    answer = (((+1)+10)*10)shr 3/*110, в двоичном коде, равен 101110, а при смещении в право этих цифр
    результат будет равен 000101,что в свою очередь равно 13, поэтому в консоли мы увидим 13
    println(answer)*/

    //6
    var age:Int=16;//буду использовать переменную, так как константу изменить нельзя
    print(age);
    age=30;
    print(age);

    //7
    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a * 100) + b  //4610
    val answer2: Int = (a * 100) + (b * 100) // 5600
    val answer3: Int = (a * 100) + (b / 10) // 4601

    //8
    ((5*3)-((4/2)*2))

    //9
    val a1: Double=2.0
    val b2: Double=4.0
    val average = (a1+b2)/2

    //10
    val fahrenheit: Double=72.0
    val celcius: Double = (fahrenheit - 32)/1.8 //=22
    //13
    val x1: Double=3.0
    val x2: Double=2.0
    val y1: Double=4.0
    val y2: Double=5.0
    val distance: Double = Math.sqrt(Math.pow((x2-x1),2.0)+Math.pow((y2-y1),2.0))















}