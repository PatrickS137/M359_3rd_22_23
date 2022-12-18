package Unit6.arrays;

public class Question {
    private String text;
    private String answerChoices;
    private String correctAnswer;
    private int pointValue;
    private int question;

    /**
     * @param text
     * @param answerChoices
     * @param correctAnswer
     * @param pointValue
     */
    public Question(String text, String answerChoices, String correctAnswer, int pointValue) {
        this.text = text;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;

    }


    public String toString(){
        return (question + ")  " + text + "\n" + answerChoices);
    }

    public  String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(String answerChoices) {
        this.answerChoices = answerChoices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }
}
