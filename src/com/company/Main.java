package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Random random = new Random();
        int[] array = new int[10];

        for( int i=0; i< array.length; i++){
            array[i]= random.nextInt( (10)+3);

            System.out.println(array[i]);
            if(array[i]==0){
                i+=i;
                System.out.println("\n\n" + i );
            }
            System.out.println();
        }

    }
}
