public class Weapon extends InventoryItem{
  
  int damage;
  
  
  public Weapon(int num, String name, int range){
    int floorNumber = num;
    name = name;
    int floorModifier = (int)(Math.random() * floorNumber);
    range = range;
    damage = floorModifier * 12;
    
  }
  
  public void equip(){
    int playerDamage = 0;
    attack += damage;
  }
}
