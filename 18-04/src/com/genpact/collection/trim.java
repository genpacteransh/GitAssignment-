package com.genpact.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

 class trimList {
	public static List<String> trim (List<String> al) {
		
		List<String> list=new ArrayList<String>();
		Iterator<String> iterator=al.iterator();
		while(iterator.hasNext()) {
			list.add(iterator.next().trim());
		}
		//al.forEach(x->x.trim());
		return list;
	}
}

public class trim{
	public static void main(String args[]) {
		List<String> list=new ArrayList<String>(Arrays.asList("    asdf   ","    ansh  ","     asfd  "));
		List<String> latestStrings=trimList.trim(list);
		
		latestStrings.forEach(x->System.out.println(x));
	}
}