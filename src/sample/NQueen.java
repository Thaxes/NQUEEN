package sample;

import java.util.Scanner;

public class NQueen {
  static final String ANSI_RESET = "\u001B[0m";
  static final String ANSI_RED = "\u001B[31m";

  static int N;
  static int board[][];
    
  static boolean isSafe(int board[][],int row,int col) {
    
    int i, j;
    for (i = 0; i < col; i ++)
    {
        
    }
  }
  
  static boolean solveNQueen(int board[][],int col){
       if (col>=N) return true;
       for (int row=0; row<N ; row++)
       {
           if(isSafe(board,row,col))
           {
              board[row][col]=1;
              if (solveNQueen(board, col+1)) return true;
              board[row][col]=0;
           }       
       }
       return false;
  }

  static void display(int board[][]){
       for (int i=0;i<N;i++){
          for (int j=0;j<N;j++){
              if (board[i][j]==1)
                  System.out.print(ANSI_RED+board[i][j]+ANSI_RESET+" ");  
              else
                  System.out.print(board[i][j]+" ");
          }
          System.out.println();
       }    
  }

  public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       System.out.print("Enter Board Size(N): ");
       N=console.nextInt();
       board =new int[N][N];
       console.close();
       if(solveNQueen(board,0))
       {
          System.out.println("Has solution");       
          display(board);   
       }
       else
          System.out.println("No solution");   
   
  }
}
