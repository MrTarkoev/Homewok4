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
        } else if ((seatUsed + otherUsed) >= capacity || (otherUsed > standingPlaces)) {
            System.out.println(" Вагон полностью забит");
        } else if (otherUsed < standingPlaces) {
            System.out.println(" Есть еще " + (standingPlaces - otherUsed) + " сидячих мест");  // стоячие
        }
        // Условный оператор. Часть 1  Домашнее задание -3
        System.out.println("Условный оператор. Часть 1  Домашнее задание - 3.  Задание 1");

        int yearsOld = 9;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.printf("Если возраст человека " + yearsOld + " , то ему нужно ходить в детсиий сад");
        } else if (yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека " + yearsOld + " , то ему нужно ходить в школу");
        } else if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека " + yearsOld + " , то его место в университете ");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека " + yearsOld + " , то пора ходить на работу ");
        }



        // Условный оператор. Часть 1  Домашнее задание -3
        System.out.println("Условный оператор. Часть 1  Домашнее задание - 3.  Задание 2");

        if (yearsOld < 5) {
            System.out.println("он не может кататься на аттракционе");
        } else if (yearsOld > 5 || age < 14) {
            System.out.println(" он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if ( yearsOld > 14) {
            System.out.printf("может кататься без сопровождения взрослого.");
        }

        // Условный оператор. Часть 1  Домашнее задание -3
        System.out.println("Условный оператор. Часть 1  Домашнее задание - 3.  Задание 3");
        int one = 2;
        int two = 1;
        int three = 3;
        if ( one >= two) {
            if (one > three) {
                System.out.println(" максимальное число - " + one);
            } else if (three > one) {
                System.out.println(" Максимальное число - " + three);
            } else {
                System.out.println(" Все числа равны ");
            }
        } else if (one >= three) {
            if (two > three) {
                System.out.println(" Максимальное число - " + two);
            } else if (three > two) {
                System.out.println(" Максимальное число - " + three);
            } else {
                System.out.println(" Числа " + two + " и " + three + " равны");
            }
        } else {
            if (one > three) {
                System.out.println(" максимальное число - " + one);
            } else if (three > one) {
                System.out.println(" Максимальное число - " + three);
            } else {
                System.out.printf(" Все числа равны");
            }

        }

    }
}






