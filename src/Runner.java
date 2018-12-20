public class Runner {
    public static void main(String[] args){
        TokenPass game1 = new TokenPass(10);

        while(game1.gameOver() < 0){
            game1.printBoard();
            game1.distributeToken();
            game1.nextPlayer();
        }
        game1.printBoard();
        System.out.println("The winner is: Player " + game1.gameOver());
    }
}
