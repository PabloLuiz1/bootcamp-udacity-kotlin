package book

const val MAX_BORROWS_PER_USER = 5

open class Book (val title: String, val author: String, val year: Int) {
    private var currentPage: Int = 1
    open fun readPage(){
        this.currentPage++
    }

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    open fun getTitleAndAuthor(): Pair<String, String> { return (title to author) }
    open fun getTitleAndAuthorAndYear(): Triple<String, String, Int> {return Triple(title, author, year)}
    fun canBorrow(currentBorrows: Int): Boolean {return (currentBorrows < MAX_BORROWS_PER_USER)}
    fun printUrl(){
        println(BASE_URL.plus(this.title).plus(".html"))
    }
}