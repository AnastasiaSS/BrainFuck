package interpreter;

/**
 * Created by Настя on 17.06.2017.
 */
public class Context {
    private int pointer;
    private char[] array;
    private char[] sequence;

    public Context(){
        pointer=0;
        array=new char[30000];
    }
    public Context(String s){
        this();
        setSequence(s);
    }
    public char[] getSequence(){
        return sequence;
    }
    public void setSequence(String s){
        sequence=s.toCharArray();
    }

    public int getPointer(){
        return pointer;
    }
    public void setPointer(int p){
        pointer=p;
    }
    public void incrementPointer(){
        ++pointer;
    }
    public void decrementPointer(){
        --pointer;
    }
    public void setElement(int index, char value){
        array[index]=value;
    }
    public char getElement(int index){
        return array[index];
    }
    public void incrementElement(int index){
        ++array[index];
    }
    public void decrementElement(int index){
        --array[index];
    }
    public void free(){
        pointer=0;
        for (int i=0; i<array.length; i++){
            array[i]='\u0000';
        }
    }
}
