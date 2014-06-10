public class Armor extends InventoryItem{
  //somehow get the floor number
  
  int floorNumber, floorModifier, armorDefense;
  String name;
  String type = "Armor";
  final String[] types = {"Bronze" , "Silver", "Gold", "Platinum"};
  
  
  public Armor(int num) {
    floorNumber = num;
    int weight = 3;
    floorModifier = (int)(Math.random() * floorNumber);
    name = types[floorNumber];
    armorDefense = floorModifier*10;

  }

}
