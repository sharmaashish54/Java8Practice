package java8.practice.flatmap;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapEx2 {

	public static void main(String[] args) {

		Map<String, List<Integer>> map = new LinkedHashMap<>();

		map.put("one", Arrays.asList(10, 20, 30));
		map.put("two", Arrays.asList(40, 50, 60));
		// collecting keys of elements of a map to a single list using flatmap
		System.out.println(map.values().stream().flatMap(List::stream).collect(Collectors.toList()));
	}

}
