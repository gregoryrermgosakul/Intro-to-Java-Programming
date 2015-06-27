import java.util.Random;

public class MyAgent extends Agent
{
    Random r;

    /**
     * Constructs a new agent, giving it the game and telling it whether it is Red or Yellow.
     * 
     * @param game The game the agent will be playing.
     * @param iAmRed True if the agent is Red, False if the agent is Yellow.
     */
    public MyAgent(Connect4Game game, boolean iAmRed)
    {
        super(game, iAmRed);
        r = new Random();
    }

    /**
     * The move method is run every time it is this agent's turn in the game. You may assume that
     * when move() is called, the game has at least one open slot for a token, and the game has not
     * already been won.
     * 
     * By the end of the move method, the agent should have placed one token into the game at some
     * point.
     * 
     * After the move() method is called, the game engine will check to make sure the move was
     * valid. A move might be invalid if:
     * - No token was place into the game.
     * - More than one token was placed into the game.
     * - A previous token was removed from the game.
     * - The color of a previous token was changed.
     * - There are empty spaces below where the token was placed.
     * 
     * If an invalid move is made, the game engine will announce it and the game will be ended.
     * 
     */
    public void move()
    {
        if (iCanWin() > -1) {
            // If I can win the game, I make a move.
            moveOnColumn(iCanWin());
        } else if (theyCanWin() > -1) {
            // If they can win the game, they make a move.
            moveOnColumn(theyCanWin());
        } else {
            // If it's no one's game, then I just tell the game to make a random move.
            moveOnColumn(randomMove());
        }
    }

    /**
     * Drops a token into a particular column so that it will fall to the bottom of the column.
     * If the column is already full, nothing will change.
     * 
     * @param columnNumber The column into which to drop the token.
     */
    public void moveOnColumn(int columnNumber)
    {
        int lowestEmptySlotIndex = getLowestEmptyIndex(myGame.getColumn(columnNumber));   // Find the top empty slot in the column
                                                                                                  // If the column is full, lowestEmptySlot will be -1
        if (lowestEmptySlotIndex > -1)  // if the column is not full
        {
            Connect4Slot lowestEmptySlot = myGame.getColumn(columnNumber).getSlot(lowestEmptySlotIndex);  // get the slot in this column at this index
            if (iAmRed) // If the current agent is the Red player...
            {
                lowestEmptySlot.addRed(); // Place a red token into the empty slot
            }
            else // If the current agent is the Yellow player (not the Red player)...
            {
                lowestEmptySlot.addYellow(); // Place a yellow token into the empty slot
            }
        }
    }

    /**
     * Returns the index of the top empty slot in a particular column.
     * 
     * @param column The column to check.
     * @return the index of the top empty slot in a particular column; -1 if the column is already full.
     */
    public int getLowestEmptyIndex(Connect4Column column) {
        int lowestEmptySlot = -1;
        for  (int i = 0; i < column.getRowCount(); i++)
        {
            if (!column.getSlot(i).getIsFilled())
            {
                lowestEmptySlot = i;
            }
        }
        return lowestEmptySlot;
    }

    /**
     * Returns a random valid move. If your agent doesn't know what to do, making a random move
     * can allow the game to go on anyway.
     * 
     * @return a random valid move.
     */
    public int randomMove()
    {
        int i = r.nextInt(myGame.getColumnCount());
        while (getLowestEmptyIndex(myGame.getColumn(i)) == -1)
        {
            i = r.nextInt(myGame.getColumnCount());
        }
        return i;
    }

    /**
     * Returns the column that would allow the agent to win.
     * 
     * You might want your agent to check to see if it has a winning move available to it so that
     * it can go ahead and make that move. Implement this method to return what column would
     * allow the agent to win.
     *
     * @return the column that would allow the agent to win.
     */
    public int iCanWin()
    {
        return anyonesGame(iAmRed);
    }

    /**
     * Returns the column that would allow the opponent to win.
     * 
     * You might want your agent to check to see if the opponent would have any winning moves
     * available so your agent can block them. Implement this method to return what column should
     * be blocked to prevent the opponent from winning.
     *
     * @return the column that would allow the opponent to win.
     */
    public int theyCanWin()
    {
        return anyonesGame(!iAmRed);
    }
    
