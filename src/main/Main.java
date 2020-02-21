package main;

import definition.TowerOfHanoi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NoOfDisk;
        System.out.println("Enter no. of disks");
        NoOfDisk = sc.nextInt();
        System.out.println("Enter From Peg");
        char FromPeg = sc.next().charAt(0);
        System.out.println("Enter Via Peg");
        char ViaPeg = sc.next().charAt(0);
        System.out.println("Enter To Peg");
        char ToPeg = sc.next().charAt(0);
        if (NoOfDisk == 0)
            System.out.println("No Disks");
        else {
            System.out.println(TowerOfHanoi.showMoves(NoOfDisk, FromPeg, ViaPeg, ToPeg));
        }


    }

}
