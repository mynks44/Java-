public class Safe {
    private final int combination;
    private String message;
    private boolean safelocked;

    public Safe(int combination) {
        this.combination = combination;
        this.message = null;
        this.safelocked = true;
        System.out.println("Combination is set.");
    }
    public void putmsgsafe(int enteredCombination, String message) {
        System.out.println("Enter combination to unlock the safe.");
        if (enteredCombination == combination) {
            this.message = message;
            this.safelocked = false;
            System.out.println("Safe is unlocked. Message has been placed inside.");
        } else {
            soundAlarm();
        }
    }
    public String retrivemsg(int enteredCombination) {
        System.out.println("Enter combination to unlock the safe.");
        if (enteredCombination == combination) {
            if (!safelocked && message != null) {
                System.out.println("Safe is unlocked. Opening safe...");
                return "Message retrieved from safe: " + message;
            } else {
                return "Safe is locked/empty.";
            }
        } else {
            soundAlarm();
            return null;
        }
    }
    public void closeSafe() {
        this.safelocked = true;
        System.out.println("Safe is now locked.");
    }
    private void soundAlarm() {
        System.out.println("Incorrect combination entered! Alarm sounding...");
    }
}
