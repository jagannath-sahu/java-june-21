package com.composite.demo;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Data {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private List<Data> folder = new ArrayList<Data>();

	@Override
	public void doubleClick() {
		System.out.println(this.getName() + " folder is Opened");
		for (Data data : folder) {
			data.doubleClick();
		}
	}

	public void add(Data data) {
		folder.add(data);
	}

	public void remove(Data data) {
		folder.remove(data);
	}
}