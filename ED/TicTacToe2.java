import java.util.Scanner;
import java.util.InputMismatchException;

public class TicTacToe2 {

    protected static final int X = 1, O = -1; // jogadores 
    protected static final int EMPTY = 0;     // celula vazia 
    protected int board[][] = new int[3][3];  // tabuleiro 
    protected int player;                     // jogador corrente

    /** Construtor */
    public TicTacToe2() {
        clearBoard();
    }

    /** Limpa o tabuleiro */
    public void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY; // toda celula deve estar vazia 
            }
        }
        player = X; // o primeiro jogador é ‘X’
    }

    /** Coloca um X ou O na posição i,j */
    public void putMark(int i, int j) throws IllegalArgumentException {
        if ((i < 0) || (i > 2) || (j < 0) || (j > 2)) {
            throw new IllegalArgumentException("Posição do tabuleiro inválida");
        }
        if (board[i][j] != EMPTY) {
            throw new IllegalArgumentException("Posição do tabuleiro já ocupada");
        }
        board[i][j] = player; // insere a marca do jogador corrente 
        player = -player;     // troca os jogadores (usa o fato de que O = -X)
    }

    // verifica quem ganhou
    public boolean isWin(int mark) {
        return ((board[0][0] + board[0][1] + board[0][2] == mark * 3)
                || (board[1][0] + board[1][1] + board[1][2] == mark * 3)
                || (board[2][0] + board[2][1] + board[2][2] == mark * 3)
                || (board[0][0] + board[1][0] + board[2][0] == mark * 3)
                || (board[0][1] + board[1][1] + board[2][1] == mark * 3)
                || (board[0][2] + board[1][2] + board[2][2] == mark * 3)
                || (board[0][0] + board[1][1] + board[2][2] == mark * 3) 
                || (board[2][0] + board[1][1] + board[0][2] == mark * 3)); 
    }

    public int winner() {
        if (isWin(X)) {
            return (X);
        } else if (isWin(O)) {
            return (O);
        } else {
            return (0);
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case X: s += "X"; break;
                    case O: s += "O"; break;
                    case EMPTY: s += " "; break;
                }
                if (j < 2) { s += "|"; }
            }
            if (i < 2) { s += "\n-----\n"; }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            TicTacToe2 game = new TicTacToe2();
            int jogadas = 0;
            boolean jogoAtivo = true;

            System.out.println("\n=== INÍCIO DO JOGO DA VELHA ===");
            System.out.println(game.toString());

            while (jogoAtivo && jogadas < 9) {
                String jogadorAtual = (game.player == X) ? "X" : "O";
                System.out.println("\nVez do jogador: " + jogadorAtual);

                try {
                    System.out.print("Digite a linha (0, 1 ou 2): ");
                    int linha = scanner.nextInt();
                    System.out.print("Digite a coluna (0, 1 ou 2): ");
                    int coluna = scanner.nextInt();

                    game.putMark(linha, coluna);
                    jogadas++;
                    System.out.println("\n" + game.toString());

                    int vencedor = game.winner();
                    if (vencedor != 0) {
                        String vencedorStr = (vencedor == X) ? "X" : "O";
                        System.out.println(">>> Parabéns! O jogador " + vencedorStr + " venceu a partida! <<<");
                        jogoAtivo = false;
                    } else if (jogadas == 9) {
                        System.out.println(">>> Fim de jogo! Deu Velha (Empate)! <<<");
                    }

                } catch (IllegalArgumentException e) {
                    // caso digite uma posicao ja colocada ou fora do limite
                    System.out.println("ERRO: " + e.getMessage() + ". Tente novamente.");
                } catch (InputMismatchException e) {
                    // caso digite alguma letra
                    System.out.println("ERRO: Entrada inválida. Digite apenas números inteiros.");
                    scanner.next();
                }
            }

            // multiplas partidas
            System.out.print("\nDeseja jogar novamente? (S para sim, qualquer outra tecla para sair): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("S")) {
                jogarNovamente = false;
                System.out.println("Encerrando o jogo. Obrigado por jogar!");
            }
        }
        
        scanner.close();
    }
}
