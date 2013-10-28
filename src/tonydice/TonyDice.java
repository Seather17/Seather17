

package tonydice;

 //Seather
import javax.swing.JOptionPane;
import java.util.Random;
public class TonyDice {


    public static void main(String[] args) { 
        
        Random die1 = new Random();
        int roll;
     
        String totalDice;
        String sides;
        int diceRoll;
        int arrayP = 0;
        int total = 0;
        String allRolls = "ToNy DiCe!!!";
       
        sides = JOptionPane.showInputDialog("How Many Sides?");
        totalDice = JOptionPane.showInputDialog("How Many Dice?");
        int[] rollArray = new int[(Integer.parseInt(totalDice))];
        
        
        if ((Integer.parseInt(totalDice)) < 1839){
            for (roll=0; roll <(Integer.parseInt(totalDice)); roll++){
                diceRoll = (die1.nextInt(Integer.parseInt(sides))+1);
                rollArray[roll] = diceRoll;

            }


            for (arrayP=0; arrayP < (Integer.parseInt(totalDice)); arrayP++){
                total = total + rollArray[arrayP];
                       allRolls = allRolls +("\n" + "Die " + (arrayP + 1) + ":  " + rollArray[arrayP]);
            }

            JOptionPane.showMessageDialog(null, allRolls + "\n" + "Total: " + total);
            }
        
        else 
            JOptionPane.showMessageDialog(null,"YOUR COMPUTER WILL SELF DESTRUCT IN: "
                    + "\n 5 SECONDS","WARNING: To Many Dice...",JOptionPane.WARNING_MESSAGE);
        
        
       System.exit (0);
    }   
    
}

