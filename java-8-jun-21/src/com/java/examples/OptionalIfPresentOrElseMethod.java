package com.java.examples;

import java.util.Optional;

public class OptionalIfPresentOrElseMethod {

	public static void main(String[] args) {
		// create a Optional
        Optional<Integer> op
            = Optional.of(9455);

        // print value
        System.out.println("Optional: "
                           + op);

        // apply ifPresentOrElse
        op.ifPresentOrElse(
            (value)
                -> { System.out.println(
                         "Value is present, its: "
                         + value); },
            ()
                -> { System.out.println(
                         "Value is empty"); });


        // create a Optional
        op = Optional.empty();

        // print value
        System.out.println("Optional: "
                           + op);

        try {

            // apply ifPresentOrElse
            op.ifPresentOrElse(
                (value)
                    -> { System.out.println(
                             "Value is present, its: "
                             + value); },
                ()
                    -> { System.out.println(
                             "Value is empty"); });
        }
        catch (Exception e) {
            System.out.println(e);
        }
	}

}
