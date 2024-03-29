public class Main {
  public static Register regOne = new Register();
  public static Transaction t1 = new Transaction("Nik");

  public static InventoryItem burger = new InventoryItem("Burger(s)", 6.00);
  public static InventoryItem fries = new InventoryItem("French Fries", 1.50);
  public static InventoryItem orange = new InventoryItem("Orange(s)", 1.00);
  public static InventoryItem[] inventory = {burger, fries, orange};

  public static float taxRate = 0;

  public static void main(String[] args) {
    regOne.topOTheMornin();
    regOne.desireToPurchase();
    System.out.println();
    if (t1.purchasedItems[0]==null && t1.purchasedItems[1]==null && t1.purchasedItems[2]==null) {
      System.out.println("We\'re sorry to see you didn\'t purchase anything."+
        " We hope you come back soon!\n");
    } else {
        t1.calculatePrice();
      }
    ReceiptPrinter.printReceipt(t1);
  }
}
