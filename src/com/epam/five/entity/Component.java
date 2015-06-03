package com.epam.five.entity;

import java.util.ArrayList;

public interface Component {
    public void print();
    public ArrayList<String> split(ArrayList<String> text, String param);
}
