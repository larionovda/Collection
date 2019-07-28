package collections;

public class DemoService {
    public static void run(){
        TextService textService = new TextService();
        textService.collectionTask1(); // получаем количество повторяющихся слов из текста
        textService.collectionTask2(); // получаем уникальные слова из текса
        textService.collectionTask3(); // получить ествественную сортировку и сортировку по длине слов
    }
}
