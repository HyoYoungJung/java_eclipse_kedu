package sec02;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Operator2Demo {

	public static void main(String[] args) {
		Comparator<Integer> comparator = (a, b) -> a - b;

		BinaryOperator<Integer> o1 = BinaryOperator.maxBy(comparator);
		System.out.println(o1.apply(10, 5));
		System.out.println(o1.apply(20, 25));

		BinaryOperator<Integer> o2 = BinaryOperator.minBy(comparator);
		System.out.println(o2.apply(10, 5));
		System.out.println(o2.apply(20, 25));

//		List<Car> newCars = remodeling(Car.cars,
//				c -> new Car("뉴" + c.getModel(), c.isGasoline(), c.getAge(), c.getMileage()));
	}

	private static List<Car> remodeling(List<Car> cars, Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}
//실습 진행 안한 클래스 ,, ? 