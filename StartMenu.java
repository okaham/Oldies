/******************************************
*                                         
* Kevin Huang       
*                                                                               
* E-mail:  kxhuang@syr.edu               
*                                         
* Final Project:  League of Legends           
*                                         
* Compiler:  Eclipse Compiler  on PC                     
*                                       
* 
*******************************************/

import java.util.*;
import java.io.*;

public class StartMenu{

  static String name1;
  static String name2;
  public static void main(String[] args) throws IOException{
    
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Welcome to Delorian Chronicles!");
    System.out.println("Player 1, please enter your name.");
    name1 = scan.nextLine();
    System.out.println("Welcome back "+name1+"!");
    System.out.println("Player 2, please enter your name.");
    name2 = scan.nextLine();
    System.out.println("Welcome back "+name2+"!");
    System.out.println("Press 0 to read the tutorial, press 1 to prepare for battle!");
    int cHoice = scan.nextInt(); 
    //Menu Picks
    int characterAnswer = pickOne.choice(cHoice);
    //Player 1 and 2 pick their characters
    CharacterList.charChoices(characterAnswer);
    CharacterList.charChoices2(characterAnswer);
    
    // Prints player party
    System.out.println();
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    
    System.out.println(name1 + " your party is: ");
    CharacterList.BubbleSort(CharacterList.party1); //(SORT)
    for(int i = 0; i <3; i++){
      System.out.println(CharacterList.party1[i]);
    }
    System.out.println("-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+-=+");
    System.out.println(name2 + " your party is: ");
    CharacterList.BubbleSort(CharacterList.party2); 
    for(int i = 0; i <3; i++){
      System.out.println(CharacterList.party2[i]);
    }

      
    System.out.println();
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    System.out.println();
    System.out.println("Enter any key to enter battle");
    scan.next();
    System.out.println();
    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    //fight
    BattleDecision.Battles(); //(MYMETH)
    
    
  }
  
  //stack overflow  source
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
  
  
  
  
}
