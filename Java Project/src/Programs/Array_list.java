package Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("abc");
		obj.add("steav");
		obj.add("lucy");
		obj.add("pat");
		obj.add("Angela");
		obj.add("Tom");
		
	Iterator it=obj.iterator();
		while(it.hasNext())
		{
			String obj1=(String) it.next();
			System.out.println(obj1);
		}
		System.out.println(obj);
		obj.add(3,"sonal");
		System.out.println(obj);
   

	}

}
