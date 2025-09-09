
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

class RoleBasedAccess {
    @RoleAllowed("ADMIN")
    void adminMethod(String role) throws Exception {
        Method m = this.getClass().getMethod("adminMethod", String.class);
        RoleAllowed allowed = m.getAnnotation(RoleAllowed.class);
        if (allowed.value().equals(role)) {
            System.out.println("Access granted for " + role);
        } else {
            System.out.println("Access Denied!");
        }
    }
}
