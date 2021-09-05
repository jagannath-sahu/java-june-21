package com.geeksforgeeks.visitorpattern;

interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}