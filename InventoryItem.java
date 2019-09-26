public class InventoryItem {
  String name;
  double price;

  public InventoryItem(String nameName, double pricePrice) {
    name = nameName;
    price = pricePrice;
  }

  public String getName() {
    return name;
  }
  public void setName(String newName) {
    name = newName;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(int newPrice) {
    price = newPrice;
  }
}
