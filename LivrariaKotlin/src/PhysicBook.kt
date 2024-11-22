open class PhysicBook(title:String, author:String, price:Double, var weight:Double) : Book(title, author, price) {
    override fun showDetails() {
        println("Title: $title, Author: $author: Price: $price, Weight: $weight")
    }

     override fun buy(){
         var disponibility = true
        if (disponibility == true) {
            disponibility = false
        } else {
            println("The book has already been borrowed")
        }
    }

    override fun completeShoppping() {

    }
}