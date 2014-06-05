public class Armor extends InventoryItem{
  //somehow get the floor number
  
  int floorNumber, floorModifier, fireDefense, poisonDefense, armorDefense;
  String name;
  
  
  
  public Armor(int num, String name) {
    floorNumber = num;
    name = name;
    floorModifier = (int)(Math.random() * floorNumber);
    armorDefense = floorModifier*10;
    fireDefense = floorModifier*5;
    poisonDefense = floorModifier*3;
  }
  
  public void equip(){
    
    //the player has stats that would have their defense/offense levels???? currently setting to 0
    int defense = 0;
    defense += armorDefense;
  }
}
