package session9;

import java.util.HashSet;
import java.util.Set;

public class SetUnion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1=new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			s1.add(i);
		}
		Set<Integer> s2=new HashSet<Integer>();
		for(int i=5;i<15;i++) {
			s2.add(i);
		}
		s1.addAll(s2);
		for(Integer i:s1) {
			System.out.println(i);
		}
	}

}
