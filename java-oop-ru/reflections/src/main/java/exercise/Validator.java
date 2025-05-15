package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class Validator {
    public static List<String> validate(Object object) {
        List<String> invalidFields = new ArrayList<>();

        if (object == null) {
            throw new IllegalArgumentException("Object cannot be null");
        }
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                try {
                    field.setAccessible(true);
                    Object value = field.get(object);
                    if (value == null) {
                        invalidFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Error accessing field " + field.getName(), e);
                }
            }
        }
        return invalidFields;
    }
}
// END
