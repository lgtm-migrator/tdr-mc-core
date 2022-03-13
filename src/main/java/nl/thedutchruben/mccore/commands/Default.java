package nl.thedutchruben.mccore.commands;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Default {

    String permission() default "";

    boolean console() default false;

    String usage() default "";

    int minParams() default 0;

    int maxParams() default 0;
}
