package com.java.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class MoreJava8 {

	public static void main(String[] args) {
		Person2 person1 = new Person2("Jagannath", 33, "deb@gmail.com");
		Person2 person2 = new Person2("Debipriya", 30, "jagannath8715@gmail.com");

		Person2 person3 = new Person2("Ram", 17, "ram@gmail.com");
		Person2 person4 = new Person2("Shyam", 16, "shyam@gmail.com");

		List<Person2> personList = new ArrayList<Person2>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);

		List<InetAddress> inetaddlist = personList.stream().map(person -> person.getAddress()).map(InetAddress::new)
							.collect(Collectors.toList());

		System.out.println(inetaddlist);

		personList.stream().collect(groupingBy(person -> person.age > 18 ? "ADULT" : "UNDERAGE"))
						.forEach((a, b) -> System.out.println(a + "-" + b));

		Map<Object, List<InetAddress>> ageGroup = personList.stream()
				.collect(groupingBy(person -> person.age > 18 ? "ADULT" : "UNDERAGE",
				mapping(p -> new InetAddress(p.getAddress()), toList())
				));


		ageGroup.forEach((a, b) -> System.out.println(a + "-" + b));


		System.out.print("max age is : ");
		System.out.println(personList.stream().map(person -> person.getAge())
				.reduce((max, age) -> age.get() > max.get() ? age : max).get().get());

		System.out.println(personList.stream().map(person -> person.getName()).map(p -> p.get())
				.reduce("Names: ", String::concat));
	}

}

class Person2 {
	public String name;
	public int age;
	public String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public Optional<Integer> getAge() {
		return Optional.ofNullable(age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person2(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person2(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}

class InetAddress {
	private String emailAddress;

	public InetAddress(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "InetAddress [emailAddress=" + emailAddress + "]";
	}

}
