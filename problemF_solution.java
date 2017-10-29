/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;


import java.util.Scanner;
import java.util.Stack;


/**
 *
 * @author abdurrahman Rajab
 */
public class Soru6_solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

// iki deney olduktan sonra cozuldu ilk denyin hatasi , sysetem anlamamk.
        Scanner sc = new Scanner(System.in);

        Stack stk = new Stack();
        int loopTime = sc.nextInt(); // donme 
//        System.out.println(loopTime); 
//        char oku;
        String x;
        int sayac = 0; // istedigi cevab 
        for (int i = 0; i < loopTime; i++) {
            x = sc.next(); // sonraki harf okur 
//            System.out.println(x);
            if ((x.charAt(0)) == 'A') { // Eger A ise ekleme yapar. 
                x = sc.next();
                stk.push(new Character(x.charAt(0)));
//                System.out.println((char) stk.peek());

            } else if ((char) stk.pop() == 'B') { // Eger poptaki olan harf B ise .Eger ilk harf A degile se R olacak  
                sayac += i;
            }
//            System.out.println(i);
        }
        System.out.println(sayac);
    }

}
