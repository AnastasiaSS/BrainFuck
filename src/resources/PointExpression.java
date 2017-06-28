package resources;

/**
 * Created by Настя on 17.06.2017.
 */
public class PointExpression extends AbstractExpression{
    public PointExpression(){}
    @Override
    public void interpretContext(Context c){
        System.out.print(c.getElement(c.getPointer()));
    }
}
