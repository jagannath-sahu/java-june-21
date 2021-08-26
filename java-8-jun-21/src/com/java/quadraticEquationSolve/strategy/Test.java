package com.java.quadraticEquationSolve.strategy;

public class Test {

	public static void main(String[] args) {

		DiscriminantStrategy strategy = new OrdinaryDiscriminantStrategy();
		QuadraticEquationSolver solver = new QuadraticEquationSolver(strategy);
		Pair<Complex, Complex> results = solver.solve(1, 10, 16);
		System.out.println((new Complex(-2, 0).equals(results.first)));
		System.out.println((new Complex(-8, 0).equals(results.second)));

		strategy = new RealDiscriminantStrategy();
		solver = new QuadraticEquationSolver(strategy);
		results = solver.solve(1, 10, 16);
		System.out.println((new Complex(-2, 0).equals(results.first)));
		System.out.println((new Complex(-8, 0).equals(results.second)));

		OrdinaryDiscriminantStrategy strategy1 = new OrdinaryDiscriminantStrategy();
		solver = new QuadraticEquationSolver(strategy1);
		results = solver.solve(1, 4, 5);
		System.out.println((new Complex(-2, 1).equals(results.first)));
		System.out.println((new Complex(-2, -1).equals(results.second)));

		strategy = new RealDiscriminantStrategy();
		solver = new QuadraticEquationSolver(strategy);
		results = solver.solve(1, 4, 5);

		System.out.println(Boolean.TRUE.equals(results.first.isNaN()));
		System.out.println(Boolean.TRUE.equals(results.second.isNaN()));

	}

}
