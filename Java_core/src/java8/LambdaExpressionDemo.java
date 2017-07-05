package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressionDemo {
	
	public static void main(String args[]){
		 List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

	        System.out.print("Print all numbers: ");
	        evaluate(list, (n)->true);// test(n) luôn return true

	        System.out.print("Print no numbers: ");
	        evaluate(list, (n)->false);// test(n) luôn return false

	        System.out.print("Print even numbers: ");
	        evaluate(list, (n)-> n%2 == 0 );// test(n) return true nếu n chẵn

	        System.out.print("Print odd numbers: ");
	        evaluate(list, (n)-> n%2 == 1 );// test(n) return true nếu n  lẻ

	        System.out.print("Print numbers greater than 5: ");
	        evaluate(list, (n)-> n > 5 );// test(n) return true nếu n > 5
	    }

	    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
	        for(Integer n: list)  {
	            if(predicate.test(n)) {
	                System.out.print(n + " ");
	            }
	        }
	    }
}
