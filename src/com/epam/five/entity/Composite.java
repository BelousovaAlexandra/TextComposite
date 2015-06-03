package com.epam.five.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class Composite implements Component {
        
        private String component;
	private List<Component> components = new ArrayList<>();
        //private String param;

        public Composite(String comp){
            component = comp;
        }
	public void add(Component component) {
		components.add(component);
	}
        public void add(Leaf leaf) {
		components.add(leaf);
	}

	public void remove(Component component) {
		components.remove(component);
	}

	public List<Component> getComponents() {
		return components;
	}

	public Component getComponent(int index) {
		return components.get(index);
	}

    /*
    @Override
    public String toString() {
        return "Composite{" + "components=" + components + "}\n";
    }
    */
        
    @Override
    public void print() {
        for (Component component1 : components) {
			component1.print();
		}
    }

    @Override
    public ArrayList<String> split(ArrayList<String> text, String param) {
        Locale loc = Locale.getDefault();
        ResourceBundle rb = ResourceBundle.getBundle("pattern", loc);
        String regex = rb.getString(param);
        ArrayList<String> newText = new ArrayList<>();
        
        for(String line: text){
            StringTokenizer st = new StringTokenizer(line,regex);
            while(st.hasMoreTokens()){  
                String str = st.nextToken();
                newText.add(str);
                component = str;
                components.add(new Composite(component));
            }
        }
        return newText;
    }

}
