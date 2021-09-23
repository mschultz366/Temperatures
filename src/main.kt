fun main(args: Array<String>){
// program will allow user input and output a temperature
    var temperature = 0
    print("Input a temp to know if it is hot or cold:")
    temperature = readLine()!!.toInt()
    var low = "$temperature is low"
    var normal = "$temperature is comfortable"
    var high = "$temperature is hot!"
    // program will allow phrases for certain temperatures
    if(temperature < 92){
        println(low)
    } else if(temperature in 93..103){
        println(normal)
    } else {
        println(high)
    }
}
// program will allow user to type a temperature and output low, comfortable, or hot