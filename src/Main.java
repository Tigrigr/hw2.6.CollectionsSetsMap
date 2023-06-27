

public class Main {
    public static void main(String[] args) {
        Nums nums = new Nums();
        Words words = new Words();

        //Вызов метода для задачи 1
        nums.getOddNums();
        System.out.println();

        //Вызов метода для задачи 2
        nums.getUniqEvenNums();
        System.out.println();

        //Вызов метода для задачи 3
        words.getUniqWords();
        System.out.println();

        //Вызов метода для задачи 4
        words.getSumDoubleFromUniqWords();
    }
}