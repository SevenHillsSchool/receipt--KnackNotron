import java.util.Scanner;
import java.util.Arrays;

public class Transaction {
  InventoryItem[] purchasedItems;
  int[] itemQuantity;
  double totalPrice;
  String purchaser;
  int purchaseTracker;

  // constructor:
  public Transaction(String customerName) {
    purchasedItems = new InventoryItem[3];
    itemQuantity = new int[3];
    purchaser = customerName;
    purchaseTracker = 0;
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


  public void buyStuff() {
    System.out.println();
    Scanner scan = new Scanner(System.in);
    boolean purchasing = true;
    do {
      purchaseTracker+=1;
      System.out.println("\nWhat do you wish to buy? We have:");
      for (InventoryItem item : Main.inventory) {
        System.out.println(item.getName());
      }
      System.out.println();
      String scanRes = scan.next();
      if (scanRes.toLowerCase().equals("burger".substring(0,scanRes.length()))) {
        purchasedItems[purchaseTracker-1] = Main.burger;
        System.out.println("How many would you like to buy? We have "
          + Main.burger.getStock() + " available.");
        int purchaseQuantity = scan.nextInt();
        itemQuantity[purchaseTracker-1] = purchaseQuantity;

        purchasing = keepShopping();
      } else if (scanRes.toLowerCase().equals("french fries".substring(0,scanRes.length()))) {
        purchasedItems[purchaseTracker-1] = Main.fries;
        System.out.println("How many would you like to buy? We have "
          + Main.fries.getStock() + " available.");
        int purchaseQuantity = scan.nextInt();
        itemQuantity[purchaseTracker-1] = purchaseQuantity;

        purchasing = keepShopping();
      } else if (scanRes.toLowerCase().equals("orange".substring(0,scanRes.length()))) {
        purchasedItems[purchaseTracker-1] = Main.orange;
        System.out.println("How many would you like to buy? We have "
          + Main.orange.getStock() + " available.");
        int purchaseQuantity = scan.nextInt();
        itemQuantity[purchaseTracker-1] = purchaseQuantity;

        purchasing = keepShopping();
      } else {
        System.out.println("That's not on our menu\n");
        purchaseTracker-=1;
        purchasing=true;
      }
    } while (purchasing == true && purchaseTracker<3);
  }


  public boolean keepShopping() {
    if (purchaseTracker<3) {
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
    } else {
      return false;
    }
  }

  public static void calculatePrice() {
    for (int i=0; i<Main.t1.purchasedItems.length; i++) {
      Main.t1.totalPrice+= Main.t1.purchasedItems[i].getPrice() * Main.t1.itemQuantity[i];
    }
  } //close calculatePrice()

/* Unicode character to clear the screen for Unix
  System.out.println("\033\143"); */

} //close class
