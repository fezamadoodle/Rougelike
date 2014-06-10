public class Container{
  final int SIZE = 15;
  final int MAXWEIGHT = 50;
  int currWeight;
  
  public Container(){
    InventoryItem[] inventory = new InventoryItem[SIZE];
  }
  
  public void addItem(InventoryItem z, InventoryItem[] i){
    InventoryItem[] inventory = i;
    if(inventory[SIZE-1] != null){
      System.out.println("The inventory is full");
    }
    if((currWeight + z.weight) > MAXWEIGHT){
      System.out.println("TOO HEAVY");
    }
    else{
      for(int x = 0; x < SIZE; x++){
        if(inventory[x].name == z.name && z.stackable){
          //add it to that
        }
        else if(inventory[x] == null){
          inventory[x] = z;
          x=30;
        }
      }
    }
  }
}
