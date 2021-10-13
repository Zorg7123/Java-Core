package Lesson05;

public class appData {

    private String[] header;
    private int[][] data;

    public appData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int i, int j, int value) {
        data[i][j] = value;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

}