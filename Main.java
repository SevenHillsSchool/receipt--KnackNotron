public class Main {
  public static Register regOne = new Register();
  public static Transaction t1 = new Transaction("Nik");

  public static InventoryItem burger = new InventoryItem("Burger(s)", 12, 6.00);
  public static InventoryItem fries = new InventoryItem("French Fries", 15, 1.50);
  public static InventoryItem orange = new InventoryItem("Orange(s)", 6, 1.00);
  public static InventoryItem[] inventory = {burger, fries, orange};

  public static void main(String[] args) {
    regOne.topOTheMornin();
    regOne.desireToPurchase();
    System.out.println();
    System.out.println("Your cart has: ");
    for (int i=0; i<t1.purchasedItems.length; i++) {
      System.out.print(t1.itemQuantity[i] + " ");
      System.out.println(t1.purchasedItems[i].getName());
    }
    //regOne.desireToPurchase();
    //ReceiptPrinter.printReceipt();
  }
}
