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
  public String getPurchaser() {
    return purchaser;
  }
  public void setPurchaser(String newCustomer) {
    purchaser = newCustomer;
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
      System.out.print("> ");
      String scanRes = scan.next();
      if (scanRes.toLowerCase().equals("burger".substring(0,scanRes.length()))) {
        purchasedItems[purchaseTracker-1] = Main.burger;
        System.out.println("How many would you like to buy?");
        System.out.print("> ");
        int purchaseQuantity = scan.nextInt();
        itemQuantity[purchaseTracker-1] = purchaseQuantity;

        purchasing = keepShopping();
      } else if (scanRes.toLowerCase().equals("french fries".substring(0,scanRes.length()))) {
        purchasedItems[purchaseTracker-1] = Main.fries;
        System.out.println("How many would you like to buy?");
        System.out.print("> ");
        int purchaseQuantity = scan.nextInt();
        itemQuantity[purchaseTracker-1] = purchaseQuantity;

        purchasing = keepShopping();
      } else if (scanRes.toLowerCase().equals("orange".substring(0,scanRes.length()))) {
        purchasedItems[purchaseTracker-1] = Main.orange;
        System.out.println("How many would you like to buy?");
        System.out.print("> ");
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
      if (shopRes.toLowerCase().equals("yes".substring(0,shopRes.length()))) {
        return true;
      } else if (shopRes.toLowerCase().equals("no".substring(0,shopRes.length()))) {
        return false;
      } else {
        System.out.println("I didn't understand that answer, so I will assume no");
        return false;
      }
    } else {
      return false;
    }
  }

  public void calculatePrice() {
    int calcDistance = -1;
    for (InventoryItem item : purchasedItems) {
      calcDistance++;
      if (item==null) {
        System.out.println("Nothin to calculate");
      } else if (item.getName().equals("Burger(s)") || item.getName().equals("French Fries") || item.getName().equals("Orange(s)")){
        totalPrice+=purchasedItems[calcDistance].getPrice() * itemQuantity[calcDistance];
      } else {
        System.out.println("Error calculating price.");
      }
    }
  }

} //close class
