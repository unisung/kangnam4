package ch09_annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)//������̼� ���� �Ⱓ
@Target(METHOD)//������̼� ���� ���
public @interface PrintAnnotation {
 String value() default "-";
 int number() default 15;
}


