import java.util.*;
import java.io.*;

public class BattleDecision{ //(CL)
  static void Battles() throws IOException{
    PrintWriter fileOut = new PrintWriter ("results.txt"); //(I/O)
    
    //Players will continue to fight until all three on one side dies. The prints score and winner to text file
    
    int score = 0;
    int a;
    do{
      Battle.Fight();
      Battle.Fight1();
      a = Battle.teams(CharacterList.party1[0].getDead(), CharacterList.party1[1].getDead(), CharacterList.party1[2].getDead(), CharacterList.party2[0].getDead(), CharacterList.party2[1].getDead(), CharacterList.party2[2].getDead()); //(MYMETH(O)) 
    }while(a==0);
    if(a == 1){
      System.out.println(StartMenu.name1 + " wins!");
      score += + 1;
      fileOut.println(StartMenu.name1 + "'s score: " + score); //(I/O)
    }
    else
      System.out.println(StartMenu.name2 + " wins!");
    score += 1;
    fileOut.println(StartMenu.name2 + "'s score: " + score);
    fileOut.close();
  }
  
}