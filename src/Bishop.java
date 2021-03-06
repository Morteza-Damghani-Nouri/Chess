/**
 * it extends Piece class and simulates bishop piece in chess.
 *
 * @author MORTEZA DAMGHANI NOURI.
 * @version 1.
 */

public class Bishop extends Piece {

    public Bishop(boolean existence, int x, int y, String c, int i) {
        super(existence, x, y, c, i);
    }

    /**
     * @param currentX,        the place(x).
     * @param currentY,the     place(y) of the piece.
     * @param nextX,           the place(x) of the piece we want it to go.
     * @param nextY,the        the place(y) of the piece we want it to go.
     * @param field            it is an array of object of place class which simulates the field of the chess game.
     * @param chessMainGraphic it is an object of NewGraphic class.
     * @return it is a boolean variable which shows that the movement was successful or not.
     */


    @Override
    public boolean move(int currentX, int currentY, int nextX, int nextY, Place[][] field, NewGraphic chessMainGraphic) {
        boolean result = super.move(currentX, currentY, nextX, nextY, field, chessMainGraphic);
        if (!result)
            return false;
        else {
            if (nextY == currentY + 1 && nextX == currentX + 1) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY + i][currentX + i] != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    byte w = 0;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 11;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;

            }
            if (nextY == currentY + 2 && nextX == currentX + 2) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY + i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int u = 10, n = 2;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 10, n = 12;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 3 && nextX == currentX + 3) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY + i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int y = 9;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 11, y = 1;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 4 && nextX == currentX + 4) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY + i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int p = 8;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int q = 11, i;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 5 && nextX == currentX + 5) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY + i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int o = 13;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 13;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 6 && nextX == currentX + 6) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY + i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int o = 14;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 14;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 7 && nextX == currentX + 7) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY + i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int o = 15;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int m = 15;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 1 && nextX == currentX - 1) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY - i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 101;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 101;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 2 && nextX == currentX - 2) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY - i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 102;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 102;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 3 && nextX == currentX - 3) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY - i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 103;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 103;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 4 && nextX == currentX - 4) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY - i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 104;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 104;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 5 && nextX == currentX - 5) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY - i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 105;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 105;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 6 && nextX == currentX - 6) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY - i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 106;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 106;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 7 && nextX == currentX - 7) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY - i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 107;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 107;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 1 && nextX == currentX + 1) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY - i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 11;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 11, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 2 && nextX == currentX + 2) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY - i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 12;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 12, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 3 && nextX == currentX + 3) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY - i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 13, q = 1;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 13, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 4 && nextX == currentX + 4) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY - i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 14, d;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 14, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 5 && nextX == currentX + 5) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY - i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 15, f;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 15, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 6 && nextX == currentX + 6) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY - i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 16;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 16, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY - 7 && nextX == currentX + 7) {
                for (int i = 1; currentY - i >= nextY + 1 && currentX + i <= nextX - 1; ++i) {
                    if (field[currentY - i][currentX + i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 17;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 17, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 1 && nextX == currentX - 1) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY + i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 21;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 21, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 2 && nextX == currentX - 2) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY + i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 22;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 22, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 3 && nextX == currentX - 3) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY + i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 23;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 23, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 4 && nextX == currentX - 4) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY + i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 24;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 24, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 5 && nextX == currentX - 5) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY + i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 25;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 25, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 6 && nextX == currentX - 6) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY + i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 26;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 26, l = 0;
                    field[nextY][nextX].getPiece().setExistence(false);
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);
                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                }
                return true;
            }
            if (nextY == currentY + 7 && nextX == currentX - 7) {
                for (int i = 1; currentY + i <= nextY - 1 && currentX - i >= nextX + 1; ++i) {
                    if (field[currentY + i][currentX - i].getPiece() != null) return false;

                }
                if (field[nextY][nextX].getPiece() == null) {
                    int w = 27;
                    changeMainButtonsIcons(currentX, currentY, nextX, nextY, field, chessMainGraphic);
                    field[nextY][nextX].setPiece(field[currentY][currentX].getPiece());
                    field[currentY][currentX].setPiece(null);

                    field[nextY][nextX].getPiece().setY(nextY);
                    field[nextY][nextX].getPiece().setX(nextX);
                } else {
                    if (field[nextY][nextX].getPiece().getColor().equals(field[currentY][currentX].getPiece().getColor()))
                        return false;
                    int p = 27, l = 0;
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
        Piece bishop = field[currentY][currentX].getPiece();
        if (bishop.getColor().equals("white")) {
            if (blackKingChecker(currentX + 1, currentY + 1, field) && betweenChecker1(currentX, currentY, currentX + 1, currentY + 1, field))
                return true;
            if (blackKingChecker(currentX + 2, currentY + 2, field) && betweenChecker1(currentX, currentY, currentX + 2, currentY + 2, field))
                return true;
            if (blackKingChecker(currentX + 3, currentY + 3, field) && betweenChecker1(currentX, currentY, currentX + 3, currentY + 3, field))
                return true;
            if (blackKingChecker(currentX + 4, currentY + 4, field) && betweenChecker1(currentX, currentY, currentX + 4, currentY + 4, field))
                return true;
            if (blackKingChecker(currentX + 5, currentY + 5, field) && betweenChecker1(currentX, currentY, currentX + 5, currentY + 5, field))
                return true;
            if (blackKingChecker(currentX + 6, currentY + 6, field) && betweenChecker1(currentX, currentY, currentX + 6, currentY + 6, field))
                return true;
            if (blackKingChecker(currentX + 7, currentY + 7, field) && betweenChecker1(currentX, currentY, currentX + 7, currentY + 7, field))
                return true;

            if (blackKingChecker(currentX - 1, currentY - 1, field) && betweenChecker2(currentX, currentY, currentX - 1, currentY - 1, field))
                return true;
            if (blackKingChecker(currentX - 2, currentY - 2, field) && betweenChecker2(currentX, currentY, currentX - 2, currentY - 2, field))
                return true;
            if (blackKingChecker(currentX - 3, currentY - 3, field) && betweenChecker2(currentX, currentY, currentX - 3, currentY - 3, field))
                return true;
            if (blackKingChecker(currentX - 4, currentY - 4, field) && betweenChecker2(currentX, currentY, currentX - 4, currentY - 4, field))
                return true;
            if (blackKingChecker(currentX - 5, currentY - 5, field) && betweenChecker2(currentX, currentY, currentX - 5, currentY - 5, field))
                return true;
            if (blackKingChecker(currentX - 6, currentY - 6, field) && betweenChecker2(currentX, currentY, currentX - 6, currentY - 6, field))
                return true;
            if (blackKingChecker(currentX - 7, currentY - 7, field) && betweenChecker2(currentX, currentY, currentX - 7, currentY - 7, field))
                return true;

            if (blackKingChecker(currentX + 1, currentY - 1, field) && betweenChecker3(currentX, currentY, currentX + 1, currentY - 1, field))
                return true;
            if (blackKingChecker(currentX + 2, currentY - 2, field) && betweenChecker3(currentX, currentY, currentX + 2, currentY - 2, field))
                return true;
            if (blackKingChecker(currentX + 3, currentY - 3, field) && betweenChecker3(currentX, currentY, currentX + 3, currentY - 3, field))
                return true;
            if (blackKingChecker(currentX + 4, currentY - 4, field) && betweenChecker3(currentX, currentY, currentX + 4, currentY - 4, field))
                return true;
            if (blackKingChecker(currentX + 5, currentY - 5, field) && betweenChecker3(currentX, currentY, currentX + 5, currentY - 5, field))
                return true;
            if (blackKingChecker(currentX + 6, currentY - 6, field) && betweenChecker3(currentX, currentY, currentX + 6, currentY - 6, field))
                return true;
            if (blackKingChecker(currentX + 7, currentY - 7, field) && betweenChecker3(currentX, currentY, currentX + 7, currentY - 7, field))
                return true;

            if (blackKingChecker(currentX - 1, currentY + 1, field) && betweenChecker4(currentX, currentY, currentX - 1, currentY + 1, field))
                return true;
            if (blackKingChecker(currentX - 2, currentY + 2, field) && betweenChecker4(currentX, currentY, currentX - 2, currentY + 2, field))
                return true;
            if (blackKingChecker(currentX - 3, currentY + 3, field) && betweenChecker4(currentX, currentY, currentX - 3, currentY + 3, field))
                return true;
            if (blackKingChecker(currentX - 4, currentY + 4, field) && betweenChecker4(currentX, currentY, currentX - 4, currentY + 4, field))
                return true;
            if (blackKingChecker(currentX - 5, currentY + 5, field) && betweenChecker4(currentX, currentY, currentX - 5, currentY + 5, field))
                return true;
            if (blackKingChecker(currentX - 6, currentY + 6, field) && betweenChecker4(currentX, currentY, currentX - 6, currentY + 6, field))
                return true;
            if (blackKingChecker(currentX - 7, currentY + 7, field) && betweenChecker4(currentX, currentY, currentX - 7, currentY + 7, field))
                return true;

        }
        if (bishop.getColor().equals("black")) {
            if (whiteKingChecker(currentX + 1, currentY + 1, field) && betweenChecker1(currentX, currentY, currentX + 1, currentY + 1, field))
                return true;
            if (whiteKingChecker(currentX + 2, currentY + 2, field) && betweenChecker1(currentX, currentY, currentX + 2, currentY + 2, field))
                return true;
            if (whiteKingChecker(currentX + 3, currentY + 3, field) && betweenChecker1(currentX, currentY, currentX + 3, currentY + 3, field))
                return true;
            if (whiteKingChecker(currentX + 4, currentY + 4, field) && betweenChecker1(currentX, currentY, currentX + 4, currentY + 4, field))
                return true;
            if (whiteKingChecker(currentX + 5, currentY + 5, field) && betweenChecker1(currentX, currentY, currentX + 5, currentY + 5, field))
                return true;
            if (whiteKingChecker(currentX + 6, currentY + 6, field) && betweenChecker1(currentX, currentY, currentX + 6, currentY + 6, field))
                return true;
            if (whiteKingChecker(currentX + 7, currentY + 7, field) && betweenChecker1(currentX, currentY, currentX + 7, currentY + 7, field))
                return true;

            if (whiteKingChecker(currentX - 1, currentY - 1, field) && betweenChecker2(currentX, currentY, currentX - 1, currentY - 1, field))
                return true;
            if (whiteKingChecker(currentX - 2, currentY - 2, field) && betweenChecker2(currentX, currentY, currentX - 2, currentY - 2, field))
                return true;
            if (whiteKingChecker(currentX - 3, currentY - 3, field) && betweenChecker2(currentX, currentY, currentX - 3, currentY - 3, field))
                return true;
            if (whiteKingChecker(currentX - 4, currentY - 4, field) && betweenChecker2(currentX, currentY, currentX - 4, currentY - 4, field))
                return true;
            if (whiteKingChecker(currentX - 5, currentY - 5, field) && betweenChecker2(currentX, currentY, currentX - 5, currentY - 5, field))
                return true;
            if (whiteKingChecker(currentX - 6, currentY - 6, field) && betweenChecker2(currentX, currentY, currentX - 6, currentY - 6, field))
                return true;
            if (whiteKingChecker(currentX - 7, currentY - 7, field) && betweenChecker2(currentX, currentY, currentX - 7, currentY - 7, field))
                return true;

            if (whiteKingChecker(currentX + 1, currentY - 1, field) && betweenChecker3(currentX, currentY, currentX + 1, currentY - 1, field))
                return true;
            if (whiteKingChecker(currentX + 2, currentY - 2, field) && betweenChecker3(currentX, currentY, currentX + 2, currentY - 2, field))
                return true;
            if (whiteKingChecker(currentX + 3, currentY - 3, field) && betweenChecker3(currentX, currentY, currentX + 3, currentY - 3, field))
                return true;
            if (whiteKingChecker(currentX + 4, currentY - 4, field) && betweenChecker3(currentX, currentY, currentX + 4, currentY - 4, field))
                return true;
            if (whiteKingChecker(currentX + 5, currentY - 5, field) && betweenChecker3(currentX, currentY, currentX + 5, currentY - 5, field))
                return true;
            if (whiteKingChecker(currentX + 6, currentY - 6, field) && betweenChecker3(currentX, currentY, currentX + 6, currentY - 6, field))
                return true;
            if (whiteKingChecker(currentX + 7, currentY - 7, field) && betweenChecker3(currentX, currentY, currentX + 7, currentY - 7, field))
                return true;

            if (whiteKingChecker(currentX - 1, currentY + 1, field) && betweenChecker4(currentX, currentY, currentX - 1, currentY + 1, field))
                return true;
            if (whiteKingChecker(currentX - 2, currentY + 2, field) && betweenChecker4(currentX, currentY, currentX - 2, currentY + 2, field))
                return true;
            if (whiteKingChecker(currentX - 3, currentY + 3, field) && betweenChecker4(currentX, currentY, currentX - 3, currentY + 3, field))
                return true;
            if (whiteKingChecker(currentX - 4, currentY + 4, field) && betweenChecker4(currentX, currentY, currentX - 4, currentY + 4, field))
                return true;
            if (whiteKingChecker(currentX - 5, currentY + 5, field) && betweenChecker4(currentX, currentY, currentX - 5, currentY + 5, field))
                return true;
            if (whiteKingChecker(currentX - 6, currentY + 6, field) && betweenChecker4(currentX, currentY, currentX - 6, currentY + 6, field))
                return true;
            if (whiteKingChecker(currentX - 7, currentY + 7, field) && betweenChecker4(currentX, currentY, currentX - 7, currentY + 7, field))
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
        for (int i = 1; currentX + i <= nextX - 1 && currentY + i <= nextY - 1; ++i) {
            if (field[currentY + i][currentX + i].getPiece() != null) return false;

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
        for (int i = 1; currentX - i >= nextX + 1 && currentY - i >= nextY + 1; ++i) {
            if (field[currentY - i][currentX - i].getPiece() != null) return false;

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
        for (int i = 1; currentX + i <= nextX - 1 && currentY - i >= nextY + 1; ++i) {
            if (field[currentY - i][currentX + i].getPiece() != null) return false;

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
        for (int i = 1; currentX - i >= nextX + 1 && currentY + i <= nextY - 1; ++i) {
            if (field[currentY + i][currentX - i].getPiece() != null) return false;

        }
        return true;

    }


}
