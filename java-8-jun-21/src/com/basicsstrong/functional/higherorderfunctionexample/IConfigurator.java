package com.basicsstrong.functional.higherorderfunctionexample;

public interface IConfigurator<T,R> {
	R configure(T t);
}
