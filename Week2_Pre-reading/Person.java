public class Person {
    private int age;

    public void setAge(final int newAge) {
        if (newAge > 0 && newAge <= 120)
            age = newAge;
    }

    public int getAge() {
        return age;
    }
    
}