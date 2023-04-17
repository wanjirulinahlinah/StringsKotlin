fun main() {
    //String case
    var x = "Africa inventor"
    println(x.toUpperCase())
    println(x.toLowerCase())
    println(x.capitalize())
    println(x.decapitalize())


    //empty strings and blank strings
    var emptyString=""
    var blankString=" "
    println(emptyString.isEmpty())
    println(emptyString.isBlank())
    println(blankString.isEmpty())
    println(emptyString.isBlank())

    //String trim
    var name= " Emma Museveni "
    println(name.trimStart())
    println(name.trimEnd())
    println(name.trim())

    //startswith endsWith
    var location= "Eldolet"
    println(location.startsWith("E"))
    println(location.endsWith("t"))

    //string replace
    var sentence = "I was born in the year 2000 in Kenya"
    println(sentence.replace("2000","2004"))

    //string split
    var words="eagle,geese,dove,fliers"
    var birds= words.split(",")
    println(birds)
    println(birds[3])

    //to string
    var weight = 54.5
    print("my weight is"+ " " + weight.toString())



//    arrayOf
    var numArray = arrayOf(10,14,32,6,43,2,75,8)
    println(numArray[0])
    println(numArray[1])
    println(numArray[2])
    println(numArray[3])
    println(numArray[4])
    println(numArray[7])

    var namesarray= arrayOf("Linah","Rose","Mercy","jane","John")
    println(namesarray[0])
    println(namesarray[4])

    var countryarray = arrayOf("Kenya","Uganda.","Rwanda","Zambia.")
    println(countryarray[0])
    println(countryarray[1])
    println(countryarray[2])
    println(countryarray[3])
    println(countryarray.get(0))


}