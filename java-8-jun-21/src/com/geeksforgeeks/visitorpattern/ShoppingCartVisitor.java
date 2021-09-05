package com.geeksforgeeks.visitorpattern;

interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
}