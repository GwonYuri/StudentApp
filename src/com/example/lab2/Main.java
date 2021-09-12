package com.example.lab2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> al=new ArrayList<Student>();
		
		al.add(new Student(101, "Kim", 23)); //1명
		al.add(new Student(102, "Lee", 21)); //2명
		al.add(new Student(103,"Park",25)); //3명
		al.add(new Student(104,"Gwon",22)); //4명
		al.add(new Student(105,"Choi",27)); //5명
		al.add(new Student(106,"Shin",23)); //6명
		al.add(new Student(107,"Chang",25)); //7명
		al.add(new Student(108,"Joo",20)); //8명
		al.add(new Student(109,"Hahn",24)); //9명
		al.add(new Student(110,"Phyo",20)); //10
		
		System.out.println("Student List (ordered by name)");
		Collections.sort(al);
		
		for(Student s:al) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reversed ordered by name)");
		Collections.sort(al, Collections.reverseOrder());
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
