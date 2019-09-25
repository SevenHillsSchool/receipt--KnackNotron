import java.util.Scanner;
import java.util.Arrays;

public class Transaction {
  public static InventoryItem burger = new InventoryItem("Burger", 12, 6.00);
  public static InventoryItem fries = new InventoryItem("French Fries", 15, 1.50);
  public static InventoryItem orange = new InventoryItem("Orange", 6, 1.00);
  public static InventoryItem[] inventory = {burger, fries, orange};
  public static InventoryItem[] cart = new InventoryItem[0];
  public static InventoryItem[] finalCart = new InventoryItem[0];


  // constructor:
  public Transaction() {
    InventoryItem[] purchasedItems;
    int[] itemQuantity;
    double totalPrice;
    String purchaser;
  } //close constructor

// method to do a certain time delay
  public void timeDelay(int duration) {
    try {
      Thread.sleep(duration);
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt();
    }
  } //close timeDelay()

  //
  // public static void purchasePrompt() {
  //   InventoryItem burger = new InventoryItem("Burger", 12, 6.00);
  //   InventoryItem fries = new InventoryItem("French Fries", 15, 1.50);
  //   InventoryItem orange = new InventoryItem("Orange", 6, 1.00);
  //   InventoryItem[] inventory = {burger, fries, orange};
  //   buyStuff();
  // } //close purchasePrompt()

  public static void buyStuff() {
    System.out.println();
    Scanner scan = new Scanner(System.in);
    boolean purchasing = true;
    do {
      System.out.println("\nWhat do you wish to buy? We have:");
      for (InventoryItem item : inventory) {
        System.out.println(item.getName());
      }
      System.out.println();
      String scanRes = scan.next();
      if (scanRes.equals("B") || scanRes.equals("b")) {
        int aLen = cart.length;
        InventoryItem[] result = new InventoryItem[cart.length + 1];
        System.arraycopy(cart, 0, result, 0, aLen);
        System.arraycopy(inventory, 0, result, aLen, 1);

        System.out.println("Your cart currently has: ");
        for (InventoryItem item : result) {
          System.out.println(item.getName());
        }

        purchasing = keepShopping();
      } else if (scanRes.equals("F")|| scanRes.equals("f")) {
        int aLen = cart.length;
        InventoryItem[] result = new InventoryItem[cart.length + 1];
        System.arraycopy(cart, 0, result, 0, aLen);
        System.arraycopy(inventory, 1, result, aLen, 1);
        System.arraycopy(result, 0, finalCart, finalCart.length, result.length);

        System.out.println("Your cart currently has: ");
        for (InventoryItem item : result) {
          System.out.println(item.getName());
        }

        purchasing = keepShopping();
      } else if (scanRes.equals("O") || scanRes.equals("o")) {
        int aLen = cart.length;
        InventoryItem[] result = new InventoryItem[cart.length + 1];
        System.arraycopy(cart, 0, result, 0, aLen);
        System.arraycopy(inventory, 2, result, aLen, 1);
        System.arraycopy(result, 0, finalCart, finalCart.length, result.length);

        System.out.println("Your cart currently has: ");
        for (InventoryItem item : result) {
          System.out.println(item.getName());
        }

        purchasing = keepShopping();
      } else {
        System.out.println("That's not on our menu\n");
        purchasing=true;
      }
    } while (purchasing == true);
  }

  public static void cartMaker() {

  }

  public static boolean keepShopping() {
    System.out.println("\nWould you like to keep shopping?");
    Scanner scan = new Scanner(System.in);
    String shopRes = scan.next();
    if (shopRes.equals("y")||shopRes.equals("Y")) {
      return true;
    } else if (shopRes.equals("n")||shopRes.equals("N")) {
      return false;
    } else {
      System.out.println("I didn't understand that answer, so I will assume no");
      return false;
    }
  }

  public static void calculatePrice(InventoryItem[] purchaseItems) {
    // for (InventoryItem item : cart) {
    //   System.out.println(item.getName());
    // }
  } //close calculatePrice()

/* Unicode character to clear the screen for Unix
  System.out.println("\033\143"); */

} //close class
