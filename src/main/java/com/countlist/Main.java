package com.countlist;

public class Main {
    public static void main(String[] args) {
        ListService listService = new ListService();
        listService.fillList();
        listService.getGroups();
    }
}