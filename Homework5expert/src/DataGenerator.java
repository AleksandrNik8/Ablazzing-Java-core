//Сгенерировать отчеты нужно через DataGenerator
//В path указать путь до папки, где сгенерятся отчеты
//String path = "";
//DataGenerator.createReports(path);


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator extends Exception {
    public static void nameAllFiles(String source, List<String> fileName) { //метод заполнения массива с адресами
        File file = new File(source);
        File[] files = file.listFiles();
        for (File fille : files) {
            fileName.add(fille.getAbsolutePath());
        }
    }

    //метод для получения массива строк по каждой строке из очета за месяц
    public static String[] data(String filename) throws IOException {
        String file = filename;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        StringBuilder resultBuffered = new StringBuilder();

        while (bufferedReader.ready()) {
            resultBuffered.append(bufferedReader.readLine()).append(" ");
        }
        bufferedReader.close();
        String[] data = resultBuffered.toString().split(" ");

        return data;
    }

    /*
            // Задача №1
           // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
           // Формат ожидаемого результат:
           // Прибыль по магазину pyterochka по месяцам
           // 01.2012: 20000.00
           // 02.2012: -100332.00
           // и тд
            */
    public static void DataGenerator(String path) throws IOException {
        String source = "C:\\Users\\user\\IdeaProjects\\Homework5expert\\reports";
        ArrayList<String> fileName = new ArrayList<>();//массив с адресами отчетов по месяцам
        nameAllFiles(source, fileName);//заполняем массив через метод
        String repotrPyterochka = "Прибыль по магазину pyterochka по месяцам " + "\n";

        for (int i = 0; i < fileName.size(); i++) {
            String[] report = data(fileName.get(i));
            System.out.println(report[0]);
            String repoFormonth = report[i].split(";")[3].split("/")[1] + "." + report[i].split(";")[3].split("/")[2] + " : ";
            float rez = 0;
            for (int j = 0; j < report.length; j++) {
                String[] promm = report[j].split(";");
                if (promm[0].equals("pyterochka")) {
                    rez += Float.parseFloat(promm[1]) - Float.parseFloat(promm[2]);
                    // System.out.println(rez);
                }
            }
            repoFormonth += rez + "\n";
            repotrPyterochka += repoFormonth;
        }


        FileWriter fileWriter = new FileWriter(path);
        String resultBuffered = repotrPyterochka;//строка- отчет по месяцам магазина пятерочка
        fileWriter.write(resultBuffered);
        fileWriter.close();
    }


}

