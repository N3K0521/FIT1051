package Week2;

public class ApplicationDriver {
    public static void main(String[] args) {
        Person tania = new Person();

        tania.setAge(21);
        System.out.println("Tania is " + tania.getAge() + " years old.");

        tania.setAge(0);
        System.out.println("Tania is " + tania.getAge() + " years old.");

        tania.setPersonAddress("Wellington Rd");
        System.out.println("Tania is at " + tania.getPersonAddress());

        tania.setPersonAddress("Wellington Rd, Clayton VIC 3800, Australia");
        System.out.println("Tania is at " + tania.getPersonAddress());
    }
}

