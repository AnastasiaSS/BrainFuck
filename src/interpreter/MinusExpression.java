package interpreter;

/**
 * Created by Настя on 17.06.2017.
 */
public class MinusExpression extends AbstractExpression{
    MinusExpression(){}
    @Override
    public void interpretContext(Context c){
        c.decrementElement(c.getPointer());
    }
}
