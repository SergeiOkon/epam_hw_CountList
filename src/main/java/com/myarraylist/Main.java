package com.myarraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(2));
    }
}