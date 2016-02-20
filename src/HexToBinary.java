import java.util.Scanner;

public class HexToBinary {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a hex digit: ");
    String temp = input.nextLine();
    char temp2 = temp.charAt(0);
    int digit = (int)temp2;
    
    if (temp2 < 'A' || temp2 > 'F')
      System.out.println(temp2 + " is an invalid input");
    else{
      digit = temp2 - 'A' + 10;  
      System.out.println("The binary value is " + 
            Integer.toBinaryString(digit));
    } // else  
  } // main    
} // HexToBinary
