package com.btks.a1.q4;

/**
 * This class takes takes, parses, and evaluates infix mathematical expressions.
 * 
 * @author BTKS
 */
public class ExpressionParser {
    
    /**
     * The operators that can be used to evaluate expressions
     */
    public static final String[] OPERATORS = {"(", ")", "**", "*", "/", "+", "-"};
    
    /**
     * Returns the precedence of a mathematical operator.
     * 
     * @param op the operator to find precedence of
     * @return the precedence of the operator
     */
    private static int getOperatorPrecedence(String op) {
        int precedence = 0;
        
        switch (op) {
            case "(":
            case ")":
                precedence = 1;
                break;
            case "**":
                precedence = 2;
                break;
            case "*":
                precedence = 3;
                break;
            case "/":
                precedence = 3;
                break;
            case "+":
                precedence = 4;
                break;
            case "-":
                precedence = 4;
                break;
        }
        
        return precedence;
    }
    
    /**
     * Tests and returns whether the first operator has higher or equal precedence
     * over the second operator.
     * 
     * @param op the first operator
     * @param op2 the second operator
     * @return true if the first operator has higher or equal precedence; false otherwise
     */
    private static boolean hasPrecedence(String op, String op2) {        
        int opPrecedence = getOperatorPrecedence(op);
        int op2Precedence = getOperatorPrecedence(op2);
        
        /**
         * if the precedence of the first operator is equal to 1, then the first operator
         * is a parenthesis and we will automatically return false here, since parenthesis
         * are parsed differently than normal operators (+, -, *, /, and **).
         */
        if (opPrecedence == 1) {
            return false;
        } else if (opPrecedence == 2 && op2Precedence < 2) {
            return false;
        } else if (opPrecedence == 3 && op2Precedence < 3) {
            return false;
        } else if (opPrecedence == 4 && op2Precedence < 4) {
            return false;
        }
        
        return true;
    }
    
    /**
     * Returns whether the provided Character is a closed (or left) parenthesis.
     * 
     * @param test the character to be tested
     * @return true for a closed parenthesis; false otherwise
     */
    private static boolean isClosedParenthesis(char test) {
        if (test == ')') {
            return true;
        }
        
        return false;
    }
    
    /**
     * Returns whether the provided Character is an open (or right) parenthesis.
     * 
     * @param test the character to be tested
     * @return true for an open parenthesis; false otherwise
     */
    private static boolean isOpenParenthesis(char test) {
        if (test == '(') {
            return true;
        }
        
        return false;
    }
    
    /**
     * Returns whether the provided String is an operator.
     * 
     * @param test the operator to be tested
     * @return true if it is an operator; false otherwise
     */
    private static boolean isOperator(String test) {
        for (String operator : OPERATORS) {
            if (test.equals(operator)) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Returns whether the provided Character is an operator.
     * 
     * @param test the operator to be tested
     * @return true if it is an operator; false otherwise
     */
    private static boolean isOperator(char test) {
        return isOperator(Character.toString(test));
    }
    
    /**
     * Returns whether the provided Character is a space.
     * 
     * @param test the operator to be tested
     * @return true if is it a space; false otherwise
     */
    private static boolean isWhiteSpace(char test) {
        if (test == ' ') {
            return true;
        }
        
        return false;
    }
    
    /**
     * Calculates the result of two values, a and b, using the provided operation.
     * 
     * @param op the operator to be used for the operation
     * @param a  the value that will be subtracted, added, multiplied, divided, or powered from b.
     * @param b  the value that a will be subtracted, added, multiplied, divided, or powered from.
     * @return   the result of b operation a
     * @throws IllegalArgumentException 
     */
    private static double performOperation(String op, double a, double b) throws IllegalArgumentException {
        double value = 0;
        
        if (op.equals("+")) {
            value = b + a;
        } else if (op.equals("-")) {
            value = b - a;
        } else if (op.equals("/")) {
            if (b == 0) {
                throw new IllegalArgumentException("Divison by zero is illegal.");
            }
            
            value = b / a;
        } else if (op.equals("*")) {
            value = b * a;
        } else if (op.equals("**")) {
            value = Math.pow(b, a);
        }
        
        return value;
    }
    
    /**
     * Parses and evaluates the provided infix mathematical expression.
     * 
     * @param expression the mathematical expression to evaluate
     * @return the result of the expression
     */
    public static double solve(String expression) {
        ListStack<Double> valueStack = new ListStack<>();
        ListStack<String> operatorStack = new ListStack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            
            if (isWhiteSpace(c)) {
                continue;
            }
            
            if (Character.isDigit(c) || c == '.') {
                String number = Character.toString(c);
                
                int j = i + 1;
                
                while (j < expression.length() && !isOperator(c = expression.charAt(j)) && !isWhiteSpace(c)) {
                    number += c;
                    
                    i = j++;
                }
                
                valueStack.push(Double.parseDouble(number));
            } else if (isOpenParenthesis(c)) {
                operatorStack.push("(");
            } else if (isClosedParenthesis(c)) {
                while (!operatorStack.isEmpty() && !operatorStack.peek().equals("(")) {
                    double result = performOperation(operatorStack.pop(), valueStack.pop(), valueStack.pop());
                    
                    valueStack.push(result);
                }
                
                operatorStack.pop();
            } else if (isOperator(c)) {
                String operator = Character.toString(c);
                
                if (operator.equals("*") && expression.charAt(i + 1) == '*') {
                    operator += "*";
                    
                    i++;
                }
                
                while (!operatorStack.isEmpty() && hasPrecedence(operatorStack.peek(), operator)) {
                    double result = performOperation(operatorStack.pop(), valueStack.pop(), valueStack.pop());
                    
                    valueStack.push(result);
                }
                
                operatorStack.push(operator);
            } else {
                
            }
        }
        
        while (!operatorStack.isEmpty()) {
            double result = performOperation(operatorStack.pop(), valueStack.pop(), valueStack.pop());
            
            valueStack.push(result);
        }
        
        return valueStack.pop();
    }
}