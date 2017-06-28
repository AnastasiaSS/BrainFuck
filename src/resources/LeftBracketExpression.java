package resources;

/**
 * Created by Настя on 17.06.2017.
 */
public class LeftBracketExpression extends AbstractExpression{
    //todo fix
    LeftBracketExpression(){}
    @Override
    public void interpretContext(Context c){
        Interpreter interpreter=Interpreter.getInterpreter();
        //resources.cycleOperation();
        cycleOperation(c);
    }
    private void cycleOperation(Context c){
        Interpreter.listOfIndex.add(Interpreter.index);
        int size=Interpreter.listOfIndex.size();
        while (Interpreter.listOfIndex.size()==size){
            ++Interpreter.index;
            Interpreter.expressions.get(c.getSequence()[Interpreter.index]).interpretContext(c);
        }
    }
}
