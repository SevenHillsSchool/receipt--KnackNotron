public class InventoryItem {
  String name;
  int stock;
  double price;

  public InventoryItem(String nameName, int stockStock, double pricePrice) {
    name = nameName;
    stock = stockStock;
    price = pricePrice;
  }

  public String getName() {
    return name;
  }
  public void setName(String newName) {
    name = newName;
  }

  public int getStock() {
    return stock;
  }
  public void setStock(int newStock) {
    stock = newStock;
  }

  public double getPrice() {
    return price;
  }
  public void setPrice(int newPrice) {
    price = newPrice;
  }
}
