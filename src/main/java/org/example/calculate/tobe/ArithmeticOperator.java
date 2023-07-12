package org.example.calculate.tobe;

import org.example.calculate.domain.PositiveNumber;

public interface ArithmeticOperator {
    boolean supports(String operator);
    int calculator(PositiveNumber operand1, PositiveNumber operand2);
}
