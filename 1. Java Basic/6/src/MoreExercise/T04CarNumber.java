package MoreExercise;

import java.util.Scanner;

public class T04CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());
        int w = Integer.parseInt(scanner.nextLine());


        for (int i = q; i <= w; i++) {
            for (int j = q; j <= w; j++) {
                for (int ek = q; ek <= w; ek++) {
                    for (int k = q; k <w ; k++) {
                        if (i % 2 == 0 && k % 2 != 0 && i > k && (j + ek) % 2 == 0) {
                            System.out.printf("%d%d%d%d ",i,j,ek,k);
                        } else if (i % 2 != 0 && k % 2 == 0 && i > k && (j + ek) % 2 == 0) {
                            System.out.printf("%d%d%d%d ",i,j,ek,k);

                        }

                    }
                }
            }
        }
    }
    }

