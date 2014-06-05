public class Weapon extends InventoryItem{
  
  int floorNumber, floorModifier, range, damage, fireDamage, poisonDamage;;
  
  
  public Weapon(int num, String name, int range){
    floorNumber = num;
    name = name;
    floorModifier = (int)(Math.random() * floorNumber);
    range = range;
    damage = floorModifier * 12;
    fireDamage = damage/3;
    poisonDamage = damage/4;
  }
  
  public void equip(){
    int playerDamage = 0;
    playerDamage += damage;
  }
}
