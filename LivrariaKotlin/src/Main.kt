fun main(){
    val bookList = mutableListOf<Book>()
    bookList.add(PhysicBook("The Hobbit", "J.R.R. Tolkien", 39.99, 1.2))
    bookList.add(Ebook("1984", "George Orwell", 19.99, 328))
    val book1 = bookList[0]
    val book2 = bookList[1]
    println("Options of boook: ")
    for (book in bookList){
        book.showDetails()
    }

    println("\n Type the number corresponding to the book (1 for the first, 2 for the second ad so on.): ")
    var answer: Int? = readln().toIntOrNull()
    while ((answer == null) || (answer > bookList.size)){
        println("ERROR: invalid answer")
        println("\n Type the number corresponding to the book (1 for the first, 2 for the second ad so on.): ")
        answer = readln().toIntOrNull()
    }


    when(answer){
        1 -> book1.buy()
        2 -> book2.buy()
    }
}