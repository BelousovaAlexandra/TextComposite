package com.epam.five.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadText {
    private final Scanner sc;
    private ArrayList<String> text = new ArrayList<>();

    public ReadText() throws FileNotFoundException {
        sc = new Scanner(new FileInputStream("input.txt"));
    }
    
    public ReadText(String name) throws FileNotFoundException {
        this.sc = new Scanner(new FileInputStream(name));
    }
    public ArrayList<String> returnText(){
        while(sc.hasNextLine()){
            text.add(sc.nextLine());
        }
        return text;
    }
    
}
