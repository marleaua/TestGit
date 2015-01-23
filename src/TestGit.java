/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ag891174
 */
public class TestGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if (args.length != 1) {
            System.out.println("Wrong args");
            System.exit(1);
        }
        
        System.out.println("Hello " + args[0] + "!");
        System.out.println("Changement commit 1");
        System.out.println("Changement commit 2");
        System.out.println("Changement commit Bla Bla Bla");
        
    }
    
}
