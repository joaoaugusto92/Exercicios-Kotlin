class Ebook(title:String, author:String, price:Double,var pages:Int) : Book(title, author, price) {
    override fun showDetails() {
        println("Title: $title, Author: $author: Price: $price, Size: $pages")
    }

    override fun buy() {
        var disponibility = true

            if (disponibility == true) {
                println("Loan completed sucessfully")
                disponibility = false
            } else {
                println("The book has already been borrowed")
            }
        }

    override fun completeShoppping() {

    }
}