import java.io.*;
import java.util.ArrayList;

/*
 //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц,
        // 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        //Сгенерировать отчеты нужно через DataGenerator
        //В path указать путь до папки, где сгенерятся отчеты
        //String path = "";
        //DataGenerator.createReports(path);

        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд


        // Задача №2
        // Необходим составить отчет о расходах всех магазинов за весь период в разбивке по магазинам
        // (т.е. прочитать все файлы внутри папки)
        // Формат ожидаемого результат:
        // Расходы pyterochka за весь период: 20032220.00
        // Расходы perekrestok за весь период: 1734220.00
        // .. и тд

 */
public class Main {
    public static void main(String[] args) throws IOException {
        String source = "C:\\Users\\user\\IdeaProjects\\Homework5expert\\reports";
        String path = "C:\\Users\\user\\IdeaProjects\\Homework5expert\\src\\reports.txt";
        DataGenerator.DataGenerator(path);
/*
        String filename = fileName.get(0);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        StringBuilder resultBuffered = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        while (bufferedReader.ready()) {
            resultBuffered.append(bufferedReader.readLine()).append(" ");}
        bufferedReader.close();
        System.out.println(resultBuffered);
        String [] data = resultBuffered.toString().split(" ");
        System.out.println(data[0]);
        //       ArrayList<String> fileName = new ArrayList<>();
        //       DataGenerator.nameAllFiles(source, fileName);
        //       System.out.println(fileName);
        //       System.out.println(fileName.get(0));
 */
    }
}