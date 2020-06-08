package com.example.shoppinglist;

import java.util.List;

public class Day {
    private String dayName;
    private List<String> items;

    public Day(String dayName, List<String> items) {
        this.dayName = dayName;
        this.items = items;
    }

    public String getDayName() {
        return dayName;
    }

    public List<String> getItems() {
        return items;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
