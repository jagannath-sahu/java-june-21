package com.java.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MisuseOptional2 {

	public static void main(String[] args) {
		List<Person1> people = new ArrayList<Person1>();
		people.add(new Person1("john", 26));
		people.add(new Person1("Peter", 34));

		//searchMisUse(people, "Peter", null).forEach(System.out::println);

		searchLessEfficient(people, "Peter", null).forEach(System.out::println);

		search(people, "Peter").forEach(System.out::println);
	}

	//dangerous, way to use Optionals: passing an Optional parameter to a method.
	public static List<Person1> searchMisUse(List<Person1> people, String name, Optional<Integer> age) {
	    // Null checks for people and name
	    return people.stream()
	            .filter(p -> p.getName().get().equals(name))
	            .filter(p -> p.getAge().get() >= age.orElse(0))
	            .collect(Collectors.toList());
	}

	public static List<Person1> searchLessEfficient(List<Person1> people, String name, Integer age) {
	    // Null checks for people and name
	    final Integer ageFilter = age != null ? age : 0;

	    return people.stream()
	            .filter(p -> p.getName().get().equals(name))
	            .filter(p -> p.getAge().get() >= ageFilter)
	            .collect(Collectors.toList());
	}


	//best method
	public static List<Person1> search(List<Person1> people, String name) {
	    return doSearch(people, name, 0);
	}

	public static List<Person1> search(List<Person1> people, String name, int age) {
	    return doSearch(people, name, age);
	}

	private static List<Person1> doSearch(List<Person1> people, String name, int age) {
	    // Null checks for people and name
	    return people.stream()
	            .filter(p -> p.getName().get().equals(name))
	            .filter(p -> p.getAge().get().intValue() >= age)
	            .collect(Collectors.toList());
	}

}

class Person1 {
    private String name;
    private int age;
    private String password;

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public Optional<String> getPassword() {
        return Optional.ofNullable(password);
    }

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", password=" + password + "]";
	}

}

