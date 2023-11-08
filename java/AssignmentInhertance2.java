
interface E {

    void name();

    void regno();

    void department();

    void college();

    void ThankYou();

    void course();
}
// class A extending Class B and implementing E
abstract class A extends B implements E {

    
    @Override
    public void name() {
        System.out.println("Your Name: Blandine");
    }

    @Override
  
    public void department() {
        System.out.println("Your Department :" + "BIT");
    }
    @Override
  
    public void regno() {
        System.out.println("Your Registration Number :" + 222007492);
    }
            
}


abstract class B {

      public void college() {
        System.out.println("Your College :" + "BUSINESS");
    }
}

//class C extending class D
abstract class C extends D {

    public void department() {
        System.out.println("Your Department :" + "BIT");
    }

}
//class D extending class A
abstract class D extends A {
    
    public void course() {
        System.out.println("Your Course is :"+ "Java");
    }
}
// class Bank  which is not abstract (because it can't be instanciated ) extending class D that will help to make objects in our main function 
class student extends D {

    public void ThankYou() {
        System.out.println("Thank You!  ");
        System.out.println("=============================");
    }
     public void name() {System.out.println("Your Name: Blandine");}
     public void regno() {System.out.println("Your Registration Number :" + 222007492);}
     public void department() {System.out.println("Your Department :" + "BIT");}
     public void college() {System.out.println("Your College :" + "BUSINESS");}
     public void course() {System.out.println("Your Course is :"+ "Java");}

}

public class AssignmentInhertance2 {

    public static void main(String[] args) {
        student std = new student();
        std.name();
        std.regno();
        std.college();
        std.department();
        std.ThankYou();
    }
}