    /**
     * Returns the column that would allow anyone to win.
     * 
     * The purpose of this method is to create a game logic for red and yellow.  
     * 
     * @param whoAmI the player to be evaluated.  
     * The player is evaluated by the slots on the board.
     *
     * @return the column that would allow anyone to win.
     */
    public int anyonesGame(boolean whoAmI)
  {
    for (int i = 0; i < myGame.getColumnCount(); i++) 
    // i is less than column count, which is 7, pretty much checking all the columns
    {
      int j = getLowestEmptyIndex(myGame.getColumn(i)); 
      // j is equal to the top empty index of column i (0), which is returned at the end of the getTopEmptyIndex method
      if (j > -1) // if j is a column that is not full
      {
        if (j < myGame.getRowCount() - 3) 
        // if j is less than the row count of 6 - 3, which is 3.  This should prevent the compiler from performing the method across the entire board.  
        { 
          if ((myGame.getColumn(i).getSlot(j + 1).getIsRed() == whoAmI) && (myGame.getColumn(i).getSlot(j + 2).getIsRed() == whoAmI) && (myGame.getColumn(i).getSlot(j + 3).getIsRed() == whoAmI)) 
          // if (in column i, slot 4 is red, slot 5 is red, slot 6 is red), assuming 3 vertical red slots.  This is intended to be a vertical of 3 reds below the evaluated lowest empty slot.  
          {
            return i;
          }
        }
        if (i < myGame.getColumnCount() - 3) // if i is less than column count of 7, which is 4
        { 
          if (checkIfEqual(whoAmI, myGame.getColumn(i + 1).getSlot(j), myGame.getColumn(i + 2).getSlot(j), myGame.getColumn(i + 3).getSlot(j))) 
          // if the slots in columns 1-3 are red, assuming 3 red slots to the right [X,O,O,O]
          {
            return i;
          }
        }
        if ((i < myGame.getColumnCount() - 2) && (i > 0)) // if i is less than the column count of 5, and greater than zero, keeping the game in bounds
        {
          if (checkIfEqual(whoAmI, myGame.getColumn(i - 1).getSlot(j), myGame.getColumn(i + 1).getSlot(j), myGame.getColumn(i + 2).getSlot(j))) 
          // This should check the board for a red slot combination of [O, X, O, O]
          {
            return i;
          }
        }
        if ((i < myGame.getColumnCount() - 1) && (i > 1)) // if is less than the column count minus 1, and greater than 1
        {
          if (checkIfEqual(whoAmI, myGame.getColumn(i - 1).getSlot(j), myGame.getColumn(i + 1).getSlot(j), myGame.getColumn(i - 2).getSlot(j))) 
          // This should check for a red slot combination of [OOXO]
          // Previous slot order of  -2, -1, +1 isn't working
          // Using this slot order allowed me to finally beat Random agent!
          {
            return i;
          }
        }
        if ((i < myGame.getColumnCount() - 1) && (i > 1) && (j < myGame.getRowCount() - 1) && (j > 1)) 
        { // If i is less than column count minus 1 and i is greater than 1, and j is less the row count minus 1 and j is > 1.  Bounds checking.
          if (checkIfEqual(whoAmI, myGame.getColumn(i + 1).getSlot(j + 1), myGame.getColumn(i - 1).getSlot(j - 1), myGame.getColumn(i - 2).getSlot(j - 2))) 
          // This is a diagonal check that would check in a downwards-right manner.  Checks for the two slots before it being red, and the one after it being red.
          {
            return i;
          }
        }
        if ((i < myGame.getColumnCount() - 3) && (j < myGame.getRowCount() - 3)) 
        { // if columns is less than 4 and rows is less than 3
          if (checkIfEqual(whoAmI, myGame.getColumn(i + 1).getSlot(j + 1), myGame.getColumn(i + 3).getSlot(j + 3), myGame.getColumn(i + 2).getSlot(j + 2))) 
          { // columns(i + 1, i + 3, i + 2).slot(j + 1, 3, 2).  Another diagonal check, same as above.  Checks if the three slots to the downward-right are red.
            return i;
          }
        }
        if ((i < myGame.getColumnCount() - 2) && (i > 0) && (j < myGame.getRowCount() - 2) && (j > 0)) 
        { // if columns is less than 5 and i is greater than 0 and row count is less than 4 and j is greater than 0
          if (checkIfEqual(whoAmI, myGame.getColumn(i + 1).getSlot(j + 1), myGame.getColumn(i - 1).getSlot(j - 1), myGame.getColumn(i + 2).getSlot(j + 2))) 
          { // columns(i + 1, i - 1, i + 2).slot(j + 1, j - 1, j + 2)
            return i;
          }
        }
        if ((i < myGame.getColumnCount()) && (i > 2) && (j < myGame.getRowCount()) && (j > 2)) 
        { // if i is less the column count and i is greater than 2, and if j is less than the row count and j > 2
          if (checkIfEqual(whoAmI, myGame.getColumn(i - 1).getSlot(j - 1), myGame.getColumn(i - 2).getSlot(j - 2), myGame.getColumn(i - 3).getSlot(j - 3))) // Upwards left diagonal check from starting point
          {
            return i;
          }
        }
        if ((i > 2) && (i < myGame.getColumnCount()) && (j < myGame.getRowCount() - 3) && (j >= 0)) 
        { // if i > 2 and i < column count, and j < row count - 3 and j >= 0
          if (checkIfEqual(whoAmI, myGame.getColumn(i - 1).getSlot(j + 1), myGame.getColumn(i - 2).getSlot(j + 2), myGame.getColumn(i - 3).getSlot(j + 3))) // Downwards-left diagonal check from starting point
          {
            return i;
          }
        }
        if ((i > 1) && (i < myGame.getColumnCount() - 1) && (j < myGame.getRowCount() - 2) && (j > 0)) 
        { // if i > 1 and i < column count - 1, and j < row count - 2 and j > 0
          if (checkIfEqual(whoAmI, myGame.getColumn(i - 1).getSlot(j + 1), myGame.getColumn(i - 2).getSlot(j + 2), myGame.getColumn(i + 1).getSlot(j - 1))) // Upwards right diagonal check.  2 left red, 1 right red.
          {
            return i;
          }
        }
        if ((i > 0) && (i < myGame.getColumnCount() - 2) && (j < myGame.getRowCount() - 1) && (j > 1)) 
        { // if i > 0 and i < column count - 2, and j < row count - 1 and j > 1
          if (checkIfEqual(whoAmI, myGame.getColumn(i - 1).getSlot(j + 1), myGame.getColumn(i + 2).getSlot(j - 2), myGame.getColumn(i + 1).getSlot(j - 1))) // Upwards right diagonal check.  1 left red, 2 right red.
          {
            return i;
          }
        }
        if ((i >= 0) && (i < myGame.getColumnCount() - 3) && (j < myGame.getRowCount()) && (j > 2)) 
        {  //if i >= 0 and i < column count - 3, and j < row count and j > 2
          if (checkIfEqual(whoAmI, myGame.getColumn(i + 3).getSlot(j - 3), myGame.getColumn(i + 2).getSlot(j - 2), myGame.getColumn(i + 1).getSlot(j - 1))) // Upwards right diagonal check. 3 right red.
          {
            return i;
          }
        }
        if (i > 2) // if i is greater than 2, 3 and up, refers to column length, not index
        {
          if (checkIfEqual(whoAmI, myGame.getColumn(i - 1).getSlot(j), myGame.getColumn(i - 2).getSlot(j), myGame.getColumn(i - 3).getSlot(j))) 
          // if 3 slots to the left are of the same color.  Intended to be a left horizontal check of [O,O,O,X]
          {
            return i;
          }
        }
      }
    }
    return -1;
  }
  
  /**
     * Returns true or false if the passed slots are equal to the agent's color.
     * 
     * The purpose of this method is to determine if the passed values are of equal color.  
     * 
     * @param whoAmI the player to be evaluated.  
     * The player is evaluated by the slots on the board.
     *
     * @return the decision of the method color check.
     */
  public boolean checkIfEqual(boolean whoAmI, Connect4Slot Slot1, Connect4Slot Slot2, Connect4Slot Slot3)
  {
    if ((Slot1.getIsFilled()) && (Slot2.getIsFilled()) && (Slot3.getIsFilled()) && (Slot1.getIsRed() == whoAmI) && (Slot2.getIsRed() == whoAmI) && (Slot3.getIsRed() == whoAmI)) 
    // if slots 1 - 3 are filled and they're all red
    {
      return true;
    }
    return false;
  }

    /**
     * Returns the name of this agent.
     *
     * @return the agent's name
     */
    public String getName()
    {
        return "Agente Gregorio";
    }
}
