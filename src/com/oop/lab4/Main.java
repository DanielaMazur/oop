package com.oop.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String oneExpression = readFile("src/com/oop/lab4/expressions/one_expression.txt");
        String threeExpressions = readFile("src/com/oop/lab4/expressions/three_expressions.txt");

        System.out.println("First expresion is " + (areParenthesisCorrect(oneExpression) ? "correct!": "wrong!"));

        String[] expressions = threeExpressions.split("\\r?\\n");

        for(int i = 0; i < expressions.length; i++){
            System.out.println("Expresion " + (i + 1) + " is " + (areParenthesisCorrect(expressions[i]) ? "correct!": "wrong!"));
        }
    }

    public static boolean areParenthesisCorrect(String expresion){
        Stack<Character> openParenthesis = new Stack<>();
        char[] expresionArray = expresion.toCharArray();

        for(char expresionChar : expresionArray){
            if(expresionChar == '('){
                openParenthesis.push(expresionChar);
            }else if(expresionChar == ')'){
                try{
                openParenthesis.pop();
                }catch (EmptyStackException e){
                    return false;
                }
            }
        }

        return openParenthesis.empty();
    }

    public static String readFile(String filePath){
        String expression = "";

        try {
            File fileExpresion = new File(filePath);
            Scanner readExpression = new Scanner(fileExpresion);

            while (readExpression.hasNextLine()) {
               expression += readExpression.nextLine() + "\n";
            }

            readExpression.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return expression;
    }
}
