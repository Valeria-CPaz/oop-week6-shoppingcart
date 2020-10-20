package com.val;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Items> items = new ArrayList<Items>();

        items.add(apple);
        items.add(orange);

        Double [] price = {0.60, 0.25};
        int quantity = 0;
        double sum = 0;

        for (int i = 0; i< items.length; i++) {
            sum+=price[i] * quantity;
        }

        System.out.println(sum);

    }
}
