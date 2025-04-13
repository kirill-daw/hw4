import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Scanner scannerAge = new Scanner(System.in);
        System.out.print("Введите возраст человека, чтобы узнать, совершеннолетний ли он: ");
        byte age = scannerAge.nextByte();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задание 2");
        Scanner scannerTemperature = new Scanner(System.in);
        System.out.print("Введите температуру на улице: ");
        byte temperature = scannerTemperature.nextByte();
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }

        System.out.println("Задание 3");
        Scanner scannerSpeed = new Scanner(System.in);
        System.out.println("Введите скорость вашего автомобиля: ");
        short speed = scannerSpeed.nextShort();
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.");
        }

        System.out.println("Задание 4");
        Scanner scannerYearsOld = new Scanner(System.in);
        System.out.println("Введите возраст человека, чтобы узнать его место в жизни: ");
        byte yearsOld = scannerYearsOld.nextByte();
        boolean kidsGarden = yearsOld >= 2 && yearsOld <= 6;
        boolean school = yearsOld >= 7 && yearsOld <= 17;
        boolean university = yearsOld >= 18 && yearsOld <= 24;
        boolean job = yearsOld > 24;
        if (kidsGarden) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад.");
        }
        if (school) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу.");
        }
        if (university) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет.");
        }
        if (job) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу.");
        }

        System.out.println("Задание 5");
        Scanner scanAge = new Scanner(System.in);
        System.out.println("Введите возраст ребёнка, чтобы узнать, может ли он кататься на аттракционах: ");
        byte ageKid = scanAge.nextByte();
        if (ageKid < 5) {
            System.out.println("Если возраст рёбенка равен " + ageKid + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageKid >= 5 && ageKid < 14) {
            System.out.println("Если возраст рёбенка равен " + ageKid + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (ageKid >= 14) {
            System.out.println("Если возраст рёбенка равен " + ageKid + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задание 6");
        Scanner scanSeatsQuantity = new Scanner(System.in);
        System.out.println("Введите количество занятых мест в поезде: ");
        byte seatsQuantity = scanSeatsQuantity.nextByte();
        boolean capacity = seatsQuantity >= 0 && seatsQuantity < 102;
        if (seatsQuantity < 60) {
            System.out.println("Если в вагоне занято " + seatsQuantity + " мест, то ещё остались сидячие места.");
        } else if (capacity) {
            System.out.println("Если в вагоне занято " + seatsQuantity + " мест, то остались только стоячие места.");
        } else {
            System.out.println("Если в вагоне занято " + seatsQuantity + " мест, то вагон полон.");
        }

        System.out.println("Задание 7");
        Scanner scanOneNumber = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int oneNumber = scanOneNumber.nextInt();
        Scanner scanTwoNumber = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int twoNumber = scanTwoNumber.nextInt();
        Scanner scanThreeNumber = new Scanner(System.in);
        System.out.println("Введите третье число: ");
        int threeNumber = scanThreeNumber.nextInt();
        if (oneNumber >= twoNumber && oneNumber >= threeNumber) {
            System.out.println(oneNumber + " является наибольшим числом.");
        } else if (twoNumber >= threeNumber) {
            System.out.println(twoNumber + " является наибольшим числом.");
        } else {
            System.out.println(threeNumber + " является наибольшим числом.");
        }
    }
}