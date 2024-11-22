abstract class Book(var title:String, var author:String, var price:Double) {
    abstract fun showDetails()
    var disponibility = true
    open fun loan():Boolean {
        if (disponibility == true) {
            println("Loan completed sucessfully")
            return false
        } else {
            println("The book has already been borrowed")
            return false
        }
    }
}