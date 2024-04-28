package Ex01HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
	public static final String COMMAND_TO_END = "HARVEST";
	public static final String PRIVATE = "private";
	public static final String PROTECTED = "protected";
	public static final String PUBLIC = "public";
	public static final String ALL = "all";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Class<RichSoilLand> richSoilLand = RichSoilLand.class;

		Map<String, List<Field>> fields = Map.of(
				PRIVATE,new ArrayList<>(),
				PROTECTED, new ArrayList<>(),
				PUBLIC, List.of(richSoilLand.getFields()),
				ALL, List.of(richSoilLand.getDeclaredFields())
		);

		for (Field field : fields.get(ALL)) {
			String fieldAccessModifiers = Modifier.toString(field.getModifiers());
			if (fieldAccessModifiers.contains(PRIVATE)) {
				fields.get(PRIVATE).add(field);
			} else if (fieldAccessModifiers.contains(PROTECTED)) {
				fields.get(PROTECTED).add(field);
			}
		}

		String command = scanner.nextLine();

		while (!command.equals(COMMAND_TO_END)) {
			switch (command) {
				case PRIVATE:
					printFields(fields.get(PRIVATE));
					break;
				case PROTECTED:
					printFields(fields.get(PROTECTED));
					break;
				case PUBLIC:
					printFields(fields.get(PUBLIC));
					break;
				case ALL:
					printFields(fields.get(ALL));
					break;
			}

			command = scanner.nextLine();
		}
	}

	public static void printFields(List<Field> fields) {
		for (Field field : fields) {
			System.out.printf("%s %s %s%n",
					Modifier.toString(field.getModifiers()),
					field.getType().getSimpleName(),
					field.getName());
		}
	}
}
