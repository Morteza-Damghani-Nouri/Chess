import java.awt.*;

public class Rook extends Piece {

    public Rook(boolean existence, int x, int y, String c, int i) {
        super(existence, x, y, c, i);
    }

    @Override
    /**
     *
     * @param currentX,    the place(x).
     * @param currentY,the place(y) of the piece.
     * @param nextX,       the place(x) of the piece we want it to go.
     * @param nextY,the    the place(y) of the piece we want it to go.
     * @param field        it is an array of object of place class which simulates the field of the chess game.
     * @param chessMainGraphic it is an object of NewGraphic class.
     * @return it is a boolean variable which shows that the movement was successful or not.
     */
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place[][] field, NewGraphic chessMainGraphic) {
        boolean result = super.move(currentX, currentY, nextX, nextY, field, chessMainGraphic);
        if (!result) return false;


        else {
            if (nextX == currentX || nextY == currentY) {
                if (nextY == currentY) {
                    if (nextX > currentX) {
                        for (int i = currentX + 1; i <= nextX - 1; ++i) {
                            if (field[currentY][i].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            //chessMainGraphic.getMainButtons()[nextY+1][nextX+1].setIcon(chessMainGraphic.getMainButtons()[currentY+1][currentX+1].getIcon());
                            chessMainGraphic.getMainButtons()[currentY + 1][currentX + 1].setIcon(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;

                    }
                    if (currentX > nextX) {
                        for (int i = currentX - 1; i >= nextX + 1; --i) {
                            if (field[currentY][i].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            double r1 = 0;
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int i = 0;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;


                    }


                }
                if (nextX == currentX) {
                    int k = 0;
                    if (nextY > currentY) {
                        for (int i = currentY + 1; i <= nextY - 1; ++i) {
                            int y = 0;
                            if (field[i][currentX].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            int x = 0, o = 0;
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);

                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int m = 1;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;

                    }
                    if (currentY > nextY) {
                        int a = 0;
                        for (int i = currentY - 1; i >= nextY + 1; --i) {
                            if (field[i][currentX].getPiece() != null) return false;

                        }
                        if (field[nextY][nextX].getPiece() == null) {
                            int b = 0;
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);

                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        } else {
                            if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                                return false;
                            int w = 0, j = 0;
                            field[nextY][nextX].getPiece().setExistence(false);
                            changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                            field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                            field[currentY][currentX].setPiece(null);
                            field[nextY][nextX].getPiece().setY(nextY);
                            field[nextY][nextX].getPiece().setX(nextX);
                        }
                        return true;


                    }


                }


            } else {
                return false;
            }


        }
        return false;
    }

    /**
     * it checks if the current piece checks the king of the other player or not.
     *
     * @param currentX the current place(x) of the piece.
     * @param currentY the current place(x) of the piece.
     * @param field    it is an array of objects of place class which simulates the field of chess.
     * @return it is a boolean variable which shows that the piece checks the king or not.
     */
    public boolean check(int currentX, int currentY, Place field[][]) {
        Piece rook = field[currentY][currentX].getPiece();
        if (rook.getColor().equals("white")) {
            if (blackKingChecker(currentX, currentY + 1, field) && betweenChecker1(currentX, currentY, currentX, currentY + 1, field))
                return true;
            if (blackKingChecker(currentX, currentY + 2, field) && betweenChecker1(currentX, currentY, currentX, currentY + 2, field))
                return true;
            if (blackKingChecker(currentX, currentY + 3, field) && betweenChecker1(currentX, currentY, currentX, currentY + 3, field))
                return true;
            if (blackKingChecker(currentX, currentY + 4, field) && betweenChecker1(currentX, currentY, currentX, currentY + 4, field))
                return true;
            if (blackKingChecker(currentX, currentY + 5, field) && betweenChecker1(currentX, currentY, currentX, currentY + 5, field))
                return true;
            if (blackKingChecker(currentX, currentY + 6, field) && betweenChecker1(currentX, currentY, currentX, currentY + 6, field))
                return true;
            if (blackKingChecker(currentX, currentY + 7, field) && betweenChecker1(currentX, currentY, currentX, currentY + 7, field))
                return true;

            if (blackKingChecker(currentX, currentY - 1, field) && betweenChecker2(currentX, currentY, currentX, currentY - 1, field))
                return true;
            if (blackKingChecker(currentX, currentY - 2, field) && betweenChecker2(currentX, currentY, currentX, currentY - 2, field))
                return true;
            if (blackKingChecker(currentX, currentY - 3, field) && betweenChecker2(currentX, currentY, currentX, currentY - 3, field))
                return true;
            if (blackKingChecker(currentX, currentY - 4, field) && betweenChecker2(currentX, currentY, currentX, currentY - 4, field))
                return true;
            if (blackKingChecker(currentX, currentY - 5, field) && betweenChecker2(currentX, currentY, currentX, currentY - 5, field))
                return true;
            if (blackKingChecker(currentX, currentY - 6, field) && betweenChecker2(currentX, currentY, currentX, currentY - 6, field))
                return true;
            if (blackKingChecker(currentX, currentY - 7, field) && betweenChecker2(currentX, currentY, currentX, currentY - 7, field))
                return true;


            if (blackKingChecker(currentX + 1, currentY, field) && betweenChecker3(currentX, currentY, currentX + 1, currentY, field))
                return true;
            if (blackKingChecker(currentX + 2, currentY, field) && betweenChecker3(currentX, currentY, currentX + 2, currentY, field))
                return true;
            if (blackKingChecker(currentX + 3, currentY, field) && betweenChecker3(currentX, currentY, currentX + 3, currentY, field))
                return true;
            if (blackKingChecker(currentX + 4, currentY, field) && betweenChecker3(currentX, currentY, currentX + 4, currentY, field))
                return true;
            if (blackKingChecker(currentX + 5, currentY, field) && betweenChecker3(currentX, currentY, currentX + 5, currentY, field))
                return true;
            if (blackKingChecker(currentX + 6, currentY, field) && betweenChecker3(currentX, currentY, currentX + 6, currentY, field))
                return true;
            if (blackKingChecker(currentX + 7, currentY, field) && betweenChecker3(currentX, currentY, currentX + 7, currentY, field))
                return true;

            if (blackKingChecker(currentX - 1, currentY, field) && betweenChecker4(currentX, currentY, currentX - 1, currentY, field))
                return true;
            if (blackKingChecker(currentX - 2, currentY, field) && betweenChecker4(currentX, currentY, currentX - 2, currentY, field))
                return true;
            if (blackKingChecker(currentX - 3, currentY, field) && betweenChecker4(currentX, currentY, currentX - 3, currentY, field))
                return true;
            if (blackKingChecker(currentX - 4, currentY, field) && betweenChecker4(currentX, currentY, currentX - 4, currentY, field))
                return true;
            if (blackKingChecker(currentX - 5, currentY, field) && betweenChecker4(currentX, currentY, currentX - 5, currentY, field))
                return true;
            if (blackKingChecker(currentX - 6, currentY, field) && betweenChecker4(currentX, currentY, currentX - 6, currentY, field))
                return true;
            if (blackKingChecker(currentX - 7, currentY, field) && betweenChecker4(currentX, currentY, currentX - 7, currentY, field))
                return true;

        }
        if (rook.getColor().equals("black")) {
            if (whiteKingChecker(currentX, currentY + 1, field) && betweenChecker1(currentX, currentY, currentX, currentY + 1, field))
                return true;
            if (whiteKingChecker(currentX, currentY + 2, field) && betweenChecker1(currentX, currentY, currentX, currentY + 2, field))
                return true;
            if (whiteKingChecker(currentX, currentY + 3, field) && betweenChecker1(currentX, currentY, currentX, currentY + 3, field))
                return true;
            if (whiteKingChecker(currentX, currentY + 4, field) && betweenChecker1(currentX, currentY, currentX, currentY + 4, field))
                return true;
            if (whiteKingChecker(currentX, currentY + 5, field) && betweenChecker1(currentX, currentY, currentX, currentY + 5, field))
                return true;
            if (whiteKingChecker(currentX, currentY + 6, field) && betweenChecker1(currentX, currentY, currentX, currentY + 6, field))
                return true;
            if (whiteKingChecker(currentX, currentY + 7, field) && betweenChecker1(currentX, currentY, currentX, currentY + 7, field))
                return true;

            if (whiteKingChecker(currentX, currentY - 1, field) && betweenChecker2(currentX, currentY, currentX, currentY - 1, field))
                return true;
            if (whiteKingChecker(currentX, currentY - 2, field) && betweenChecker2(currentX, currentY, currentX, currentY - 2, field))
                return true;
            if (whiteKingChecker(currentX, currentY - 3, field) && betweenChecker2(currentX, currentY, currentX, currentY - 3, field))
                return true;
            if (whiteKingChecker(currentX, currentY - 4, field) && betweenChecker2(currentX, currentY, currentX, currentY - 4, field))
                return true;
            if (whiteKingChecker(currentX, currentY - 5, field) && betweenChecker2(currentX, currentY, currentX, currentY - 5, field))
                return true;
            if (whiteKingChecker(currentX, currentY - 6, field) && betweenChecker2(currentX, currentY, currentX, currentY - 6, field))
                return true;
            if (whiteKingChecker(currentX, currentY - 7, field) && betweenChecker2(currentX, currentY, currentX, currentY - 7, field))
                return true;

            if (whiteKingChecker(currentX + 1, currentY, field) && betweenChecker3(currentX, currentY, currentX + 1, currentY, field))
                return true;
            if (whiteKingChecker(currentX + 2, currentY, field) && betweenChecker3(currentX, currentY, currentX + 2, currentY, field))
                return true;
            if (whiteKingChecker(currentX + 3, currentY, field) && betweenChecker3(currentX, currentY, currentX + 3, currentY, field))
                return true;
            if (whiteKingChecker(currentX + 4, currentY, field) && betweenChecker3(currentX, currentY, currentX + 4, currentY, field))
                return true;
            if (whiteKingChecker(currentX + 5, currentY, field) && betweenChecker3(currentX, currentY, currentX + 5, currentY, field))
                return true;
            if (whiteKingChecker(currentX + 6, currentY, field) && betweenChecker3(currentX, currentY, currentX + 6, currentY, field))
                return true;
            if (whiteKingChecker(currentX + 7, currentY, field) && betweenChecker3(currentX, currentY, currentX + 7, currentY, field))
                return true;

            if (whiteKingChecker(currentX - 1, currentY, field) && betweenChecker4(currentX, currentY, currentX - 1, currentY, field))
                return true;
            if (whiteKingChecker(currentX - 2, currentY, field) && betweenChecker4(currentX, currentY, currentX - 2, currentY, field))
                return true;
            if (whiteKingChecker(currentX - 3, currentY, field) && betweenChecker4(currentX, currentY, currentX - 3, currentY, field))
                return true;
            if (whiteKingChecker(currentX - 4, currentY, field) && betweenChecker4(currentX, currentY, currentX - 4, currentY, field))
                return true;
            if (whiteKingChecker(currentX - 5, currentY, field) && betweenChecker4(currentX, currentY, currentX - 5, currentY, field))
                return true;
            if (whiteKingChecker(currentX - 6, currentY, field) && betweenChecker4(currentX, currentY, currentX - 6, currentY, field))
                return true;
            if (whiteKingChecker(currentX - 7, currentY, field) && betweenChecker4(currentX, currentY, currentX - 7, currentY, field))
                return true;


        }


        return false;
    }

    /**
     * it checks that if there is piece between two entered squares or not.
     *
     * @param currentX current x of the piece.
     * @param currentY current y of the piece.
     * @param nextX    next x of the piece.
     * @param nextY    next y of the piece.
     * @param field    the field of the game.
     * @return it is a boolean variable which indicates if there is a piece between two entered squares or not.
     */
    private boolean betweenChecker1(int currentX, int currentY, int nextX, int nextY, Place field[][]) {

        for (int i = 1; currentY + i <= nextY - 1; ++i) {
            if (field[currentY + i][currentX].getPiece() != null) return false;

        }
        return true;

    }

    /**
     * it checks that if there is piece between two entered squares or not.
     *
     * @param currentX current x of the piece.
     * @param currentY current y of the piece.
     * @param nextX    next x of the piece.
     * @param nextY    next y of the piece.
     * @param field    the field of the game.
     * @return it is a boolean variable which indicates if there is a piece between two entered squares or not.
     */

    private boolean betweenChecker2(int currentX, int currentY, int nextX, int nextY, Place field[][]) {
        for (int i = 1; currentY - i >= nextY + 1; ++i) {
            if (field[currentY - i][currentX].getPiece() != null) return false;

        }
        return true;

    }

    /**
     * it checks that if there is piece between two entered squares or not.
     *
     * @param currentX current x of the piece.
     * @param currentY current y of the piece.
     * @param nextX    next x of the piece.
     * @param nextY    next y of the piece.
     * @param field    the field of the game.
     * @return it is a boolean variable which indicates if there is a piece between two entered squares or not.
     */
    private boolean betweenChecker3(int currentX, int currentY, int nextX, int nextY, Place field[][]) {
        for (int i = 1; currentX + i <= nextX - 1; ++i) {
            if (field[currentY][currentX + i].getPiece() != null) return false;

        }
        return true;

    }

    /**
     * it checks that if there is piece between two entered squares or not.
     *
     * @param currentX current x of the piece.
     * @param currentY current y of the piece.
     * @param nextX    next x of the piece.
     * @param nextY    next y of the piece.
     * @param field    the field of the game.
     * @return it is a boolean variable which indicates if there is a piece between two entered squares or not.
     */
    private boolean betweenChecker4(int currentX, int currentY, int nextX, int nextY, Place field[][]) {
        for (int i = 1; currentX - i >= nextX + 1; ++i) {
            if (field[currentY][currentX - i].getPiece() != null) return false;

        }
        return true;

    }

    /**
     * it shows possible squares for a rook piece on main frame of graphic.
     *
     * @param x                X component of a square of the field of the game.
     * @param y                Y component of a square of the field of the game.
     * @param field            the field of the game.
     * @param chessMainGraphic an object of NewGraphic class.
     */
    public void showPossibleSquares(int x, int y, Place field[][], NewGraphic chessMainGraphic) {
        if (field[y][x].getPiece().getColor() == "white") {
            for (int i = 1; y + i <= 7; ++i) {
                if (isItInRange(x, y + i)) {
                    if (field[y + i][x].getPiece() == null) {
                        chessMainGraphic.getMainButtons()[y + i + 1][x + 1].setBackground(new Color(5, 55, 5));
                    } else {
                        if (field[y + i][x].getPiece().getColor() == "white") break;
                        else {
                            chessMainGraphic.getMainButtons()[y + i + 1][x + 1].setBackground(new Color(5, 55, 5));
                        }

                    }


                }
            }
            for (int i = 1; y - i >= 0; ++i) {
                if (isItInRange(x, y - i)) {
                    if (field[y - i][x].getPiece() == null) {
                        chessMainGraphic.getMainButtons()[y - i + 1][x + 1].setBackground(new Color(5, 55, 5));
                    } else {
                        if (field[y - i][x].getPiece().getColor() == "white") break;
                        else {
                            chessMainGraphic.getMainButtons()[y - i + 1][x + 1].setBackground(new Color(5, 55, 5));
                        }

                    }


                }
            }
            for (int i = 1; x + i <= 7; ++i) {
                if (isItInRange(x + i, y)) {
                    if (field[y][x + i].getPiece() == null) {
                        chessMainGraphic.getMainButtons()[y + 1][x + i + 1].setBackground(new Color(5, 55, 5));
                    } else {
                        if (field[y][x + i].getPiece().getColor() == "white") break;
                        else {
                            chessMainGraphic.getMainButtons()[y + 1][x + i + 1].setBackground(new Color(5, 55, 5));
                        }

                    }


                }
            }
            for (int i = 1; x - i >= 0; ++i) {
                if (isItInRange(x - i, y)) {
                    if (field[y][x - i].getPiece() == null) {
                        chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(5, 55, 5));
                    } else {
                        if (field[y][x - i].getPiece().getColor() == "white") break;
                        else {
                            chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(5, 55, 5));
                        }

                    }


                }
            }


        }

        if (field[y][x].getPiece().getColor() == "black") {
            for (int i = 1; y + i <= 7; ++i) {
                if (isItInRange(x, y + i)) {
                    if (field[y + i][x].getPiece() == null) {
                        chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(8, 107, 8));
                    } else {
                        if (field[y + i][x].getPiece().getColor() == "black") break;
                        else {
                            chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(8, 107, 8));
                        }

                    }


                }
            }
            for (int i = 1; y - i >= 0; ++i) {
                if (isItInRange(x, y - i)) {
                    if (field[y - i][x].getPiece() == null) {
                        chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(8, 107, 8));
                    } else {
                        if (field[y - i][x].getPiece().getColor() == "black") break;
                        else {
                            chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(8, 107, 8));
                        }

                    }


                }
            }
            for (int i = 1; x + i <= 7; ++i) {
                if (isItInRange(x + i, y)) {
                    if (field[y][x + i].getPiece() == null) {
                        chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(8, 107, 8));
                    } else {
                        if (field[y][x + i].getPiece().getColor() == "black") break;
                        else {
                            chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(8, 107, 8));
                        }

                    }


                }
            }
            for (int i = 1; x - i >= 0; ++i) {
                if (isItInRange(x - i, y)) {
                    if (field[y][x - i].getPiece() == null) {
                        chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(8, 107, 8));
                    } else {
                        if (field[y][x - i].getPiece().getColor() == "black") break;
                        else {
                            chessMainGraphic.getMainButtons()[y + 1][x - i + 1].setBackground(new Color(8, 107, 8));
                        }

                    }


                }
            }


        }


    }

    /**
     * it considers whether the entered x and y are in the range of field array or not.
     *
     * @param x X component of a square of the field of the game.
     * @param y Y component of a square of the field of the game.
     * @return a boolean variable which indicates whether whether the entered x and y are in the range of field array or not.
     */
    public boolean isItInRange(int x, int y) {
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7)
            return true;
        else return false;

    }


}

