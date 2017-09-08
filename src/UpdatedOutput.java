import java.util.Scanner;

public class UpdatedOutput {

    public static void main(String[] args) {
        String definiteEnd;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите город проживания: ");
        String city = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Напишите свое хобби: ");
        String hobby = in.nextLine();

        //call output methods
        //tableOutput(name, city, age, hobby);
        definiteEnd = definitionYear(age);
        textOutput(name, city, age, hobby, definiteEnd);
        //otherOutput(name, city, age, hobby);
    }

    public static void tableOutput(String name, String city, int age, String hobby) {
        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);
    }

    public static String definitionYear(int age) {
        String year;
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
        return year;
    }

    public static void textOutput(String name, String city, int age, String hobby, String definiteEnd) {
        System.out.println("Человек по имени " + name + " живет в городе " + city + ".");
        System.out.println("Этому человеку " + age + " " + definiteEnd + " и его хобби " + hobby + ".");
    }

    public static void otherOutput(String name, String city, int age, String hobby) {
        System.out.println(name + " - " + "имя");
        System.out.println(city + " - " + "город");
        System.out.println(age + " - " + "возраст");
        System.out.println(hobby + " - " + "хобби");
    }

}
