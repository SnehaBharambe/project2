package collection;

import java.util.ArrayList;

public class Collection_1 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("ROSE");
		list.add("LOTUS");
		list.add("MOGRA");
		list.add(4563);
		list.add('S');
		list.add("JASMINE");
		list.add(new Collection_1());
		System.out.println("Size :"+list.size());
		System.out.println("Flower names :"+list);
		for(int i=0;i<=list.size();i++);{
		//System.out.println(list.get(i));
		}

	}

}
