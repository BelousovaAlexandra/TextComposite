package com.epam.five.entity;

import java.util.ArrayList;


public class Leaf implements Component{
    private String word;
    
    public Leaf(String name) {
        this.word = name;
    }
    public Leaf(Leaf leaf){
        this.word = leaf.getWord();
    }

    public String getWord() {
        return word;
    }
       
    @Override
    public ArrayList<String> split(ArrayList<String> text, String param) {
        //move to Actions package
        return text;
    }
    @Override
    public void print() {
        System.out.println(word);
    }

    @Override
    public String toString() {
        return "Leaf{" + "word=" + word + "}\n";
    
    }
    
}
