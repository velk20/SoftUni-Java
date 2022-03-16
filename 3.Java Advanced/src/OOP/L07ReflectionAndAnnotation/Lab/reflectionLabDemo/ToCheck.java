package OOP.L07ReflectionAndAnnotation.Lab.reflectionLabDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.CONSTRUCTOR) // onlyFor Constructors
//TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE,
// ANNOTATION_TYPE,PACKAGE,TYPE_PARAMETER,TYPE_USE,MODULE,RECORD_COMPONENT;
@Retention(RetentionPolicy.CLASS)
public @interface ToCheck {
    String name();
}
