package book

class EBook(title: String, author: String, year: Int, var format: String = "text") : Book(title, author, year) {
    private var wordsRead = 0

    override fun readPage(){
        this.wordsRead += 250
    }
}