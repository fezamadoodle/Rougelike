public class Weapon extends InventoryItem{
  
  int damage;
  String type = "Weapon";
  final String[] types = {"Bronze", "Silver", "Gold", "Platinum"};
  
  public Weapon(int num, String name){
    int floorNumber = num;
    name = types[floorNumber];
    int weight = 4;
    int floorModifier = (int)(Math.random() * floorNumber);
    damage = floorModifier * 12;
    
  }
}
