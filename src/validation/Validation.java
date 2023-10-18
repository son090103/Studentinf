
package validation;

import java.util.ArrayList;
import java.util.Scanner;



public class Validation {

    private final static Scanner sc = new Scanner(System.in);
  
    public float checkinputfloat(){
        return sc.nextFloat();
    }
    
    public  int checkInputInt(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                System.out.println("please Enter between " + min + "and " + max);
                System.out.println("Enter again: ");
            }
        }
    }

    public  String checkInputString() {
        while (true) {
            String result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println("Not Empty");
                System.out.println("Enter again: ");
            } else {
                return result;
            }
        }
    }
    public boolean checkyesno(){
         while (true) {
            String result = sc.nextLine();
            if (result.length() == 1 && result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.length() == 1 && result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Re-input.");
        }
    }
}
