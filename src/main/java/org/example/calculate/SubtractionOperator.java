package org.example.calculate;

import org.example.calculate.domain.PositiveNumber;
import org.example.calculate.tobe.ArithmeticOperator;

public class SubtractionOperator implements ArithmeticOperator {

    @Override
    public boolean supports(String operator) {
        return "-".equals(operator);
    }

    @Override
    public int calculator(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() - operand2.toInt();
    }
}
