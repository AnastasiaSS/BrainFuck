package main.java;

import main.resources.Context;
import main.resources.Interpreter;

import java.util.Date;

/**
 * Created by Настя on 18.06.2017.
 */
public class Main {
    public static void main(String[] args){
        Interpreter interpreter=Interpreter.getInterpreter();
        interpreter.setContext(new Context("++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>."));
        long time=new Date().getTime();
        interpreter.interpret();
        System.out.println();
        System.out.print(new Date().getTime()-time);
    }
}
