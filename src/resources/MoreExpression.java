package resources;

/**
 * Created by Настя on 17.06.2017.
 */
public class MoreExpression extends AbstractExpression{
    public MoreExpression(){}
    @Override
    public void interpretContext(Context c){
        c.incrementPointer();
    }
}
