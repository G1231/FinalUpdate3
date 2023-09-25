package UML;

import java.util.Date;

public class LogEntry {
	//setting variables for LogEntry.
    private String exerciseType;
    private double duration;
    private String intensity;
    private Date date;
    private double caloriesBurnt;

    // Constructor for log entry
    public LogEntry(String exerciseType, double duration, String intensity, Date date) {
        this.exerciseType = exerciseType;
        this.duration = duration;
        this.intensity = intensity;
        this.date = date;
    }

    // Get methods
    public String getExerciseType() {
        return exerciseType;
    }
    
    public double getDuration() {
        return duration;
    }
    
    public String getIntensity() {
        return intensity;
    }
    
    public Date getTimestamp() {
        return date;
    }
    public double getCaloriesBurnt() {
    	return caloriesBurnt;
    }
    //set methods
    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }


    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }


    public void setTimestamp(Date date) {
        this.date = date;
    }
    
    //method to calculate calories
    public double calculateCaloriesBurnt() {
        double calPerMin = 0;
        
        // switch cases for types of exercise and calories burnt, currently can't think of any other method for now.
        // I will use body weight for calculations later on, but for now, while the program is still in it's initial stages, i'm using an outline
        switch (exerciseType.toLowerCase()) {
        //these exercises and calories burnt are a place holder for now
            case "running":
            	calPerMin = 12.5; 
                break;
            case "swimming":
                calPerMin = 8.0;
                break;
            case "cycling":
                calPerMin = 9.0;
                break;
            default:
                calPerMin = 0.0; //calories burnt by living won't be included if there's no exericse
                break;
        }

        // increase or reduce calories burnt based on intensity inputed.
        switch (intensity.toLowerCase()) {
            case "low":
                calPerMin *= 0.66; 
                break;
            case "moderate":
                break;
            case "high":
                calPerMin *= 1.33;
                break;
        }
        //change calories burned into the calculation and return it
        caloriesBurnt = calPerMin * duration;
        return caloriesBurnt;
    }
}
