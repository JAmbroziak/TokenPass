public class TokenPass {

    private int[] board;
    private int currentPlayer;

    public TokenPass(int PlayerCount){
        this.board = new int[PlayerCount];
        for( int i = 0; i < PlayerCount; i++){
            this.board[i] = (int)(Math.random()*10 + 1);
        }
        this.currentPlayer = (int)(Math.random()*PlayerCount);
    }

    public void distributeToken(){
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;
        while(numToDistribute > 0){
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }

    public void printBoard(){
        for(int i = 0; i < board.length; i++){
            System.out.println("Player " + i + ": " + board[i] + " ");
        }
    }

    public void nextPlayer(){
        System.out.println("Current Player: " + currentPlayer);
    }

    public int gameOver(){
        
    }
}
