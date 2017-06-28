package main.resources;

import main.resources.AbstractExpression;
import main.resources.Context;

/**
 * Created by Настя on 17.06.2017.
 */
public class MoreExpression extends AbstractExpression {
    public MoreExpression(){}
    @Override
    public void interpretContext(Context c){
        c.incrementPointer();
    }
}
