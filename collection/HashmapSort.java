package com.example.demo;



import java.util.Collections;  
import java.util.Comparator;  
import java.util.HashMap;  
import java.util.Iterator;  
import java.util.LinkedHashMap;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.Map;  
import java.util.Set;  
public class HashmapSort   
{  
public static void main(String[] args)   
{  
 
HashMap<Integer, String> hm = new HashMap<Integer, String>();  
hm.put(6000, "Bhopal");  
hm.put(1200, "Indore");  
hm.put(50000, "Jaipur");  
hm.put(78003, "Agra");  
hm.put(12420, "kanpur");  
hm.put(67222, "Dhar");  
hm.put(10000, "Ujjain");  

System.out.println("Before Sorting:");  
Set set = hm.entrySet();  
Iterator iterator = set.iterator();  
while(iterator.hasNext())   
{  
Map.Entry map = (Map.Entry)iterator.next();  
System.out.println("Population:  "+map.getKey()+"     City:   "+map.getValue());  
}  



Map<Integer, String> map = sortValues(hm);  


System.out.println("\n");  
System.out.println("After Sorting:");  
Set set2 = map.entrySet();  
Iterator iterator2 = set2.iterator();  
while(iterator2.hasNext())   
{  
Map.Entry me2 = (Map.Entry)iterator2.next();  
System.out.println("Population:  "+me2.getKey()+"     City:   "+me2.getValue());  
}  
}  



 
private static HashMap sortValues(HashMap map)   
{   
List list = new LinkedList(map.entrySet());  
//Custom Comparator  
Collections.sort(list, new Comparator()   
{  
public int compare(Object o1, Object o2)   
{  
return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());  
	//return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());  
}  
}); 



//copying the sorted list in HashMap to preserve the iteration order  
HashMap sortedHashMap = new LinkedHashMap();  
for (Iterator it = list.iterator(); it.hasNext();)   
{  
 Map.Entry entry = (Map.Entry) it.next();  
sortedHashMap.put(entry.getKey(), entry.getValue());  
}   
return sortedHashMap;  
}  
}  
