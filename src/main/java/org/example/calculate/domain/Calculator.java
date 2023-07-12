package org.example.calculate.domain;

import org.example.calculate.*;
import org.example.calculate.tobe.AddtionOperator;
import org.example.calculate.tobe.ArithmeticOperator;
import org.example.calculate.tobe.DivisionOperator;

import java.util.List;

public class Calculator {

    private static final List<ArithmeticOperator> arithmeticOperators = List.of(new AddtionOperator(), new SubtractionOperator(), new MulticationOperator(), new DivisionOperator());
    public static int calculator(PositiveNumber operand1, String operator, PositiveNumber operand2) {
       return arithmeticOperators.stream()
               .filter(arithmeticOperators -> arithmeticOperators.supports(operator))
               .map(arithmeticOperators -> arithmeticOperators.calculator(operand1, operand2))
               .findAny()
               .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
