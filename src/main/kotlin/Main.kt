fun main(args: Array<String>) {
    val amount = 10001
    val constClient = true
    val afterFirstDiscount = (if (amount>=0 && amount<=1000) amount
    else if(amount>1000 && amount<=10000) (amount-100)
    else amount*0.95).toInt()
    val afterSecondDiscount = (if(constClient) afterFirstDiscount*0.99
    else afterFirstDiscount).toInt()
println("Итоговая сумма: $afterSecondDiscount руб")
}