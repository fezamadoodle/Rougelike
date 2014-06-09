public class Armor extends InventoryItem{
  //somehow get the floor number
  
  int floorNumber, floorModifier, armorDefense;
  String name;
  
  
  
  public Armor(int num, String name) {
    floorNumber = num;
    name = name;
    floorModifier = (int)(Math.random() * floorNumber);
    armorDefense = floorModifier*10;

  }

}
