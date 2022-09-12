public class Main {
    public static void main(String[] args) {
        // Условный оператор. Часть 1
        // Задача 1
        System.out.println("Условный оператор.Часть 1  Задача 1");
        int age = 34;
        if (age >= 18) {
            System.out.println(" Поздравляем с совершеннослетием! ");
        }
        if (age <= 18) {
            System.out.println(" возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        // Задача 2
        System.out.println("Условный оператор.Часть 1  Задача 2");
        if (age >= 7 && age < 18) {
            System.out.println("ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        // Задача 3
        System.out.println("Условный оператор.Часть 1  Задача 3");
        int capacity = 102;
        int seatsCount = 60;                         // сидячие места
        int standingPlaces = capacity - seatsCount; // стоячие  места 42 места

        int seatUsed = 20;  // использовано сидячих
        int otherUsed = 20;   // использовано стоячих

        if ((seatUsed + otherUsed) >= capacity) {
            System.out.println(" Вагон полностью забит");
        }
        if ((seatUsed + otherUsed) >= capacity || (seatUsed > seatsCount)) {
            System.out.println(" Вагон полностью забит");                          //сидячие
        }
        if (seatUsed < seatsCount) {
            System.out.println(" Есть еще " + (seatsCount - seatUsed) + " сидячих мест");
        }
        if ((seatUsed + otherUsed) >= capacity || (otherUsed > standingPlaces)) {
            System.out.println(" Вагон полностью забит");
        }
        if (otherUsed < standingPlaces) {
            System.out.println(" Есть еще " + (standingPlaces - otherUsed) + " сидячих мест");  // стоячие
        }

        // Условный оператор. Часть 1  Домашнее задание -2
        System.out.println("Условный оператор. Часть 1  Домашнее задание - 2.  Задание 1");

        if (age >= 18) {
            System.out.println(" Поздравляем с совершеннослетием! ");
        } else {
            System.out.println(" возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }
        // Задание 2
        System.out.println("Условный оператор. Часть 1  Домашнее задание - 2.  Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
         } else if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        // Задание 3
        System.out.println("Условный оператор. Часть 1  Домашнее задание - 2.  Задание 3");
        if ((seatUsed + otherUsed) >= capacity) {
            System.out.println(" Вагон полностью забит");
        } else if ((seatUsed + otherUsed) >= capacity || (seatUsed > seatsCount)) {
            System.out.println(" Вагон полностью забит");                          //сидячие
        } else if (seatUsed < seatsCount) {
            System.out.println(" Есть еще " + (seatsCount - seatUsed) + " сидячих мест");
        }else if ((seatUsed + otherUsed) >= capacity || (otherUsed > standingPlaces)) {
            System.out.println(" Вагон полностью забит");
        }else if (otherUsed < standingPlaces) {
            System.out.println(" Есть еще " + (standingPlaces - otherUsed) + " сидячих мест");  // стоячие
        }


    }
    }



