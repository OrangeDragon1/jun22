package oop.core;

public class Main {

    public static void main(String[] args) {

        // Car porsche = new Car();
        // Car holden = new Car();
        // porsche.setModel("Carrera");

        // System.out.println(porsche.getModel());

        // SimpleCalculator cal1 = new SimpleCalculator();

        // cal1.setFirstNumber(10);
        // cal1.setSecondNumber(2);

        // System.out.println(cal1.getAdditionResult());
        // System.out.println(cal1.getSubtractionResult());
        // System.out.println(cal1.getMultiplicationResult());

        // Person person = new Person();
        // person.setFirstName("");
        // person.setLastName("");
        // person.setAge(10);
        // System.out.println("fullName= " + person.getFullName());
        // System.out.println("teen= " + person.isTeen());
        // person.setFirstName("John");
        // person.setAge(18);
        // System.out.println("fullName= " + person.getFullName());
        // System.out.println("teen= " + person.isTeen());
        // person.setLastName("Smith");
        // System.out.println("fullName= " + person.getFullName());
        
        // BankAccount mam = new BankAccount();
        // BankAccount john = new BankAccount(123456, 6695.36, "john", "emailaddress", 9663325); 
        // john.setBalance(9992.30);
        // john.withdrawFunds(2);
        // System.out.println(mam.getBalance());
        // System.out.println(mam.getAccountNumber());
        // System.out.println(mam.getPhoneNumber());
        // System.out.println(mam.getEmail());

        // VipCustomer rose = new VipCustomer("Rose", 10000, "rose.park@yg.com");

        // System.out.println(rose.getName());
        // System.out.println(rose.getCreditLimit());
        // System.out.println(rose.getEmailAddress());
        // Wall wall = new Wall(5, 4);
        // System.out.println("area= " + wall.getArea());

        // wall.setHeight(-1.5);
        // System.out.println("width= " + wall.getWidth());
        // System.out.println("height= " + wall.getHeight());
        // System.out.println("area= " + wall.getArea());

        Point first = new Point(6, 5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }
}