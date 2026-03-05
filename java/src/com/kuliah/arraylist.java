package com.kuliah;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        int[] angkaArray = {1, 2, 3, 4, 5};
        ArrayList<Integer> angkaList = new ArrayList<>();
        angkaList.add(6);

        System.out.println("Array angka:");
        System.out.println(angkaList);
    }
}