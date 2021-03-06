package ecm.util.filtering;

/**
 * Поле из JSON фильтра, может быть проперти класса (isCol) либо значением (!isCol)
 * @author dkarachurin
 */
public class Field {
    private String op;
    private String data;
    private boolean isCol;

    public Field() {
    }

    public Field(String op, String data, boolean isCol) {
        this.op = op;
        this.data = data;
        this.isCol = isCol;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isCol() {
        return isCol;
    }

    public void setCol(boolean col) {
        isCol = col;
    }

    @Override
    public String toString() {
        return data;
    }
}
