package Question1;

import java.util.Scanner;

/**
 *
 * @author Javatar - Bedirhan Yıldırım
 */
public class Soru1yes {

    // 17 denyed yaptiktan sonra . 
    // hatalar olasilikta , esitlik bulamamk .
    // konrol vardi .
    public static void main(String[] args) {

        int N = 0, v = 0, k = 0, vScor = 0, kScor = 0, bitis = 11, esitlik = 10;
        String S;

        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        S = scan.next();
        for (int i = 0; i < N; i++) {

            if (S.charAt(i) == 'V') { // Volkan scor ekle
                vScor++;
            } else { // Kadir scor ekle
                kScor++;
            }

            if (vScor == esitlik && kScor == esitlik) {
                bitis++;
                esitlik++;
            }

            if (vScor == bitis) { // Volkan bitis olursa
                bitis = 11;
                vScor = 0;
                kScor = 0;
                esitlik = 10;
                v++;
            }

            if (kScor == bitis) { // Kadir bitis olursa
                bitis = 11;
                esitlik = 10;
                vScor = 0;
                kScor = 0;
                k++;
            }

        }
        if (vScor == 0 && kScor == 0) { //oyun bitmişse
            System.out.println(k + ":" + v);
        } else { //oyun bitmemişse
            System.out.println(k + ":" + v);
            System.out.println(kScor + ":" + vScor);

        }

    }
}
