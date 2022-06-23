import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetWithIterator {
public static void main(String[] args) {
	HashMap<String,String> hm= new HashMap<>();
	hm.put("Snehal", "111");
	hm.put("AAA", "222");
	hm.put("BBB", "333");
	Set<String> entries= hm.keySet();
	Iterator<String> itr= entries.iterator();
	while(itr.hasNext()) {
		String key=itr.next();
		System.out.println("Keys:"+key+"    "+"Values:"+hm.get(key));
	}
	
	
}
}
