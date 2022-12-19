package Unit6.arrays;

import javax.swing.plaf.basic.BasicTreeUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    //point values are randomized lunch cost(2.5 to 3.25), usd to indonesian dollar(rupiah)
    private int totalPoints;
    private int currentStreak;
    private int topStreak;
    private int totalCorrect;

    private int fileLen;
    private int numQs;
    private int currentQ;
    private int[] usedNums = new int[20];
    int j = 0;
    String correctAnswer;
    int pointValue;
    Question[] questionArray;

    public TriviaGame(){
        topStreak =0;
        fileLen = 140;
        numQs = fileLen/7;
        currentQ = 0;
        j = 0;
        questionArray = new Question[numQs];

    }


    /**
     * This method reads the text file mcQuestions, it takes every question and puts it in an array.
     * it then puts each question array and puts it in the array QuestionArray[]    ``
     * @throws FileNotFoundException
     */
    public void fileInput() throws FileNotFoundException {
        File allQuestions = new File("mcQuestions.txt");
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

    /**
     * This method chooses and displays a random question.  it generates a unique
     * random number in order to call a unique random question
     * @return Returns the question
     * @return Returns a message when there are no more unique questions
     */
    public String getRandomQuestion() {
        boolean isNumUnique = false;
        int questionNumber =0;
        while (isNumUnique == false){
            questionNumber = (int) (Math.random() * numQs);
            isNumUnique = true;
            for (int i = 0;i<usedNums.length;i++){
                if (questionNumber == usedNums[i]){
                    isNumUnique = false;
                }
            }
        }
        usedNums[j] = questionNumber;


        if (currentQ == numQs) {
            return ("No more Questions\nyou got " + totalPoints + "rupi ahhs, and your ending streak is " + currentStreak);
        }

        else {
            currentQ++;
            String question = currentQ + ") " + questionArray[questionNumber].getText();
            question += "\n" + questionArray[questionNumber].getAnswerChoices();

            correctAnswer = questionArray[questionNumber].getCorrectAnswer();
            pointValue = questionArray[questionNumber].getPointValue();

            return question;
        }

    }

    /**
     *
     * @param bruh The answer choice input by the player
     * @return a message and the point value gained if the answer is correct
     * @return a message if the answer is wrong
     */
    public String checkAnswer(String bruh){
        if (bruh.equals(correctAnswer)){
            totalPoints += pointValue;
            totalCorrect++;
            currentStreak++;

            if (currentStreak > topStreak){
                topStreak = currentStreak;
            }
            return ("Yes, that is correct and you got " + pointValue + " Rupiahhs");
        }
        else{
            currentStreak=0;
            System.out.println("answer: " +  correctAnswer);
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

    public int getTopStreak() {
        return topStreak;
    }

    public void setTopStreak(int topStreak) {
        this.topStreak = topStreak;
    }
}

