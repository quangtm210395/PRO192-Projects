/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Exercise.Question;

/**
 *
 * @author Minnn
 */
public abstract class Question {
    protected String myText;

    public String getText() {
        return myText;
    }

    public abstract String getQuestion();
    
    public abstract String getAnswer();
    
    public abstract boolean checkAnswer(String answer);
}
