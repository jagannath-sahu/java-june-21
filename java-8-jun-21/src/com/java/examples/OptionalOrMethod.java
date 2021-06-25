package com.java.examples;

import java.util.Optional;

public class OptionalOrMethod {

	/*
	 * Optional::or will either return the current Optional if a value is present.
	 * Otherwise an Optional produced by the provided supplier function is returned.
	 */

	public static void main(String[] args) {
		// create a Optional
        Optional<Integer> op
            = Optional.of(9455);

        // print supplier
        System.out.println("Optional: "
                           + op);

        // or supplier
        System.out.println("Optional by or(() ->"
                           + " Optional.of(100)) method: "
                           + op.or(() -> Optional.of(100)));

        // create a Optional
        op = Optional.empty();

        // print supplier
        System.out.println("Optional: "
                           + op);

        try {

            // or supplier
            System.out.println("Optional by or(() ->"
                               + " Optional.of(100)) method: "
                               + op.or(() -> Optional.of(100)));
        }
        catch (Exception e) {
            System.out.println(e);
        }

	}

}
