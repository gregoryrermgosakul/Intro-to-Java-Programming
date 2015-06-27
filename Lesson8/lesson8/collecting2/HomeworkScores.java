// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double sum;
    private int numScores;
    private double lowestScore;

    public HomeworkScores()
    {
        sum = 0;
        numScores = 0;
        lowestScore = -1;
    }

    /**
       Adds a score.
       @param score the score to add
    */
    public void addScore(double score)
    {
        if (numScores == 0 || score < lowestScore) 
        {
            lowestScore = score;
        }
        numScores++;
        sum += score;
    }

    /**
       Calculates the sum of all the scores entered, dropping the lowest
       score if there is more than one.
       @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {
        if (numScores == 0)
        {
            return 0;
        }
        else if (numScores == 1)
        {
            return sum;
        }
        else
        {
            return sum - lowestScore;
        }
    }
}
