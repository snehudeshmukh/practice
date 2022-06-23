import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class KeySetWithLoop {
public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<>();
	hm.put("Snehal", "111");
	hm.put("AAA", "222");
	hm.put("BBB", "333");
	Set<String> entries=hm.keySet();
	Iterator<String> entry=entries.iterator();
	for(String  abc:entries) {
		System.out.println("Keys:"+abc+"   "+"Values:"+hm.get(abc));
	}
	
	
}
}
