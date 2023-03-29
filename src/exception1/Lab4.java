/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception1;

/**
 *
 * @author User
 */
public class Lab4 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try{
            System.out.println("statement1");
            System.out.println(1/0);
            System.out.println("statement3");
        }
        catch (ArrayIndexOutOfBoundsException e){
        }
        catch (ArithmeticException e){
            throw new StringIndexOutOfBoundsException();
        }
        finally {
            System.out.println("statement4");
        }
        System.out.println("statement5");
    }
}
