package interpreter;

import java.util.*;

/**
 * Created by Настя on 17.06.2017.
 */
public class Interpreter{
    private Context context;
    // access modifier
    static ArrayList<Integer> listOfIndex=new ArrayList<Integer>();
    static int index;
    static Map<Character, AbstractExpression> expressions=new TreeMap<Character,AbstractExpression>();
    static{
        expressions.put(',', new CommaExpression());
        expressions.put('.', new PointExpression());
        expressions.put('-', new MinusExpression());
        expressions.put('+', new PlusExpression());
        expressions.put('>', new MoreExpression());
        expressions.put('<', new LessExpression());
        expressions.put('[', new LeftBracketExpression());
        expressions.put(']', new RightBracketExpression());
    }
    private static Interpreter interpreter=new Interpreter();
    private Interpreter(){}
    public static Interpreter getInterpreter(){
        return interpreter;
    }
    public void setContext(Context c){
        context=c;
    }
    public void interpret(){
        char[] sequence=context.getSequence();
        for (index=0; index<sequence.length; index++){
            expressions.get(sequence[index]).interpretContext(context);
        }
        context.free();
        index=0;
    }
}
