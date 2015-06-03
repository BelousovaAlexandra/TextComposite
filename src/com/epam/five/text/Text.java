package com.epam.five.text;

import com.epam.five.action.ReadText;
import com.epam.five.entity.Composite;
import com.epam.five.entity.Leaf;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

public class Text {
    
    private final static Logger LOG = Logger.getLogger(Text.class);
    
    static{
        new DOMConfigurator().doConfigure("config/log4j.xml", LogManager.getLoggerRepository());
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Locale loc = Locale.getDefault();
        ResourceBundle rb = ResourceBundle.getBundle("pattern", loc);
        
        
        ReadText rt = new ReadText();
        ArrayList<String> text = rt.returnText();
        
        
        
        ArrayList<String> words; 
        
        
        Composite paragraph = new Composite("paragraph");
        Composite sentence = new Composite("sentence");
        
        
        String regex = rb.getString("paragraph");
        words = paragraph.split(text, "paragraph");
        /*for(String word1: words){
            sentence.add(new Composite(word1));
        }*/
        ArrayList<String> words2 = sentence.split(words, "sentence");
        Composite word = new Composite("word");
        ArrayList<String> words3 = word.split(words2,"word");
        for(String word1: words3){
            System.out.println(word1);
        }
        
	
    }
}
