package fr.istic.prg.tp3;

import java.util.Scanner;

import fr.istic.prg.tp3.InsertionInteger;

public class TestInsertionInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        InsertionInteger insertionInteger = new InsertionInteger();
        insertionInteger.createArray(scanner);
        System.out.println(insertionInteger);

        scanner.close();
    }
}
