
interface E {

    void deposit();

    void withdraw();

    void Balance();

    void ThankYou();

    void account();
}
// class A extending Class B and implementing E
abstract class A extends B implements E {

    
    @Override
    public void deposit() {
        System.out.println("Your deposit Amount :" + 100);
    }

    @Override
  
    public void withdraw() {
        System.out.println("Your withdraw Amount :" + 50);
    }
            
}


abstract class B {

      public void Balance() {
        System.out.println("Your Balance Amount :" + 50);
    }
}

//class C extending class D
abstract class C extends D {

    public void withdraw() {
        System.out.println("Your withdraw Amount :" + 50);
    }

}
//class D extending class A
abstract class D extends A {
    
    public void account() {
        System.out.println("Account Transactions");
    }
}
// class Bank  which is not abstract (because it can't be instanciated ) extending class D that will help to make objects in our main function 
class Bank extends D {

    public void ThankYou() {
        System.out.println("Thank You For Banking With Us ");
        System.out.println("=============================");
    }
}

public class AssignmentInhertance {

    public static void main(String[] args) {
        Bank d = new Bank();
        d.account();
        d.deposit();
        d.withdraw();
        d.Balance();
        d.ThankYou();
    }
    
}
