package interpreter;

import java.util.Scanner;

/**
 * Created by Настя on 17.06.2017.
 */
public class CommaExpression extends AbstractExpression{
    public CommaExpression(){}
    @Override
    public void interpretContext(Context c){
        Scanner scanner=new Scanner(System.in);
        //Context.array[Context.pointer]=scanner.next().charAt(0);
        c.setElement(c.getPointer(), scanner.next().charAt(0));
    }
}
