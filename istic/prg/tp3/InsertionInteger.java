package fr.istic.prg.tp3;

import java.util.Scanner;

public class InsertionInteger {
    private static final int SIZE_MAX = 10;
    private int size;
    private final int[] array = new int[SIZE_MAX];

    public InsertionInteger() {
        // Le constructeur a pour role d'initaliser toutes les valeurs du tableau array
        // a 0 et de mettre la taille du nouveau tableau egale a celle a de array.
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        size = 0;
    }

    public int[] toArray() {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public boolean insert(int value) {
        if (value == 0 || size >= array.length) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return false;
            }
            if (array[i] > value) {
                for (int j = size; j > i; j--) {
                    array[j] = array[j - 1];
                }
                array[i] = value;
                size++;
                return true;
            }
        }

        array[size] = value;
        size++;
        return true;
    }

    public void createArray(Scanner scanner) {
        if (scanner == null) {
            return;
        }
        int input = scanner.nextInt();
        int compteur = 0;
        while (input != -1) {
            if (insert(input)) {
                compteur++;
            }
            input = scanner.nextInt();
        }
        size = compteur;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result = result + " " + array[i];
        }
        return result;
    }
}
