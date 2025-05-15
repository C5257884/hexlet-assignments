package exercise;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;


class ValidatorTeacherVersion {

    public static List<String> validate(Object instance) {
        List<Field> fields = List.of(instance.getClass().getDeclaredFields());

        return
            fields.stream()
                .filter(field -> field.isAnnotationPresent(NotNull.class))
                .filter(field -> {
                    Object value;
                    try {
                        field.setAccessible(true);
                        value = field.get(instance);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return value == null;
                })
                .map(Field::getName)
                .collect(Collectors.toList());
    }
}
