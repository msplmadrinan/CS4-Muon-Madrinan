/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex1;

/**
 *
 * @author MUON
 */
public class Ex01MuonMadrinan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1 = "Paris Madrinan";
        int num1 = 16;
        String genshin1 = "Kokomi";
        System.out.println("Name: " + name1);
        System.out.println("Age: " + num1);
        System.out.println("Favorite Genshin Impact character: " + genshin1);
       
        String name2 = "Julia Madrinan";
        int num2 = 9;
        String genshin2 = "Fischl";
        System.out.println("Name: " + name2);
        System.out.println("Age: " + num2);
        System.out.println("Favorite Genshin Impact character: " + genshin2);
        
        String name3 = "Arianna Madrinan";
        int num3 = 7;
        String genshin3 = "Ganyu";
        System.out.println("Name: " + name3);
        System.out.println("Age: " + num3);
        System.out.println("Favorite Genshin Impact character: " + genshin3);
        
        int sumnum = num1 + num2 + num3;
        boolean older = num1 > num3;
        boolean younger = num2 < num1;
        System.out.println("All ages combined: " + sumnum);
        System.out.println("Paris is older than Arianna: " + older);
        System.out.println("Julia is younger than Paris: " + younger);
    }
}
