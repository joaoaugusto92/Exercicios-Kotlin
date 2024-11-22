class PhysicBook(title:String, author:String, price:Double, var weight:Double) : Book(title, author, price) {
    override fun showDetails() {
        println("Title: $title, Author: $author: Price: $price, Weight: $weight")
    }
}