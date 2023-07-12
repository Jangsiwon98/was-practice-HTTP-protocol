package org.example.calculate.tobe;

import org.example.calculate.domain.PositiveNumber;
import org.example.calculate.tobe.ArithmeticOperator;

public class DivisionOperator implements ArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculator(PositiveNumber operand1, PositiveNumber operand2) {
        if(operand2.toInt() == 0){
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return operand1.toInt() / operand2.toInt();
    }
}
