package cz.ctu.fee.a4m36jee.seminar.cdi.factorial;

import java.math.BigInteger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FactorialImpl implements Factorial {

    @Inject
    private MathOperations math;

    @Override
    public BigInteger compute(long number) {
        return number == 0 ? BigInteger.ONE : math.multiplySequence(1, number);
    }
}
