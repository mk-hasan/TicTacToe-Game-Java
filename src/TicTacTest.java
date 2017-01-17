/**
 * Created by mkhasan on 17/01/2017.
 */
public class TicTacTest {

        private char[][] board;
        private char currentPlayer;

        public TicTacTest() {
            board = new char[3][3];
            currentPlayer = 'o';
            makeBoard();
        }




        public void makeBoard() {


            for (int i = 0; i < 3; i++) {


                for (int j = 0; j < 3; j++) {
                    board[i][j] = '-';
                }
            }
        }


        public void printBoard() {
            System.out.println("-------------");

            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
        }




        public char cmov(){
            char bt1=board[0][0];
            char bt2=board[0][1];
            char bt3=board[0][2];
            char bt4=board[1][0];
            char bt5=board[1][1];
            char bt6=board[1][2];
            char bt7=board[2][0];
            char bt8=board[2][1];
            char bt9=board[2][2];

            if((bt1=='o')&&(bt2=='o')&&(bt3=='-'))
                return 3;
            else if((bt4=='o')&&(bt5=='o')&&(bt6=='-'))
                return 6;
            else if((bt7=='o')&&(bt8=='o')&&(bt9=='-'))
                return 9;
            else if((bt2=='o')&&(bt3=='o')&&(bt1=='-'))
                return 1;
            else if((bt5=='o')&&(bt6=='o')&&(bt4=='-'))
                return 4;
            else if((bt8=='o')&&(bt9=='o')&&(bt7=='-'))
                return 7;
            else if((bt1=='o')&&(bt3=='o')&&(bt2=='-'))
                return 2;
            else if((bt4=='o')&&(bt6=='o')&&(bt5=='-'))
                return 5;
            else if((bt7=='o')&&(bt9=='o')&&(bt8=='-'))
                return 8;
            else if((bt1=='o')&&(bt4=='o')&&(bt7=='-'))
                return 7;
            else if((bt2=='o')&&(bt5=='o')&&(bt8=='-'))
                return 8;
            else if((bt3=='o')&&(bt6=='o')&&(bt9=='-'))
                return 9;
            else if((bt4=='o')&&(bt7=='o')&&(bt1=='-'))
                return 1;
            else if((bt5=='o')&&(bt8=='o')&&(bt2=='-'))
                return 2;
            else if((bt6=='o')&&(bt9=='o')&&(bt3=='-'))
                return 3;
            else if((bt1=='o')&&(bt7=='o')&&(bt4=='-'))
                return 4;
            else if((bt2=='o')&&(bt8=='o')&&(bt5=='-'))
                return 5;
            else if((bt3=='o')&&(bt9=='o')&&(bt6=='-'))
                return 6;
            else if((bt1=='o')&&(bt5=='o')&&(bt9=='-'))
                return 9;
            else if((bt5=='o')&&(bt9=='o')&&(bt1=='-'))
                return 1;
            else if((bt1=='o')&&(bt9=='o')&&(bt5=='-'))
                return 5;
            else if((bt3=='o')&&(bt5=='o')&&(bt7=='-'))
                return 7;
            else if((bt7=='o')&&(bt5=='o')&&(bt3=='-'))
                return 3;
            else if((bt7=='o')&&(bt3=='o')&&(bt5=='-'))
                return 5;
            else if((bt1=='x')&&(bt2=='x')&&(bt3=='-'))
                return 3;
            else if((bt4=='x')&&(bt5=='x')&&(bt6=='-'))
                return 6;
            else if((bt7=='x')&&(bt8=='x')&&(bt9=='-'))
                return 9;
            else if((bt2=='x')&&(bt3=='x')&&(bt1=='-'))
                return 1;
            else if((bt5=='x')&&(bt6=='x')&&(bt4=='-'))
                return 4;
            else if((bt8=='x')&&(bt9=='x')&&(bt7=='-'))
                return 7;
            else if((bt1=='x')&&(bt3=='x')&&(bt2=='-'))
                return 2;
            else if((bt4=='x')&&(bt6=='x')&&(bt5=='-'))
                return 5;
            else if((bt7=='x')&&(bt9=='x')&&(bt8=='-'))
                return 8;
            else if((bt1=='x')&&(bt4=='x')&&(bt7=='-'))
                return 7;
            else if((bt2=='x')&&(bt5=='x')&&(bt8=='-'))
                return 8;
            else if((bt3=='x')&&(bt6=='x')&&(bt9=='-'))
                return 9;
            else if((bt4=='x')&&(bt7=='x')&&(bt1=='-'))
                return 1;
            else if((bt5=='x')&&(bt8=='x')&&(bt2=='-'))
                return 2;
            else if((bt6=='x')&&(bt9=='x')&&(bt3=='-'))
                return 3;
            else if((bt1=='x')&&(bt7=='x')&&(bt4=='-'))
                return 4;
            else if((bt2=='x')&&(bt8=='x')&&(bt5=='-'))
                return 5;
            else if((bt3=='x')&&(bt9=='x')&&(bt6=='-'))
                return 6;
            else if((bt1=='x')&&(bt5=='x')&&(bt9=='-'))
                return 9;
            else if((bt5=='x')&&(bt9=='x')&&(bt1=='-'))
                return 1;
            else if((bt1=='x')&&(bt9=='x')&&(bt5=='-'))
                return 5;
            else if((bt3=='x')&&(bt5=='x')&&(bt7=='-'))
                return 7;
            else if((bt7=='x')&&(bt5=='x')&&(bt3=='-'))
                return 3;
            else if((bt7=='x')&&(bt3=='x')&&(bt5=='-'))
                return 5;
            else if((bt1=='x')&&(bt5=='o')&&(bt9=='x'))
                return 6;
            else if((bt3=='x')&&(bt5=='o')&&(bt7=='x'))
                return 4;
            else if(bt5=='-')
                return 5;
            else if(bt1=='-')
                return 1;
            else if(bt2=='-')
                return 2;
            else if(bt3=='-')
                return 3;
            else if(bt7=='-')
                return 7;
            else if(bt9=='-')
                return 9;
            else if(bt6=='-')
                return 6;
            else return 0;
        }


        public boolean isBoardFull() {
            boolean isFull = true;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '-') {
                        isFull = false;
                    }
                }
            }

            return isFull;
        }


        public boolean checkForWin() {
            return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
        }



        private boolean checkRowsForWin() {
            for (int i = 0; i < 3; i++) {
                if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                    return true;
                }
            }
            return false;
        }



        private boolean checkColumnsForWin() {
            for (int i = 0; i < 3; i++) {
                if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
                    return true;
                }
            }
            return false;
        }

        private boolean checkDiagonalsForWin() {
            return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
        }



        private boolean checkRowCol(char c1, char c2, char c3) {
            return (((c1 != '-') && (c1 == c2) && (c3 =='-'))||((c1 != '-') && (c2 == '-') && (c3 ==c1)));
        }


        public void changePlayer() {
            if (currentPlayer == 'x') {
                currentPlayer = 'o';
            }
            else {
                currentPlayer = 'x';
            }
        }


        public boolean PlayerTurn(int row, int col) {
            if ((row >= 0) && (row < 3)) {
                if ((col >= 0) && (col < 3)) {
                    if (board[row][col] == '-') {
                        board[row][col] = currentPlayer;
                        return true;
                    }

                }
            }

            return false;
        }



    }



}
