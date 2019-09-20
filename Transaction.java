public class Transaction {
  // constructor:
  public Transaction() {

  } //close constructor

// method to do a certain time delay
public void timeDelay(int duration) {
  try {
    Thread.sleep(duration);
  } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
  }
} //close timeDelay()

/* Unicode character to clear the screen for Unix
  System.out.println("\033\143"); */

} //close class
