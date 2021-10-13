package Lesson05;

import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        //Value
        int from = 3;
        int until = 4;
        String[] headMassive = new String[until];
        for (int i = 0; i < headMassive.length; i++) {
            headMassive[i] = "Value " + i;
        }
//содержимое data
        int[][] dataMassive = new int[from][until];
        for (int i = 0; i < dataMassive.length; i++) {
            for (int j = 0; j < dataMassive[i].length; j++) {
                dataMassive[i][j] = (int) (Math.random() * 100);
            }
        }

        appData value = new appData(headMassive, dataMassive);
        value.getHeader();
//записываем информацию в файл
        try (PrintWriter DataValue = new PrintWriter("test.csv")) {
            for (int i = 0; i < value.getHeader().length - 1; i++) {
                DataValue.print(value.getHeader()[i] + "; ");
            }
            DataValue.println(value.getHeader()[value.getHeader().length - 1]);

            for (int i = 0; i < value.getData().length - 1; i++) {
                for (int j = 0; j < value.getData()[i].length - 1; j++) {
                    DataValue.print(value.getData()[i][j] + "; ");
                }
                DataValue.println(value.getData()[i][value.getData()[i].length - 1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//считываем информацию из файла
        try (BufferedReader ValueData = new BufferedReader(new FileReader("test.csv"))) {
            String str = null;
            while ((str = ValueData.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

