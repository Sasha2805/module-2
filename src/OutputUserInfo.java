import java.util.Scanner;

public class OutputUserInfo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String year = "";

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите город проживания: ");
        String city = in.nextLine();

        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.println("Напишите свое хобби: ");
        String hobby = in.nextLine();

        if (age > 10 && age < 15){
            year = "лет";
        }else {
            switch (age % 10) {
                case 1:
                    year = "год";
                    break;
                case 2:
                case 3:
                case 4:
                    year = "года";
                    break;
                default:
                    year = "лет";
                    break;
            }
        }

        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);

        System.out.println("----------------------------");

        System.out.println("Человек по имени " + name + " живет в городе " + city + ".");
        System.out.println("Этому человеку " + age + " " + year + " и его хобби " + hobby + ".");

        System.out.println("----------------------------");

        System.out.println(name + " - " + "имя");
        System.out.println(city + " - " + "город");
        System.out.println(age + " - " + "возраст");
        System.out.println(hobby + " - " + "хобби");

    }
}
