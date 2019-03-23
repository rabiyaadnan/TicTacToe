/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tic.tac.toe;

/**
 *
 * @author Bramerz
 */

public class Model
{
    private int[][] board;

    public Model() 
    {
        board = new int[3][3]; //3x3 Grid
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = -1; //Initialize the 2D array with -1
            }
        }
    }
    
    boolean isXWinner() //1 for X
    {
        //diagonals
        if(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1)
            return true;
        
        else if(board[0][2] == 1 && board[1][1] == 1 && board[2][0] == 1)
            return true;
        
        else if(board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1)
            return true;
        
        //horizontal
        else if(board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1)
            return true;
        
        else if(board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1)
            return true;
        
        else if(board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1)
            return true;
       
        //vertical
        else if(board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1)
            return true;
        
        else if(board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1)
            return true;
        
        else if(board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1)
            return true;
    
        else
            return false;
    }
    
    boolean isOWinner() //2 for O
    {
        //diagonals
        if(board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2)
            return true;
        
        else if(board[0][2] == 2 && board[1][1] == 2 && board[2][0] == 2)
            return true;
        
        else if(board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2)
            return true;
        
        //horizontal
        else if(board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2)
            return true;
        
        else if(board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2)
            return true;
        
        else if(board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2)
            return true;
       
        //vertical
        else if(board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2)
            return true;
        
        else if(board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2)
            return true;
        
        else if(board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2)
            return true;
        
        else
            return false;
    }
    
    boolean isDraw()
    {
        boolean flag = true;
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(board[i][j] == -1)
                {
                    flag = false;
                    break;
                }
            }
        }
        
        return flag;
    }
    
    int getTurn(int i, int j, int turn)
    {
        if(board[i][j] == -1)
        {
            board[i][j] = turn;
            
            if((turn % 2) == 0)
            {
                turn = 1;
            }
            
            else
            {
                turn = 2;
            }
            
        }
        
        return turn;
    }
    
    public void endGame(GUI gui)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = -1;
            }
        }
        
        gui.reset();
    }
}