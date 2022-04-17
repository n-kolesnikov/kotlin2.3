fun main(){
    val itemPrice = 100.0
    val itemCount = 10
    val discount = 100
    val previousAmount = 10001
    val regularCustomer = true

    var totalPrice = itemPrice * itemCount

    if (previousAmount in 1001..10000){
        totalPrice -= discount
    }
    else if (previousAmount > 10000){
        totalPrice -= totalPrice * 0.05
    }

    if (regularCustomer) {
        totalPrice -= totalPrice * 0.01
    }
    println("Финальная сумма: $totalPrice")
}