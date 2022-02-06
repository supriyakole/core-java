package collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Clean India Green India Love India ";
HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
String[] s = str.split(" ");
for (String tempString : s) {
	if (hashMap.get(tempString)!= null) {
		hashMap.put(tempString,hashMap.get(tempString) + 1); }
	else {
		hashMap.put(tempString, 1);
}
}
System.out.println(hashMap);
	}
}