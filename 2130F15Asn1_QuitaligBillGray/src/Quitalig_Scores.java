

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xzeathri16
 */
public class Quitalig_Scores {
 
    int scoreArray[][]= new int [2][4];
    
    
    public Quitalig_Scores()
    {
        //default constructor
    }
     public Quitalig_Scores(int scoreboard[][])
    {
        scoreArray = scoreboard;
        getTotalScore(scoreArray);
    }
    
    //method definition to get the total score
      public static String getTotalScore(int scoreArray[][])  
    {
          int total = 0;
          for(int i=0; i<4; i++)
          {
              total = total + scoreArray[ 1 ][i];
          }
         
          return total + " pts";
     }
    
     //method definition to get the percentage
      public static String getPercentage(int scoreArray[][])  
    {
          double percentage = 0;
         
          int tot = 0;
          for(int i=0; i<4; i++)
          {
              tot = tot + scoreArray[ 1 ][i];
          }
          
          percentage = (tot*100)/100;


          return percentage + " %";
     }
    
    
}
