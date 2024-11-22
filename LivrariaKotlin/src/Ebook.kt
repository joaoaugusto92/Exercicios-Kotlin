class Ebook(title:String, author:String, price:Double,var mb:Double) : Book(title, author, price) {
    override fun showDetails() {
        println("Title: $title, Author: $author: Price: $price, Size: $mb")
    }
}