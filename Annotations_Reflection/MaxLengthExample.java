
import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    String username;

    User(String username) {
        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength max = field.getAnnotation(MaxLength.class);
            if (username.length() > max.value()) throw new IllegalArgumentException("Exceeds max length");
            this.username = username;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
