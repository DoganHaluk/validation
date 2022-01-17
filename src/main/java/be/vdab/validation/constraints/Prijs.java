package be.vdab.validation.constraints;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Constraint(validatedBy = PrijsValidator.class)
public @interface Prijs {
    String message() default "{be.vdab.Prijs.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
