package Week02;

public class Person {
    private int age;
    private String personAddress;

    public void setAge(int newAge){
        if (newAge > 0 && newAge <= 120)
            age = newAge;
    }

    public int getAge(){
        return age;
    }

    public void setPersonAddress(String newPersonAddress){
        if (newPersonAddress.length() > 5 && newPersonAddress.length() < 25)
            personAddress = newPersonAddress;
    }

    public String getPersonAddress(){
        return personAddress;
    }

}


