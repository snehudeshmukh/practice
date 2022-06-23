import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrySetWithIterator {
public static void main(String[] args) {
	HashMap<String,String> hm= new HashMap<>();
	hm.put("Snehal", "123");
	hm.put("Pooja", "111");
	hm.put("Priyanka", "222");
	Set<Map.Entry<String,String>> entries=hm.entrySet();//convert into set view
	Iterator<Map.Entry<String,String>> itr=entries.iterator();
	while(itr.hasNext()) {
		//System.out.println(itr.next());
		Map.Entry<String, String>entry=itr.next();//convert into map again
		System.out.println("Key:"+entry.getKey()+"   "+"Values:"+entry.getValue());
	}
	
}
}
