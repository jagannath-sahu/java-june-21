package com.composite.demo;

public class Demo {

	public static void main(String[] args) {
		Folder f1 = new Folder();f1.setName("Folder 1");
        Folder f2 = new Folder();f2.setName("Folder 2");
        Folder f3 = new Folder();f3.setName("Folder 3");

        File file1 = new File();file1.setName("File 1");
        File file2 = new File();file2.setName("File 2");
        File file3 = new File();file3.setName("File 3");
        File file4 = new File();file4.setName("File 4");

        f1.add(file1);
        f2.add(file2);

        f3.add(f2);
        f3.add(file3);
        f3.add(file4);

        f1.doubleClick();
        f2.doubleClick();
        f3.doubleClick();
	}
}
