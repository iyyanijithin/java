package org.test.helloworld;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {

	public static void test1() throws IOException {

		// Case1
		IntStream.range(1, 10).forEach(System.out::print);

		// case 2
		IntStream.range(1, 10).skip(5).forEach(val -> {
			System.out.println(val);
		});

		System.out.println(IntStream.range(1, 10).sum());

		// case 3
		// Sorting using java 8
		Stream.of("apple", "ball", "elephant", "cat").sorted().forEach(System.out::println);

		// Case 4
		Stream.of("apple", "ball", "elephant", "cat").sorted().forEach(System.out::println);

		// Case 5
		String[] names = { "roger", "rafael", "mamba" };
		Arrays.stream(names).filter(x -> x.startsWith("r")).forEach(System.out::println);

		IntStream stream = Arrays.stream(new int[] { 1, 2 });
		stream.map(x -> x * x).average().ifPresent(System.out::println);

		Arrays.stream(names).map(x -> x.toLowerCase()).filter(x -> x.startsWith("m")).forEach(System.out::println);

		// Read entire file in java
		Stream<String> data = Files.lines(Paths.get("data.txt"));
		data.filter(word -> word.length() > 5).forEach(System.out::println);
		data.close();

		Stream<String> data1 = Files.lines(Paths.get("data.txt"));
		List<String> collect = data1.filter(x -> x.contains("rog")).collect(Collectors.toList());
		collect.forEach(System.out::println);
		data1.close();

		Stream<String> data2 = Files.lines(Paths.get("data2.txt"));
		int count = (int) data2.map(x -> x.split(";")).filter(x -> x.length == 3).count();
		System.out.println(count);
		data2.close();

		Stream<String> data3 = Files.lines(Paths.get("data2.txt"));
		data3.map(x -> x.split(";")).filter(x -> x.length == 3).forEach(x -> {
			System.out.println(x[0] + " " + x[1] + " " + x[2]);
		});
		data3.close();

		Stream<String> data4 = Files.lines(Paths.get("data2.txt"));
		Map<String, String> dataMap = data4.map(x -> x.split(";")).filter(x -> x.length == 3)
				.collect(Collectors.toMap(x -> x[0], x -> x[1]));

		System.out.println(dataMap);
		data4.close();

		double total = Stream.of(7.3, 1.5).reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println(total);

		IntSummaryStatistics summary = IntStream.of(1, 2, 3, 4).summaryStatistics();
		System.out.println(summary);
	}

	public static void main(String[] args) throws Exception {
		test1();
	}
}
