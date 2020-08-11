package firstApplication;

public class Person {
    private int age;
    private String favColour;

    public void setAge(int newAge) {
		if (newAge > 0 && newAge <= 120)
            age = newAge;
    }

    public int getAge() {
        return age;
    }
    
    public void setFavColour(String newFavColour) {
        if(newFavColour.length() >= 1 && newFavColour.length() <= 10)
            favColour = newFavColour;
    }

    public String getFavColour() {
        return favColour;
    }   
}