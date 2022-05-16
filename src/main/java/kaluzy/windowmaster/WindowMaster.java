/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package kaluzy.windowmaster;

//import java.io.InputStream;

import java.util.Scanner;


/**
 * Calculate area of height and width and cost of the area and perimeter 
 * @author kaluzy
 */
public class WindowMaster {
    
    public static void main (String[] args){
        // declare variables for height, width
        
        float height;
        float width;
        
        // declare string variables for height and width to hold
        // value from the input
        
        String stringHeight;
        String stringWidth;
        
        // declare the other variables
        // Float area cost, Float perimeter cost
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // declare & init the Scanner
        
        Scanner myScanner = new Scanner(System.in);
        
        // get input from user
        
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();
        
        // convert string input of height & width to Float
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        // calculate the area of the window
        
        areaOfWindow = height * width;
        
        // calculate the perimeter of the window
        
        perimeterOfWindow = 2 * (height + width);
        
        // calculate total cost 
        // material cost it is hard coded cause the price is same for this case    
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        // display the results
        
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total cost = " + cost);

        
        
        
        
        
        
    }
    }

    