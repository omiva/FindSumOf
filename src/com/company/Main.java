package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {System.out.println("ENTER A NATURAL NUMBER: ");
        Scanner ss= new Scanner(System.in);
        int numbCount=ss.nextInt();
        int j=0,i=1;
        while(i<=numbCount)
        {
            j=j+i;
            i++;
        }
        System.out.println("\nSUM OF THE FIRST "+numbCount+" NATURAL NUMBERS ARE: "+j);
    }

}
