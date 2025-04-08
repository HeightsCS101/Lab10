package cs101;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

	// 4 points
	public static ArrayList<String> a() {

		// TODO: declare a new ArrayList of Strings

		// TODO: add "baseball", "boxing", and "fencing" to your ArrayList

		// TODO: return your ArrayList
		return null;

	}

	// 5 points
	public static ArrayList<Integer> b() {

		// TODO: declare a new ArrayList of Integers

		// TODO: add the numbers 1 to 10 to your ArrayList using a for loop

		// TODO: return your ArrayList
		return null;

	}

	// 2 points
	public static ArrayList<Double> c(ArrayList<Double> cList) {

		// You are given an ArrayList called `cList`
		// TODO: reset the double at index 4 to be 99.99 (Hint: use set())

		return cList;

	}

	// 2 points
	public static ArrayList<Double> d(ArrayList<Double> dList) {

		// You are given an ArrayList called `dList`
		// TODO: insert a NEW element 77.55 at index 1 (Hint: use add())

		return dList;

	}

	// 2 points
	public static ArrayList<Double> e(ArrayList<Double> eList) {

		// You are given an ArrayList called `eList`
		// TODO: remove the element at index 3 in the list (Hint: use remove())

		return eList;

	}

	// 2 points
	public static int f(ArrayList<Double> fList) {

		// You are given an ArrayList called `fList`
		// TODO: return the size of the ArrayList
		return 0;

	}

	// 2 points
	public static ArrayList<Double> g(ArrayList<Double> gList) {

		// You are given an ArrayList called `gList`
		// TODO: remove all of the elements in gList (Hint: use clear())

		return gList;

	}

	// 4 points
	public static ArrayList<Double> h(ArrayList<Double> hList) {

		// You are given an ArrayList called `hList`
		// TODO: remove the LAST element in the list
		// (Hint: You can do this using size() and remove())

		return hList;

	}

	// 5 points
	public static ArrayList<ArrayList<Integer>> i() {

		// TODO: declare a two dimensional ArrayList (look at the type signature for a
		// hint here).
		// You can leave it "empty"

		// TODO: return this new list
		return null;

	}

	// 2 points
	public static ArrayList<String> j(ArrayList<String> jList) {

		// You are given an ArrayList called `jList`
		// TODO: sort the jlist (Hint: you will need a new import statement!))

		return jList;

	}

	// 6 points
	public static ArrayList<String> k(ArrayList<String> kList) {

		// You are given an ArrayList called `kList`

		// TODO: add the following strings to kList:
		// "bar" at index 1
		// "foo" at (the new) index 3
		// "tiff" at (the new) index 5

		// TODO: reset the element at (the new) index 4 to be "bang!"

		return kList;

	}

	// 4 points
	public static ArrayList<String> l(ArrayList<String> lList) {

		// You are given an ArrayList called `lList`

		// TODO: reset the LAST element in the list to be "goo"

		return lList;

	}

	public static void main(String[] args) {
		ArrayList<Double> arr = new ArrayList<Double>();

		System.out.println("Problem A =========================");
		System.out.println(a());

		System.out.println("\nProblem B =========================");
		System.out.println(b());

		System.out.println("\nProblem C =========================");
		System.out.println(c(arr));

		System.out.println("\nProblem D =========================");
		System.out.println(d(arr));

		System.out.println("\nProblem E =========================");
		System.out.println(e(arr));

		System.out.println("\nProblem F =========================");
		System.out.println(f(arr));

		System.out.println("\nProblem G =========================");
		System.out.println(g(arr));

		System.out.println("\nProblem H =========================");
		System.out.println(h(arr));

		System.out.println("\nProblem I =========================");
		System.out.println(i());

		System.out.println("\nProblem J =========================");

		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("beta");
		arr2.add("gamma");
		arr2.add("alpha");
		arr2.add("delta");
		System.out.println(j(arr2));

		System.out.println("\nProblem K =========================");

		ArrayList<String> arr3 = new ArrayList<String>();
		arr3.add("q");
		arr3.add("w");
		arr3.add("e");
		arr3.add("r");
		arr3.add("t");
		arr3.add("y");
		System.out.println(k(arr3));

		System.out.println("\nProblem L =========================");

		ArrayList<String> arr4 = new ArrayList<String>();
		arr4.add("yip");
		arr4.add("yap");
		System.out.println(l(arr4));

	}

}
