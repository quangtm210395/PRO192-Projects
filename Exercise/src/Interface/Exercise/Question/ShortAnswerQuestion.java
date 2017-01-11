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
public class ShortAnswerQuestion extends Question {
    private String myAnswer;

    public ShortAnswerQuestion(String myText,String myAnswer) {
        this.myText = myText;
        this.myAnswer = myAnswer;
    }
    
    

    @Override
    public String getQuestion() {
        return this.myText;
    }

    @Override
    public String getAnswer() {
        return this.myAnswer;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return getAnswer().equalsIgnoreCase(answer) ;
    }

    
    
    
}
