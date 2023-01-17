package com.lpu.anno;

/*
 * Annotations, a form of metadata, provide data about 
 * a program 
 * that is not part of the program itself. 
 * Annotations can be applied to declarations: 
 * declarations of classes, fields, methods, and other 
 * program element
 * The predefined annotation types defined in java.lang 
 * are @Deprecated, @Override, and @SuppressWarnings
 * and @FunctionalInterface
 * 
 * An annotation processor processes these annotations at compile time or runtime to provide functionality such as code generation, 
 * error checking, etc.
 */
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(TYPE)
public @interface Graphics {
 String intense() default "Medium";
}
