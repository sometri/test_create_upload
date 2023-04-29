package com.javacambodia.tryonbasic.any;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DoMain {
	private static DoMain thisClass = new DoMain();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Gender> tableGenders = new ArrayList<>();
		tableGenders.add(new Gender(1, "Male", "ប្រុស"));
		tableGenders.add(new Gender(2, "Female", "ស្រី"));
		tableGenders.add(new Gender(3, "Unknow", "NA"));
		
		List<Student> tableStudents = new ArrayList<>();
		
		Student sophal = new Student();
		sophal.setId(1);
		sophal.setGender(thisClass.findGender(1, tableGenders));
		sophal.setName("Sophal");
		tableStudents.add(sophal);
		
		Student sophy = new Student();
		sophy.setId(2);
		sophy.setGender(thisClass.findGender(2, tableGenders));
		sophy.setName("Sophy");
		tableStudents.add(sophy);
		
		Student sophey = new Student();
		sophey.setId(3);
		sophey.setGender(thisClass.findGender(4, tableGenders));
		sophey.setName("Sophey");
		tableStudents.add(sophey);
		
		tableStudents.stream().forEach(o -> System.out.println(o.toString()));
	}
	
	public Gender findGender(int id, List<Gender> table) {
		Gender unknowGender = new Gender(3, "Unknown", "NA");
		if (table == null || table.isEmpty()) return unknowGender;
		
		Optional<Gender> optGender = table.stream().filter(o -> o.getId() == id).findFirst();
		
		return optGender.orElse(unknowGender);
	}

}
