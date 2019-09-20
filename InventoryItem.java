public class InventoryItem {
  String name;
  int stock;

  public InventoryItem(String nameName, int stockStock) {
    name = nameName;
    stock = stockStock;
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
}