package Unit6.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    //point values are randomized lunch cost(2.5 to 3.25), usd to indonesian dollar(rupiah)
    private int totalPoints;
    private int currentStreak;
    private int totalCorrect;

    private int fileLen = 141;
    private int numQs = fileLen/7;
    private String usedNums = "";
    private int currentQ = 0;
    Question quQ = new Question();

    Question[] questionArray = new Question[numQs];


    public TriviaGame() throws FileNotFoundException {

    }

    public void fileInput() throws FileNotFoundException {
        File allQuestions = new File("IdeaProjects/mcQuestions.txt");
        Scanner inQ = new Scanner(allQuestions);


        for (int i = 0; i < numQs; i++) {
            String text = inQ.nextLine();
            String answerChoices = inQ.nextLine();
            answerChoices += "\n" + inQ.nextLine();
            answerChoices += "\n" + inQ.nextLine();
            answerChoices += "\n" + inQ.nextLine();
            String correctAnswer = inQ.nextLine();
            int pointValue = inQ.nextInt();
            inQ.nextLine();

            Question qEntry = new Question(text, answerChoices, correctAnswer, pointValue);
            questionArray[i] = qEntry;
        }

    }



    public String getRandomQuestion() {
        int questionNumber = (int) (Math.random() * numQs);
        if (currentQ == numQs) {
            return ("you got " + totalPoints + "rupi ahhs, and your ending streak is " + currentStreak);
        } else {
            currentQ++;
            String question = questionArray[questionNumber].getText();
            question += questionArray[questionNumber].getAnswerChoices();

            String correctAnswer = questionArray[questionNumber].getCorrectAnswer();
            int pointValue = questionArray[questionNumber].getPointValue();

            return question;
        }

    }

    public String checkAnswer(String bruh){
        if (bruh.equals(quQ.getCorrectAnswer())){
            totalPoints += quQ.getPointValue();
            totalCorrect++;
            return ("Yes, that is correct and you got " + quQ.getPointValue() + " Rupiahhs");
        }
        else{
            return "disappointmenr";
        }
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getCurrentStreak() {
        return currentStreak;
    }

    public void setCurrentStreak(int currentStreak) {
        this.currentStreak = currentStreak;
    }

    public int getFileLen() {
        return fileLen;
    }

    public void setFileLen(int fileLen) {
        this.fileLen = fileLen;
    }

    public int getNumQs() {
        return numQs;
    }

    public void setNumQs(int numQs) {
        this.numQs = numQs;
    }

    public String getUsedNums() {
        return usedNums;
    }

    public void setUsedNums(String usedNums) {
        this.usedNums = usedNums;
    }

    public int getCurrentQ() {
        return currentQ;
    }

    public void setCurrentQ(int currentQ) {
        this.currentQ = currentQ;
    }

    public Question[] getQuestionArray() {
        return questionArray;
    }

    public void setQuestionArray(Question[] questionArray) {
        this.questionArray = questionArray;
    }

    public int getTotalCorrect() {
        return totalCorrect;
    }

    public void setTotalCorrect(int totalCorrect) {
        this.totalCorrect = totalCorrect;
    }
}

