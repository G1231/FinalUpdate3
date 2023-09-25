package UML;
import UML.LogBook;
import UML.LogEntry;
import UML.User;
import java.util.Date;

public class testing {
    public static void main(String[] args) {
        // making user
        User user = new User("John Doe", 30, 160.0, "Male", 160);

        // making logbook for the user
        LogBook logbook = new LogBook();

        //  log entries
        LogEntry entry1 = new LogEntry("Running", 45.0, "Moderate", new Date());
        LogEntry entry2 = new LogEntry("Swimming", 60.0, "High", new Date());
        LogEntry entry3 = new LogEntry("Cycling", 30.0, "Low", new Date());

        // adding entries to logbook
        logbook.addLogEntry(entry1);
        logbook.addLogEntry(entry2);
        
        logbook.addLogEntry(entry3);

        //testing to see if get methods for user work
        System.out.println("Original entries");
        System.out.println("User:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Weight: " + user.getWeight());
        System.out.println("Gender: " + user.getGender());
        System.out.println("Goal Weight: " + user.getGoalWeight());

        // showing all entries that were made in logbook
        System.out.println("\nExercise Log Entries:");
        for (LogEntry entry : logbook.getAllLogEntries()) {
            System.out.println("Date: " + entry.getTimestamp());
            System.out.println("Exercise Type: " + entry.getExerciseType());
            System.out.println("Duration (minutes): " + entry.getDuration());
            System.out.println("Intensity: " + entry.getIntensity());
            entry.calculateCaloriesBurnt(); //calling calculateCaloriesBurnt so that variable updates
            System.out.println("Calories Burned: " + entry.getCaloriesBurnt() + "\n");
        }
        //testing set methods and changing multiple variables
        user.setName("Jane Smith");
        user.setWeight(210.2);
        user.setAge(31);
        user.setGender("Female");
        user.setGoal(180);
        entry1.setExerciseType("Swimming");
        entry2.setDuration(80.0);
        entry3.setIntensity("High");
        
        //testing to see if get methods for user work
        System.out.println("__________________________________________________________________");
        System.out.println("Changed values \n \n");
        System.out.println("User:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Weight: " + user.getWeight());
        System.out.println("Gender: " + user.getGender());
        System.out.println("Goal Weight: " + user.getGoalWeight());

        // showing all entries that were made in logbook
        System.out.println("\nExercise Log Entries:");
        for (LogEntry entry : logbook.getAllLogEntries()) {
            System.out.println("Date: " + entry.getTimestamp());
            System.out.println("Exercise Type: " + entry.getExerciseType());
            System.out.println("Duration (minutes): " + entry.getDuration());
            System.out.println("Intensity: " + entry.getIntensity());
            entry.calculateCaloriesBurnt(); //calling calculateCaloriesBurnt so that variable updates
            System.out.println("Calories Burned: " + entry.getCaloriesBurnt() + "\n");
        
    }
  }
}