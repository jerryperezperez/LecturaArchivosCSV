package src;

import java.util.ArrayList;

public class Table<E> {
    private ArrayList<E> headers;
    private ArrayList<ArrayList<E>> content;

    {
        this.content = new ArrayList<>();
    }

    public Table(ArrayList<E> headers, ArrayList<ArrayList<E>> content) {
        this.headers = headers;
        this.content = content;
    }

    public Table() {
    }

    public void setContent(ArrayList<ArrayList<E>> content) {
        this.content = content;
    }

    public ArrayList<ArrayList<E>> getContent() {
        return content;
    }

    public ArrayList<E> getHeaders() {
        return headers;
    }

    public ArrayList<E> getRow(int index) {
        return this.content.get(index);
    }

    public ArrayList<E> getColumn(int index) {
        //TODO Desarrollar el código para la devolución de una columna. Probablemente usando una estructura de control
        return null;
    }

    public boolean addRow(ArrayList<E> row) {
        return this.content.add(row);
    }

}
