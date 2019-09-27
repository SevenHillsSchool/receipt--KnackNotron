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
    if ((t1.purchasedItems[2].getName()==burger.getName() || t1.purchasedItems[2].getName()==fries.getName() || t1.purchasedItems[2].getName()==orange.getName())) {
      System.out.println("Your cart has: ");
      for (int i=0; i<3; i++) {
        System.out.print(t1.itemQuantity[i] + " ");
        System.out.println(t1.purchasedItems[i].getName());
      }
      System.out.println();
      t1.calculatePrice();
      System.out.println("Your subtotal: $" + t1.getTotalPrice() + "0\n");
    } else if ((t1.purchasedItems[1].getName()==burger.getName() || t1.purchasedItems[1].getName()==fries.getName() || t1.purchasedItems[1].getName()==orange.getName())) {
      System.out.println("Your cart has: ");
      for (int i=0; i<2; i++) {
        System.out.print(t1.itemQuantity[i] + " ");
        System.out.println(t1.purchasedItems[i].getName());
      }
      System.out.println();
      t1.calculatePrice();
      System.out.println("Your subtotal: $" + t1.getTotalPrice() + "0\n");
    } else if ((t1.purchasedItems[1].getName()==burger.getName() || t1.purchasedItems[1].getName()==fries.getName() || t1.purchasedItems[1].getName()==orange.getName())) {
      System.out.println("Your cart has: ");
      for (int i=0; i<1; i++) {
        System.out.print(t1.itemQuantity[i] + " ");
        System.out.println(t1.purchasedItems[i].getName());
      }
      System.out.println();
      t1.calculatePrice();
      System.out.println("Your subtotal: $" + t1.getTotalPrice() + "0\n");
    } else if (t1.purchasedItems[0]==null && t1.purchasedItems[1]==null && t1.purchasedItems[2]==null) {
      System.out.println("We\'re sorry to see you didn\'t purchase anything."+
        " We hope you come back soon!\n");
    } else {
      System.out.println("Error!");
    }
    ReceiptPrinter.printReceipt(t1);
  }
}
