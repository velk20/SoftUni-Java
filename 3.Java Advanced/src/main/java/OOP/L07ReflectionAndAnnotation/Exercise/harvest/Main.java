package OOP.L07ReflectionAndAnnotation.Exercise.harvest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);

		Class clazz = Class.forName("OOP.L07ReflectionAndAnnotation.Exercise.harvest.RichSoilLand");
		List<Field> declaredFields = Arrays.asList(clazz.getDeclaredFields());
		Map<String, List<Field>> allModifiersWithFields = fillMapWithModifiers(declaredFields);
		allModifiersWithFields.put("all", declaredFields);

		String input = scanner.nextLine();
		while (!input.equals("HARVEST")) {
			returnFieldsWithCurrentModifierFromMap(input,allModifiersWithFields);

			input = scanner.nextLine();
		}

	}

	private static void returnFieldsWithCurrentModifierFromMap(String input, Map<String, List<Field>> allModifiersWithFields) {
		switch (input) {
			case "private":
			case "public":
			case "protected":
			case "all":

				printFields(input, allModifiersWithFields);
				break;

		}
	}

	private static void printFields(String input, Map<String, List<Field>> allModifiersWithFields) {
		allModifiersWithFields.get(input)
				.forEach(e -> System.out.printf("%s %s %s%n", Modifier.toString(e.getModifiers()),
						e.getType().getSimpleName(), e.getName()));
	}

	public static Map<String, List<Field>> fillMapWithModifiers(List<Field> fields) {
		Map<String, List<Field>> map = new HashMap<>();
		for (Field field : fields) {
			String modifier = Modifier.toString(field.getModifiers());
			if (!map.containsKey(modifier)) {
				map.put(modifier, new ArrayList<>() {{
					add(field);
				}});
			} else {
				map.get(modifier).add(field);
			}
		}
		return map;

	}

}
