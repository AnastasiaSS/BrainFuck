package resources;

/**
 * Created by Настя on 17.06.2017.
 */
public abstract class AbstractExpression{
    AbstractExpression(){}
    //interpret one symbol of sequence
    public abstract void interpretContext(Context c);
}
