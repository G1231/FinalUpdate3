package UML;

// as of right now, there isn't much implementation of the User class, but that will change once I start on making the main project
public class User {
	//initialize variables
    private String name;
    private int age;
    private double weight;
    private String gender;
    private int goalWeight; 

    // Constructor for user
    public User(String name, int age, double weight, String gender, int goalWeight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.goalWeight = goalWeight;
    }

    // get methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public String getGender() {
        return gender;
    }
    
    public int getGoalWeight() {
    	return goalWeight;
    }
    
    //set methods
    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setGoal(int goalWeight) {
    	this.goalWeight = goalWeight;
    }
}