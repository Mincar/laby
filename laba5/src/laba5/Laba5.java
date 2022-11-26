/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba5;

/**
 *
 * @author User
 */
public class Laba5 {

    /**
     * @param args the command line arguments
     */
   public static int sum (int x, int y){
        return x+y;
    }
    public static int division (int x, int y){
        if(y==0)
        {
            throw new IllegalArgumentException("divider is 0");
        }
        return x/y;
    }
    public static void main(String[] args) {
	// write your code here
        if(sum(1,3)==4)
        {
            System.out.println("Test1 passed");
        } else
        {
            System.out.println("Test1 failed");
        }
        try
        {
            int z = division(1,0);
            System.out.println("Test3 failed");
        } catch (IllegalArgumentException e)
        {
            System.out.println("Test3 passed");
        }
    }
    
}
