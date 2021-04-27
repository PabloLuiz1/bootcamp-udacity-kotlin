package book

fun main(){
    var books: List<Book> = listOf<Book>(Book("Test1", "Test2", 1999), Book("Test2", "Test2", 1999))
    for (b: Book in books)
        b.printUrl()
}
