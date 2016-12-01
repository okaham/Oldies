import java.util.*;

import java.io.*;


public class pickOne{
  
  public static int choice(int n) throws IOException{
    Scanner input = new Scanner(new File("intro.txt"));
    Scanner scan = new Scanner(System.in);
    String intro = input.nextLine();
    
    
    
      switch(n){
    
      case 0:
      System.out.println(intro); //(I/0)
     
      case 1:
      System.out.println("Press 0 if you want to see the class list, press 1 if you are ready if you are ready to pick.");
      int cHoice = scan.nextInt();
      return cHoice;
    }
  return 1000;
  }
}
  
  
  
  
  
