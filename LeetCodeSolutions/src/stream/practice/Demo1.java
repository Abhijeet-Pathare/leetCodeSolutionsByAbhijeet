package stream.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Demo1 {
	
	public static void main(String[] args) {
		
		char[] arr = new char[3];
		arr[0]='a';
		arr[1]= 'b';
		arr[2]=Integer.toString(1).charAt(0);
		for(char ch:arr) {
			System.out.println(ch);
		}
		
		
//		String[] arr = new String[]{"m", "u","u", "m","b","a","i"};
//		Map<String,Integer> map = new HashMap<>();
//		for(int i=0;i<arr.length;i++) {
//			if(map.containsKey(arr[i])) {
//				int a = map.get(arr[i]);
//				map.put(arr[i], ++a);
//				
//			}else {
//				map.put(arr[i], 1);
//			}
//		}
//		System.out.println(map);
//		Stream s = Stream.of(arr);
		
		
//		Stream<String> streamOfArrayFull = Arrays.stream(arr);
//		streamOfArrayFull.forEach(System.out::println);
//		Stream<String> streamOfArrayPart = Arrays.stream(arr,1,3);
//		streamOfArrayPart.forEach(System.out::println);
		
		
		
	List<Integer> list = Arrays.asList(3,2,1,4,5);
	OptionalInt max = list.stream().mapToInt(value->value).max();
	int max1 = list.stream().reduce(0,(x,y)->x>y?x:y);
	System.out.println("Max "+max1);
	//System.out.println(max1.getAsInt());
	
//		list.stream().sorted().forEach(System.out::println);
//		int a =list.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
//		System.out.println(a);
//		String w = "Abc";
//		char b = 'c';
//		System.out.println(w.contains(b));
		
		
	}
}
