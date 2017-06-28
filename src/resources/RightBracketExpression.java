package resources;

/**
 * Created by Настя on 17.06.2017.
 */
public class RightBracketExpression extends AbstractExpression{
    public RightBracketExpression(){}
    //todo fix
    @Override
    public void interpretContext(Context c){
        int i= Interpreter.listOfIndex.size()-1;
        if(c.getElement(c.getPointer())>0){
           Interpreter.index=Interpreter.listOfIndex.get(i);
        }else{
            Interpreter.listOfIndex.remove(i);
        }
    }
}
