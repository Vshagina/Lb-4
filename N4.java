package com.company;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        int a, b, j, i;
        int[] num = new int[17];
        int[] name = new int[17];
        for (i = 1; i <= 16; i++) {
            num[i] = 0;
            name[i] = i;
        }
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        for (i = 1; i <= a; i++) {
            b = scanner.nextInt();
            num[b]++;
        }
        for (i = 16; i >= 2; i--) {
            for (j = 2; j <= i; j++){
                if (num[j-1]<num[j]){
                    b = num[j];
                    num[j] = num[j-1];
                    num[j-1] = b;
                    b=name[j];
                    name[j]=name[j-1];
                    name[j-1]=b;
                }
            }
        }
        for (i=1;i<=16;i++){
            if(num[i]>0){
                System.out.println(name[i]+ " " + num[i]);
            }
        }
    }
}
