//ReceiptPrinter.java

/* This is a java file 'stub' or piece of a file designed to get you started on
* learning to code in java, while at the same time, exploring a little more about
* collaboration, version control and multiple file scenarios.
*
*For this assignment, I would like you to fork, modify and commit this file, while
* adding the following elements to your code.
*
* The receipt printer file could take arguments or parametrs from another class
* This file will be purely for output
****************************************
* 40 characters is a standard width    *
* for typical receipt paper, your task *
* is to make output from the screen    *
* look like it is printing to a small  *
* receipt type printer, with all the   *
* text formatted to 40 characters wide *
*                                      *
* Have fun with the assignment!!       *
****************************************
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReceiptPrinter {
  public static void printReceipt(Transaction tranc) {
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    Date date = new Date();
    System.out.println(" ---------------------------------------");
    //System.out.printf("|%s                                |\n", "Name: ");
    //System.out.printf("|%s                                |\n", "Date: ");
    System.out.printf("|%s\t\t\t\t|\n", "Name: " + tranc.getPurchaser());
    System.out.printf("|%s\t\t\t|\n", "Date: " + formatter.format(date));
    System.out.printf("|\t\t\t\t\t|\n");
    System.out.printf("|\t\t\t\t\t|\n");
    System.out.printf("|%s\t\t\t|\n", "Items Purchased:");
    System.out.printf("|%d %s\t\t\t\t|\n", tranc.itemQuantity[0] , tranc.purchasedItems[0].getName());
    System.out.printf("|%d %s\t\t\t\t|\n", tranc.itemQuantity[1], tranc.purchasedItems[1].getName());
    System.out.printf("|%d %s\t\t\t\t|\n", tranc.itemQuantity[2], tranc.purchasedItems[2].getName());
    System.out.printf("|\t\t\t\t\t|\n");
    System.out.printf("|\t\t\t\t\t|\n");
    System.out.printf("|\t\t\t\t\t|\n");
    System.out.printf("|\t\t\t\t\t|\n");
    System.out.printf("|%s\t\t\t|\n", "Subtotal: $" + tranc.getTotalPrice() + "0");
    System.out.printf("|%s\t\t\t|\n", "Tax: $" + (tranc.getTotalPrice()*Main.taxRate));
    System.out.printf("|%s\t\t\t|\n", "Total: $", (tranc.getTotalPrice()+(tranc.getTotalPrice()*Main.taxRate)));
    System.out.printf("|\t\t\t\t\t|\n");
    System.out.println(" ---------------------------------------");
  }

  public static void main(String[] args) {

  }
}
