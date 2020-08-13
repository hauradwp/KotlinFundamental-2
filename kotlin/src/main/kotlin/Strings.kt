fun main(){
    var wordOne = "Modern"
    var wordtwo = "Concise"
    var wordThree = "Paragmatic"
    var wordFour = "Safe"
    val text = """
        kotlin is $wordOne
        kotlin is $wordtwo
        kotlin is $wordThree
        kotlin is $wordFour
        """.trimIndent()

    print(text)
}