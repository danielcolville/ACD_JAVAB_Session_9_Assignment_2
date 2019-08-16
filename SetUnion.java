package session9;

import java.util.HashSet;
import java.util.Set;

public class SetUnion {

	public static void main(String[] args) {
		
		
		Set<Integer> s1=new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			s1.add(i);
		}
		System.out.println("The first set:");
		for(Integer i:s1) {
			System.out.print(i+",");
		}
		Set<Integer> s2=new HashSet<Integer>();
		for(int i=5;i<15;i++) {
			s2.add(i);
		}
		System.out.println("\nThe second set:");
		for(Integer i:s2) {
			System.out.print(i+",");
		}
		s1.addAll(s2);
		System.out.println("\nUnion of these sets is:");
		for(Integer i:s1) {
			System.out.print(i+",");
		}
	}

}