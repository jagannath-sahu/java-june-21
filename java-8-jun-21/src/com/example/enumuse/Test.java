package com.example.enumuse;

public class Test {

	public static void main(String[] args) {
		GuideType ex = GuideType.fromRepositoryName("tut-udemy");
		System.out.println(ex);

		System.out.println();

		GuideType ex2 = GuideType.fromSlug("tutorial");
		System.out.println(ex2);

		System.out.println();

		String ex3 = ex.stripPrefix("tut-pluralsight");
		System.out.println(ex3);

		System.out.println("-----------------------");


		ex = GuideType.fromRepositoryName("gs-chapter1");
		System.out.println(ex);

		System.out.println();

		ex2 = GuideType.fromSlug("getting-started");
		System.out.println(ex2);

		System.out.println();

		ex3 = ex.stripPrefix("gs-pluralsight");
		System.out.println(ex3);

		ex3 = ex.stripPrefix("xyz-pluralsight");
		System.out.println(ex3);

		System.out.println("-----------------------");


		ex = GuideType.fromRepositoryName("anything not matching");
		System.out.println(ex);

		System.out.println();

		ex2 = GuideType.fromSlug("anything not matching");
		System.out.println(ex2);

		System.out.println();

		ex3 = ex.stripPrefix("gs-pluralsight");
		System.out.println(ex3);

		ex3 = ex.stripPrefix("xyz-pluralsight");
		System.out.println(ex3);
	}

}
