import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetWithLoop {
public static void main(String[] args) {
	HashMap<String,String> hm= new HashMap<>();
	hm.put("Snehal", "111");
	hm.put("AAA", "222");
	hm.put("BBB", "333");
	Set<Map.Entry<String,String>> entry= hm.entrySet();
	Iterator<Map.Entry<String,String>> itr= entry.iterator();
	for(Map.Entry<String,String> mn:entry) {
		System.out.println("Key:"+mn.getKey()+"  "+"Value:"+mn.getValue());
	}
	
}
}
