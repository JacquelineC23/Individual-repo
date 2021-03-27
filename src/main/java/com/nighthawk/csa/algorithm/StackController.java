package com.nighthawk.csa.algorithm;


import com.nighthawk.csa.consoleUI.ConsoleMethods;
import com.nighthawk.csa.algorithm.genericDataModel.Alphabet;
import com.nighthawk.csa.algorithm.genericDataModel.Animal;
import com.nighthawk.csa.algorithm.genericDataModel.Cupcakes;
import com.nighthawk.csa.model.linkedlists.Stack;

/**
 * Stack Driver takes a list of Objects and puts them onto the Stack
 * @author johnmortensen
 *
 */
public class StackController {

    private Stack stack;
    private String dataType="";
    private int count;

    public StackController()
    {
        count = 0;
        stack = new Stack();
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public void pushStack(Object[] objects)
    {
        ConsoleMethods.println("Add " + dataType);
        for (Object o : objects)
        {
            stack.push(o);
            ConsoleMethods.println("Push: " + stack.getObject() + " " + stack);
            this.count++;
        }
        ConsoleMethods.println();

    }

    public void showStack()
    {
        ConsoleMethods.println("Size: " + count);
        ConsoleMethods.println("Top Element: " + stack.getObject());
        ConsoleMethods.println("Full Stack: " + stack);
        ConsoleMethods.println();
    }

    public void popStack()
    {
        ConsoleMethods.println("Delete " + dataType);
        for (int x = 0; x<count; x++)
        {
            ConsoleMethods.println("Pop: " + stack.pop() + " " + stack);
        }
    }

    /*
     * Illustrate different Objects that can be placed on same Stack
     */
    public static void main(String[] args)
    {
        StackController trial = new StackController();

        // setup for Animals
        trial.setDataType("Animals");
        trial.pushStack(Animal.animalData());

        // setup for Cupcakes
        trial.setDataType("Cupcakes");
        trial.pushStack(Cupcakes.cupCakeData());

        // setup for Alphabet
        trial.setDataType("Alphabet");
        trial.pushStack(Alphabet.alphabetData());

        // mixed stack
        trial.setDataType("Alphabet then Cupcakes then Animals");
        trial.showStack();
        trial.popStack();
    }

}