package Classes

import Classes._
import scala.collection.mutable.ArrayBuffer
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest._
import matchers.should._
import org.scalatest.prop.TableDrivenPropertyChecks._

class ClassesTest extends AnyFunSuite with Matchers{

    test("BankAccount Class deposits") {
        val account = new BankAccount();
        account.deposit(100)

        account.balance should equal (100)
    }

    test("BankAccount class doesn't deposit a negetive amount.") {
        val account = new BankAccount();
        account.deposit(-1)

        account.balance should equal (0)
    }

    test("BankAccount withdraws an amount less than the balance") {
        val account = new BankAccount();
        account.deposit(1000)
        account.withdraw((999))
        account.balance should equal (1)
    }
    
    test("BankAccount doesn't withdraws an amount more than the balance") {
        val account = new BankAccount();
        account.deposit(1000)
        account.withdraw((1001))
        account.balance should equal (1000)
    }


    

}