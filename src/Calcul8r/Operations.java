package Calcul8r;

import java.util.Stack;

public class Operations implements Calcul8r.OperationsInt{
    Stack prob = new Stack();
    int stackSize = 0;
    private void addElement(char elmt){
        prob.push(elmt);
        stackSize++;
    }
    private void remElement(char elmt){
        prob.pop();
        stackSize--;
    }
    public void clearStack(){
        for (int i = 0; i < stackSize; i++) {
            prob.pop();
        }
        stackSize = 0;
    }

    //checks if the equation is valid
    public boolean checkEquation(String eq){
        Boolean isOk = true;
        Stack par = new Stack();
        int parSize = 0;
        for (int i = 0; i < eq.length(); i++) {
            if(eq.charAt(i) == '('){
                par.push('(');
                parSize++;
            }
            //if a ")" is pushed onto the stack without "(" it returns false
            if (eq.charAt(i) == ')' && parSize > 0){
                if ((char)par.peek() == '('){
                    par.pop();
                    parSize--;
                }else{
                    return false;
                }
            } else if (eq.charAt(i) == ')' && parSize < 1){
                return false;
            }

            addElement(eq.charAt(i));
        }

        if(parSize > 0){
            return false;
        }

        System.out.println("Stack Contents: "+prob.toString());
        return isOk;
    }
}
