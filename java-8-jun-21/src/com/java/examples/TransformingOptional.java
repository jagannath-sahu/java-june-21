package com.java.examples;

import java.util.Optional;

public class TransformingOptional {

	public static void main(String[] args) {
		Person person = new Person("john", 26);
		Optional<Person> personOptional = Optional.of(person);

		Optional<Optional<String>> nameOptionalWrapper
	      					= personOptional.map(Person::getName);
	    Optional<String> nameOptional
	    					= nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
	    String name1 = nameOptional.orElse("");

	    System.out.println(name1 == "john");

	    //using flatMap
	    String name = personOptional
	    	      .flatMap(Person::getName)
	    	      .orElse("");

	    System.out.println(name == "john");

	}

}

class Person {
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

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


}
