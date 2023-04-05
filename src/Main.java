public class Main {
    public static void main(String[] args) {

        // Сопровождение ответов на теоретические вопросы
        {
            // Цикл for
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            // Цикл while
            int i = 1;
            while (i <= 10) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();
            // Цикл do while
            int a = 20;
            do {
                System.out.print(a + " ");
                a++;
            }
            while (a <= 10);
            System.out.println();

            // Цикл for each
            String[] summerMonths = {"june", "july", "august" };
            for (String summerMonth : summerMonths) {
                System.out.println(summerMonth);
            }
            // Демонстрация работы конструктора
            Book novel = new Book("Pushkin", 200);
            System.out.println(novel.author + "/" + novel.pages);
        }
        // *************** ЗАДАЧА *****************
        /*Напишите программу, которая разделяет любую строку на две части
        ровно пополам по количеству символов.
        Вызов метода и разделение строки*/
        String numbers = "123456789";
        splitString(numbers);
        String letters = "зёрнашелуха";
        splitString(letters);

    }
    // *************** ЗАДАЧА *****************
    /* создаём метод для разделения строки и вывода в консоль*/
    public static void splitString (String string) {
        final int mid = string.length()/2;
        String firstHalfString = string.substring(0,mid);
        String secondHalfString = string.substring(mid);
        System.out.println(firstHalfString + " " + secondHalfString);
    }
}
