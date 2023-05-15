fun main(args: Array<String>) {
    val amount = 10001
    val constClient = true
    val afterFirstDiscount = (if (amount>=0 && amount<=1000) amount
    else if(amount>1000 && amount<=10000) (amount-100)
    else amount/1.05).toInt()
    val afterSecondDiscount = (if(constClient) afterFirstDiscount/1.01
    else afterFirstDiscount).toInt()
println("Итоговая сумма: $afterSecondDiscount руб")
}