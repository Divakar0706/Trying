package org.tambaram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Buses {
	public static void main(String[] args) {
		Map<String,Trains> m =new LinkedHashMap<>();
		
		Trains t=new Trains();
		t.setTrainnum(22262);
		t.setTrainname("pallavan");
        t.setPlatform(8);		
        
        Trains t1=new Trains();
        t1.setTrainnum(22565);
        t1.setTrainname("Pandian");
        t1.setPlatform(5);
        
        Trains t2=new Trains();
        t2.setTrainnum(22898);
        t2.setTrainname("Vaigai Express");
        t2.setPlatform(5);
        m.put("Train1",t);
        m.put("Train2",t1);
        m.put("Train3",t2);
        
        
        Set<Entry<String, Trains>> entrySet = m.entrySet();
        for (Entry<String, Trains> e : entrySet) {
        
        	System.out.println(e.getKey());
        	System.out.println(e.getValue().getTrainnum());
        	System.out.println(e.getValue().getTrainname());
        	System.out.println(e.getValue().getPlatform());
			
		}
		
	}
	
}


