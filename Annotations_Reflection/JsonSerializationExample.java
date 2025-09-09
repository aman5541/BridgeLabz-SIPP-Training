
import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class UserData {
    @JsonField(name = "user_name")
    String username;

    @JsonField(name = "user_age")
    int age;

    UserData(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

class JsonSerializer {
    static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField jf = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                json.append(""").append(jf.name()).append("":"").append(field.get(obj)).append("",");
            }
        }
        if (json.charAt(json.length()-1) == ',') json.deleteCharAt(json.length()-1);
        json.append("}");
        return json.toString();
    }
}
