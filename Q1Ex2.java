/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;

/**
 *
 * @author MUON
 */
import java.util.Scanner;
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int range = 10;
      int min = 1;
      int guesses = 5;
      String response;
        do {System.out.println("Welcome to Higher or Lower! What will you do? \n"
               + "- Start game \n"
               + "- Change settings \n"
               + "- End application");
            response = sc.nextLine();
            switch(response) {
               case "Start game":
                int random = (int) Math.floor(Math.random()*range) + min;
                for (int remaining=guesses;
                    remaining>0; remaining--){
                    System.out.printf("You have id guess(es) left. What is your guess?", remaining);
                    int answer = Integer.parseInt (sc.nextLine());
                    if (answer==random) {System.out.println("You win!");
                    break;
                    }
                    }
            break; 
            case "Change settings": } 
            } while(repeat.equals("y"));
            System.out.print("Play again (y/n)?");
            
            
            {
             
             while(!response.equalsIgnoreCase ("End application"));
            }
