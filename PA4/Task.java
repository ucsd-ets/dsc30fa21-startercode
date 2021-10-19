/**
 * A class that implements a task object. DO NOT MODIFY.
 */
public class Task {
    
    /* instance variables */
    private String name;
    private int expectedTime;
    private int remainingTime;

    /**
     * Initializes a task with given name and
     * expected time to handle.
     * @param name name of task
     * @param expectedTime expected time to handle the task
     */
    public Task(String name, int expectedTime) {
        if (name == null || expectedTime <= 0) throw new IllegalArgumentException();
        this.name = name;
        this.expectedTime = this.remainingTime = expectedTime;
    }

    /**
     * Method decrements the remaining time.
     * @return true if remaining time is decremented,
     *         false if remaining time is 0 or less
     */
    public boolean handleTask() {
        if (remainingTime <= 0) return false;
        remainingTime--;
        return true;
    }

    /**
     * Method returns if the task is finished.
     * @return true if the task is finished, false otherwise
     */
    public boolean isFinished() {
        return remainingTime == 0;
    }

    /**
     * String representation of a task in the form of:
     * "Task(name, expectedTime)"
     * @return string representation
     */
    @Override
    public String toString() {
        return "Task(" + name + ", " + expectedTime + ")";
    }
}
