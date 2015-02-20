package cz.ctu.fee.a4m36jee.seminar.cdi.factorial;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Retention(RUNTIME)
public @interface Parallel {
}
