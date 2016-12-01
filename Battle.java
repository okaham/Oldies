import java.util.*;

public class Battle{
  

  static void Fight(){
    Boolean allDead = false;
    Scanner scan = new Scanner(System.in);
    int attackPick;
    
    for(int k = 0; k<3; k++){
      System.out.println("Battle start! " + StartMenu.name1 + ", your turn!");
      System.out.println(CharacterList.party1[k] + ", pick someone to attack"); // picks person to attack
      System.out.println("Damage: " + CharacterList.party1[k].attack); // display attack
      System.out.println();
      
      
      //Display Enemy Party
      party2();
      
      //pick who to attack
      
      attackPick = scan.nextInt();
      
      //Checks if live can attack

      while(true){
      if(CharacterList.party2[attackPick].getDead() == false){ 
         CharacterList.party2[attackPick].health -= critical(CharacterList.party1[k].attack); //(MYMETH) 
         break;
        }
      else
      {
        System.out.println("Sorry you can't attack the dead");
        System.out.println();
        if(CharacterList.party2[0].getDead() && CharacterList.party2[1].getDead() && CharacterList.party2[2].getDead()){
          break;
        }
        System.out.println(CharacterList.party1[k] + ", pick someone to attack");
        party2();
        attackPick = scan.nextInt();
        }
      }
      
      
      //print character
        if(CharacterList.party2[attackPick].health < 1){
          CharacterList.party2[attackPick].setDead(true);
        }
      }
    }
  
  //sdaiofjjadslfksadfkkdfjlsajfadskl;fj ;ldskajfkl;dsajfkl dsakl;fdsa;lkfjd;fioewajfoi;eawjf;oiaewjio;fjewaifjoa;ewjfioawejfio;adsj;lfdjaskl;f;dsal

    static void Fight1(){
    Boolean allDead = false; //(BOOL)
    Scanner scan = new Scanner(System.in);
    int attackPick;
    
    for(int k = 0; k<3; k++){
      System.out.println("Battle start! " + StartMenu.name2 + ", your turn!");
      System.out.println(CharacterList.party2[k] + ", pick someone to attack"); // picks person to attack
      System.out.println("Damage: " + CharacterList.party2[k].attack); // display attack
      System.out.println();
      
      
      //Display Enemy Party
      party1();
      
      
      //pick attack
      
      attackPick = scan.nextInt();
      //if live can attack

      while(true){
      if(CharacterList.party1[attackPick].getDead() == false){ //(BOOL)
         CharacterList.party1[attackPick].health -= critical(CharacterList.party2[k].attack); //(MYMETH(O)) //(RANDOM)
         break;
        }
      else
      {
        System.out.println("Sorry you can't attack the dead");
        System.out.println();
        if(CharacterList.party1[0].getDead() && CharacterList.party1[1].getDead() && CharacterList.party1[2].getDead()){
          break;
        }
        else{
        System.out.println(CharacterList.party2[k] + ", pick someone to attack");
        party1();
        attackPick = scan.nextInt();
        }
      }
      }
      

      
      //print character
        if(CharacterList.party1[attackPick].health < 1){
          CharacterList.party1[attackPick].setDead(true);
        }
      }
    }
  
    
  //decide critical strike chance  
    static double critical(int hit){ //(RANDOM)
      Random rand = new Random();
      double crit = rand.nextDouble();
      if(crit >0.9){
        hit = hit * 2;
        System.out.println("\n Critical Strike!\n");
      }
      return hit;
    }
    
    
    
    //prints out party members of enemy team
    
    static String party1(){
      
      System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*" + StartMenu.name1 + "'s Party~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
      for(int i = 0; i <3; i++){
        System.out.print(i + ". " + CharacterList.party1[i]);
        if(CharacterList.party1[i].getDead() == false){
          System.out.print("'s\tHP: " + CharacterList.party1[i].health);
        }
        else{              
          System.out.println("'s \tHP: dead.");
        }
        System.out.println();
      }
      System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
      return "hi";
    }
    
    
    static String party2(){
            System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*" + StartMenu.name2 + "'s Party~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
      for(int i = 0; i <3; i++){
        System.out.print(i + ". " + CharacterList.party2[i]);
        if(CharacterList.party2[i].getDead() == false){
          System.out.print("'s\tHP: " + CharacterList.party2[i].health);
        }
        else{            
          System.out.println("'s \tHP: dead.");
        }
        System.out.println();
      }
      System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
      return "hi";
    }
    
    
    
    //checks if all people have died or not
    static int teams(Boolean a, Boolean b, Boolean c, Boolean a1, Boolean b1, Boolean c1){ //(BOOL) //(MYMETH(O))
      if(a == true && b == true && c == true){
        System.out.println(StartMenu.name1 + " your squad has died, you lose.");
        return 2;
      }
      if(a1 == true && b1 == true && c1 == true){
        System.out.println(StartMenu.name2 + " your squad has died, you lose.");
        return 1;
      }
      
      return 0;
    }
    
  
}