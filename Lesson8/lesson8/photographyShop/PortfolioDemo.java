
/**
 * This is a demo class for the portfolio
 * 
 * @Gregory Rermgosakul 
 * @31-MAY-2015
 */
public class PortfolioDemo
{
    public static void main(String[] args) 
    {
        Portfolio portfolio = new Portfolio();
        portfolio.addFinishedWork("icesmall28.jpg", "Justin Black");
        portfolio.addFinishedWork("ecuasmll5", "Justin Black");
        portfolio.addFinishedWork("france6small.jpg", "Justin Black");
        portfolio.displayFinishedWork();
    }
}
