package main.resources;

import main.resources.AbstractExpression;
import main.resources.Context;

/**
 * Created by Настя on 17.06.2017.
 */
public class PlusExpression extends AbstractExpression {
    public PlusExpression(){}
    @Override
    public void interpretContext(Context c){
        c.incrementElement(c.getPointer());
    }
}
