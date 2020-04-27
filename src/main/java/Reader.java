import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.lang3.StringUtils.equalsIgnoreCase;

public class Reader {

	@SneakyThrows
	void dependencyPairs(String file) {
		Map<String, String> pairs = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] values = line.trim().split(" ");
				if (values.length == 2) {
					pairs.put(values[0], values[1]);
				}
			}
		}

		pairs.entrySet().removeIf(pair -> pairs.get(pair.getValue()) == null);
		pairs.entrySet().removeIf(pair -> equalsIgnoreCase(pairs.get(pair.getValue()), pair.getKey()));
		pairs.forEach((key, value) -> System.out.println(key + " " + value));
	}
}
