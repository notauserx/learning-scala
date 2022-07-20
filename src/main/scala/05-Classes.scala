package Classes

object Classes {
    class BankAccount() {
        // TODO :: investigate how to use BigDecimal
        private var _balance : Int = 0
        def balance = _balance;

        def deposit(amount: Int) = {
            if(amount <= 0) {
                println("Deposit amount have to be more than ")
            }
            else _balance += amount;

        }

        def withdraw(amount: Int) = {
            if(amount > balance) {
                println("Cannot withdraw more than account balance.")

            }
            else _balance -= amount;
        }
    }
}