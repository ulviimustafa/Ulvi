//package task2
//
//class Product (
//    val name: String,
//    var price : Double,
//    var stock : Int
//) {
//    fun isAvailable() : Boolean {
//        return stock > 0
//    }
//
//    fun sell(amount: Int): Boolean {
//        if (amount <= 0) {
//            println("Invalid amount")
//            return false
//        }
//
//        if (stock == 0) {
//            println("$name is out of stock")
//            return false
//        }
//        if(amount >stock) {
//            println("only $stock $name left")
//            return false
//        }
//
//        stock -= amount
//        val total = price * amount
//        println("Sold $amount x $name for $total AZN")
//        return true
//    }
//}
//
//class Shop (
//    val products : Array<Product>
//    var revenue : Double = 0.0
//){
//    fun findProduct(name: String) : Product? {
//        for (product in products) {
//            if  (product.name.equals(name, true)) {
//                return product
//            }
//        }
//        return null
//    }
//
//    fun processOrder (name : String , amount : Int) {
//        val product = findProduct(name)
//
//        if (product == null) {
//            println("Product $name not found")
//        } else {
//            val sold = product.sell(amount)
//
//            if(sold) {
//                revenue += product.price * amount
//            }
//        }
//    }
//
//    fun printInventory() {
//        println("\n INVENTORY ---------")
//
//        for (i in products) {
//            val product = products[i]
//
//            println(
//                "${i+1}. ${product.name} |"
//                "Price : ${product.price} AZN | "
//                "Stock : ${product.stock}" +
//                if  (product.stock == 0) {
//                    println("out of STOCK")
//                }
//            )
//        }
//    }
//}
//
//fun task1.Addition.Addition.Addition.main () {
//    val products = arrayOf(
//        Product("Phone", 500.0, 4),
//        Product("Computer", 1300.0, 9),
//        Product("Modem", 100.0, 3),
//        Product("Repeater", 50.0, 6),
//        Product("Mouse", 20.0, 5),
//        Product("Monitor", 150.0, 8)
//    )
//
//    val shop = Shop(products)
//
//    val orderNames = arrayOf(
//        "Phone",
//        "Computer",
//        "Modem",
//        "Repeater",
//        "Mouse",
//        "Monitor"
//    )
//
//    val orderAmounts = arrayOf(
//        2,0,10,5,4,7
//    )
//
//}