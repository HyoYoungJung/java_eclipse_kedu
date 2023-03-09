package sec02;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Function2Demo {

	public static void main(String[] args) {
		Function<Car, String> f1 = c -> c.getModel();
		ToIntFunction<Car> f2 = c -> c.getAge(); // ToIntFunction => 리턴값을 int로 아예 고정해둔 것

		for (Car car : Car.cars)
			System.out.print("(" + f1.apply(car) + "," + f2.applyAsInt(car) + ")");
		System.out.println();

		double averageAge = average(Car.cars, c -> c.getAge());
		double averageMileage = average(Car.cars, c -> c.getMileage());

		System.out.println("평균 연식 = " + averageAge);
		System.out.println("평균 주행거리 = " + averageMileage);
	}

	static public double average(List<Car> cars, ToIntFunction<Car> f) { // static으로 만든 이유 = new 하기 싫어서
		double sum = 0.0;

		for (Car car : cars)
			sum += f.applyAsInt(car);

		return sum / cars.size(); // 평균연식 나옴
	}
}