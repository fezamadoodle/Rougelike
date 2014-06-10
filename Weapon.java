public class Weapon extends InventoryItem{
  
  int damage;
  String type = "Weapon";
  
  public Weapon(int num, String name, int range){
    int floorNumber = num;
    name = name;
    int floorModifier = (int)(Math.random() * floorNumber);
    range = range;
    damage = floorModifier * 12;
    
  }
}
