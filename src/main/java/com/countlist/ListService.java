package com.countlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListService {
    private List<Integer> list = new ArrayList<>();

    public void fillList() {
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(9);
        list.add(0);
    }

    public void getGroups() {
        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        map.forEach((k, v) -> System.out.println(k + " - " + v));

    }
}