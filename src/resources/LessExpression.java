package resources;

/**
 * Created by Настя on 17.06.2017.
 */
public class LessExpression extends AbstractExpression {
    LessExpression(){}
    @Override
    public void interpretContext(Context c){
        c.decrementPointer();
    }
}
