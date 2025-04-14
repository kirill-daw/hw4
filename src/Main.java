import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Scanner ageScan = new Scanner(System.in);
        System.out.print("Введите возраст человека, чтобы узнать, совершеннолетний ли он: ");
        byte age = ageScan.nextByte();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задание 2");
        Scanner temperatureScan = new Scanner(System.in);
        System.out.print("Введите температуру на улице: ");
        byte temperature = temperatureScan.nextByte();
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        }

        System.out.println("Задание 3");
        Scanner speedScan = new Scanner(System.in);
        System.out.println("Введите скорость вашего автомобиля: ");
        short speed = speedScan.nextShort();
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.");
        }

        System.out.println("Задание 4");
        Scanner yearsOldScan = new Scanner(System.in);
        System.out.println("Введите возраст человека, чтобы узнать его место в жизни: ");
        byte yearsOld = yearsOldScan.nextByte();
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
        Scanner ageKidScan = new Scanner(System.in);
        System.out.println("Введите возраст ребёнка, чтобы узнать, может ли он кататься на аттракционах: ");
        byte ageKid = ageKidScan.nextByte();
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
        Scanner seatsQuantityScan = new Scanner(System.in);
        System.out.println("Введите количество занятых мест в поезде: ");
        byte seatsQuantity = seatsQuantityScan.nextByte();
        boolean capacity = seatsQuantity >= 0 && seatsQuantity < 102;
        if (seatsQuantity < 60) {
            System.out.println("Если в вагоне занято " + seatsQuantity + " мест, то ещё остались сидячие места.");
        } else if (capacity) {
            System.out.println("Если в вагоне занято " + seatsQuantity + " мест, то остались только стоячие места.");
        } else {
            System.out.println("Если в вагоне занято " + seatsQuantity + " мест, то вагон полон.");
        }

        System.out.println("Задание 7");
        Scanner oneNumberScan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int oneNumber = oneNumberScan.nextInt();
        Scanner twoNumberScan = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        int twoNumber = twoNumberScan.nextInt();
        Scanner threeNumberScan = new Scanner(System.in);
        System.out.println("Введите третье число: ");
        int threeNumber = threeNumberScan.nextInt();
        if (oneNumber >= twoNumber && oneNumber >= threeNumber) {
            System.out.println(oneNumber + " является наибольшим числом.");
        } else if (twoNumber >= threeNumber) {
            System.out.println(twoNumber + " является наибольшим числом.");
        } else {
            System.out.println(threeNumber + " является наибольшим числом.");
        }
    }
}