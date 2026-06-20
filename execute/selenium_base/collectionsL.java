package selenium_base;
import java.util.*;

public class collectionsL {
	public static void main(String[] args) {
		String[] names = new String[]{"onyx","kinjal","dipanshu"};
		String[][] name = new String[][]{{"onyx","kinjal","dipanshu"},{"dipanshu","kinjal","dipanshu"}};
		ArrayListCollections(names);	
		HashCollections(name);
		System.out.println("-----------------------------");
		LinkedHashCollections(name);
	}
	
	public static void ArrayListCollections(String[] name) {
		List<String> nameCollection = new ArrayList<>();

		for(String s: name) {			
			nameCollection.add(s);
		}
		
		Iterator<String> it = nameCollection.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void HashCollections(String[][] name) {
	    HashMap<String, String> map = new HashMap<>();

	    for (String[] s : name) {
	        map.put(s[0], s[1]);
	    }

	    for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println("Key: " + entry.getKey() +
	                           ", Value: " + entry.getValue());
	    }
	}
	
	public static void LinkedHashCollections(String[][] name) {
	    LinkedHashMap<String, String> map = new LinkedHashMap<>();

	    for (String[] s : name) {
	        map.put(s[0], s[1]);
	    }

	    for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println("Key: " + entry.getKey() +
	                           ", Value: " + entry.getValue());
	    }
	    
	    System.out.println("-----------------------------");
	    
	    map.forEach((key,val) -> {
	    	System.out.println("Key: " + key + ", Value: " + val);
//	    	System.out.print(key+val);
	    });
	}

}
