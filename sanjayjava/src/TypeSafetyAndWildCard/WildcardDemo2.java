package TypeSafetyAndWildCard;
//Java program to demonstrate Lower Bounded Wildcards
import java.util.Arrays;
import java.util.List;

class WildcardDemo2 {
	public static void main(String[] args)
	{
		// Lower Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 2, 6, 7);
		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list1);
		// Number list
		List<Number> list2 = Arrays.asList(4, 8, 3, 0);
		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list2);
	}

	public static void printOnlyIntegerClassorSuperClass(
		List<? super Integer> list)
	{
		System.out.println(list);
	}
}

