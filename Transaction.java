import java.util.Scanner;
import java.util.Arrays;

public class Transaction {
  public static InventoryItem burger = new InventoryItem("Burger", 12, 6.00);
  public static InventoryItem fries = new InventoryItem("French Fries", 15, 1.50);
  public static InventoryItem orange = new InventoryItem("Orange", 6, 1.00);
  public static InventoryItem[] inventory = {burger, fries, orange};


  // constructor:
  public Transaction() {
    InventoryItem[] purchasedItems = new InventoryItem[3];
    int[] itemQuantity = new int[3];
    double totalPrice;
    String purchaser;
    int purchaseTracker = 0;
  } //close constructor

  // method to do a certain time delay
  public void timeDelay(int duration) {
    try {
      Thread.sleep(duration);
    } catch (InterruptedException ie) {
      Thread.currentThread().interrupt();
    }
  } //close timeDelay()

  // transaction getters and setters:
  public InventoryItem[] getPurchasedItems() {
    return purchasedItems;
  }
  public void setPurchasedItems(InventoryItem newPurchase) {
    purchasedItems[purchaseTracker-1] = newPurchase;
  }
  public int[] getItemQuantity() {
    return itemQuantity;
  }
  public void setItemQuantity(int newItemQuantity) {
    itemQuantity[purchaseTracker-1] = newItemQuantity;
  }
  public double getTotalPrice() {
    return totalPrice;
  }
  public void setTotalPrice(double newTotalPrice) {
    totalPrice = newTotalPrice;
  }
  public int getPurchaseTracker() {
    return purchaseTracker;
  }
  public void setPurchaseTracker(int newPurchaseTracker) {
    purchaseTracker = newPurchaseTracker;
  }


  public static void buyStuff() {
    System.out.println();
    Scanner scan = new Scanner(System.in);
    boolean purchasing = true;
    do {
      t1.setPurchaseTracker(t1.getPurchaseTracker()+1);
      System.out.println("\nWhat do you wish to buy? We have:");
      for (InventoryItem item : inventory) {
        System.out.println(item.getName());
      }
      System.out.println();
      String scanRes = scan.next();
      if (scanRes.equals("B") || scanRes.equals("b")) {
        purchasedItems[purchaseTracker-1] = burger;
        System.out.println("How many would you like to buy? We have "
          + burger.getStock() + " available.");
        int purchaseQuantity = scan.nextInt();
        t1.setItemQuantity(purchaseQuantity);

        purchasing = keepShopping();
      } else if (scanRes.equals("F")|| scanRes.equals("f")) {
        purchasedItems[purchaseTracker-1] = fries;
        System.out.println("How many would you like to buy? We have "
          + fries.getStock() + " available.");
        int purchaseQuantity = scan.nextInt();
        t1.setItemQuantity(purchaseQuantity);

        purchasing = keepShopping();
      } else if (scanRes.equals("O") || scanRes.equals("o")) {
        purchasedItems[purchaseTracker-1] = orange;
        System.out.println("How many would you like to buy? We have "
          + orange.getStock() + " available.");
        int purchaseQuantity = scan.nextInt();
        t1.setItemQuantity(purchaseQuantity);

        purchasing = keepShopping();
      } else {
        System.out.println("That's not on our menu\n");
        purchasing=true;
      }
    } while (purchasing == true);
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
    // for (InventoryItem item : purchasedItems) {
    //   System.out.println(item.getName());
    // }
  } //close calculatePrice()

/* Unicode character to clear the screen for Unix
  System.out.println("\033\143"); */

} //close class
