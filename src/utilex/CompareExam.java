package utilex;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	int score;
	String name;
	
	public Person (int score, String name) {
		this.score = score;
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		if(this.score < p.score) return -1;
		else if(this.score == p.score) return 0;
		else return 1;
	}
}
public class CompareExam {
	
	public static void main(String[] args) {
		Person boo1 = new Person(15, "부진");
		Person boo2 = new Person(45, "부각");
		Person boo3 = new Person(11, "진부");
		
		TreeSet<Person> tSet = new TreeSet<Person>();
		tSet.add(boo1);
		tSet.add(boo2);
		tSet.add(boo3);
		
		for(Person p : tSet) {
			System.out.println(p.name + " : " + p.score);
		}
		
	}

}
