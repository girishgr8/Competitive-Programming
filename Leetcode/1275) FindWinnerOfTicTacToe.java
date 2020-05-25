class Solution {
    public String tictactoe(int[][] moves) {
        char board[][] = new char[9][9];
        for(int i=0; i<3; i++)
            Arrays.fill(board[i],'-');
        for(int i=0; i<moves.length; i++){
            int r = moves[i][0], c = moves[i][1];
            if(i%2==0){
                board[r][c] = 'X';
                String winner = checkWinner(board, 'X', "A");
                if(winner!="Pending") return winner;
            }
            else{
                board[r][c] = 'O';
                String winner = checkWinner(board, 'O', "B");
                if(winner!="Pending") return winner;
            }
        }
        if(moves.length < 9)
            return "Pending";
        return "Draw";
    }
    public String checkWinner(char[][] board, char symbol, String player){
        if(board[0][0]==symbol && board[1][1]==symbol && board[2][2]==symbol)
            return player;
        
        if(board[0][2]==symbol && board[1][1]==symbol && board[2][0]==symbol)
            return player;
        
        for(int i=0; i<3; i++)
            if(board[i][0]==symbol && board[i][1]==symbol && board[i][2]==symbol)
                return player;
        
        for(int i=0; i<3; i++)
            if(board[0][i]==symbol && board[1][i]==symbol && board[2][i]==symbol)
                return player;
        
        return "Pending";
    }
}