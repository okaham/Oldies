import java.util.*;


public class CharacterList{
  
  
  Boolean dead = false;
  int health, attack;
  String name;
  static CharacterList[] party1 = new CharacterList[3];
  static CharacterList[] party2 = new CharacterList[3];
  
  
  
  
  public CharacterList(String n, int hp, int dmg, Boolean deads){
    health = hp;
    attack = dmg;
    name = n;
    dead = deads;
  }
  
  public Boolean getDead(){
    return dead;
  }
  
  public void setDead(Boolean a){
    dead = a;
    
  }
  
  public static int charChoices(int n){
    
    
    Scanner scan = new Scanner(System.in);
    
    CharacterList[] list = new CharacterList[5]; //(AR)
    list[0] = new CharacterList("Chaos Mage", 80, 25, false);
    list[1] = new CharacterList("Shadow Blade", 70, 35, false);
    list[2] = new CharacterList("Black Guard", 175, 10, false);
    list[3] = new CharacterList("Sniper", 50, 20, false);
    list[4] = new CharacterList("Berserker", 61, 45, false);
      
    switch(n){
      
      //Player 1 picks units
      
      case 0:
        System.out.println("Chaos Mage(25 damage, 80 health)\nShadowblade (35 damage, 70 health)\nBlackguard (10 damage, 175 health)\nSniper (20 damage, 50 health)\nBerserker (45 damage, 61 health)");
        System.out.println("Insert any key to continue");
        scan.next();
        System.out.println("Pick 3 characters to place in your squad.");
        for(int i = 0; i < 3; i++){
          System.out.println("0. Chaos Mage\n1. Shadowblade\n2. Blackguard\n3. Sniper\n4. Berserker");
          party1[i]=list[scan.nextInt()];
          }
        
        System.out.println("Pick a character to search");
        scan.nextLine();
        String pick = scan.nextLine();
        System.out.println(search(party1, 0, pick, 2));  //(SEARCH)


        break;
        
      case 1:
        System.out.println("Pick 3 characters to place in your squad.");
        for(int i = 0; i < 3; i++){
          System.out.println("0. Chaos Mage\n1. Shadowblade\n2. Blackguard\n3. Sniper\n4. Berserker");
          party1[i]=list[scan.nextInt()];
        }
    }
    return n;
  }
  
  
  
  
  
  
 //Player 2 picks units 
  public static int charChoices2(int n){
    
    
    Scanner scan = new Scanner(System.in);
    
    CharacterList[] list2 = new CharacterList[5];
    list2[0] = new CharacterList("High Priest", 70, 35, false);
    list2[1] = new CharacterList("Hidden", 30, 45, false);
    list2[2] = new CharacterList("Templar", 130, 15, false);
    list2[3] = new CharacterList("Ace", 40, 55, false);
    list2[4] = new CharacterList("Axeman", 36, 60, false);
      
    switch(n){
      
      case 0:
        System.out.println("High Priest(35 damage, 70 health)\nHidden (45 damage, 30 health)\nTemplar (15 damage, 130 health)\nAce (55 damage, 40 health)\nAxeman (60 damage, 36 health)");
        System.out.println("Insert any key to continue");
        scan.next();
        System.out.println("Pick 3 characters to place in your squad.");
        for(int i = 0; i < 3; i++){
          System.out.println("0. High Priest\n1. Hidden\n2. Templar\n3. Ace\n4. Axeman");
          party2[i]=list2[scan.nextInt()];
        }
        System.out.println("Pick a character to search");
        String pick = scan.nextLine();
        System.out.println(search(party2, 0, pick, 2));
        
        break;
        
      case 1:
        System.out.println("Pick 3 characters to place in your squad.");
        for(int i = 0; i < 3; i++){
          System.out.println("0. High Priest\n1. Hidden\n2. Templar\n3. Ace\n4. Axeman");
          party2[i]=list2[scan.nextInt()];
        }
        break;
    }
    return n;
  }
  
  
  //searchfunction
  public static int search(CharacterList[] theArray, int start, String target, int arrSize){
    int z = 0;
    while (z<= arrSize){
      if(theArray[z].equals(target)){
        return z;
      }
      else
        z++;
    }
    return -1;
  }
  
  
  public String toString(){
    return name;
  }
  
  
  
  //sort
  public static void BubbleSort(CharacterList[] num){
    int j;
    boolean flag = true;
    CharacterList temp;
    
    while(flag){
      flag=false;
      for(j=0; j<num.length-1;  j++){
        if (num[j].name.compareTo(num[j+1].name) < 0 ){
          temp = num[j];
          num[j] = num[j+1];
          num[j+1] = temp;
          flag = true;
        } 
      } 
    } 
  } 
  
  
  
  
  
}
