public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello worl!d");
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleNam = "Ivanovich";
        String lastName  = "Ivanov";
        String fullName=lastName+" "+firstName+" "+middleNam;

        System.out.println(fullName);

    }
    public static void task2(){
        System.out.println("Задача 2");

        String fullName="Ivanov Ivan Ivanovich";
        String uppFullName=fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+uppFullName);

    }
    public static void task3(){
        System.out.println("Задача 3");

        String inFullName="Иванов Семён Семёнович";
        String outFullName=inFullName.replace("ё","e");
        System.out.println("Данные ФИО сотрудника — "+outFullName);

    }
}
