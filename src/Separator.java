/*
Добавьте в него поле array и конструктор, инициализирующий его.

Также реализуйте методы even() и odd(),
они должны возвращать массив четных или нечетных чисел, отобранных из array.
 */
public class Separator {
    int[] array;
    
    Separator(int[] inputArray) {
        this.array = inputArray;
    }

    public int[] even() {
        int[] returnArray = new int[array.length];
        int arrayCount = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0)
                returnArray[arrayCount++] = array[i];
        }
        return returnArray;
    }

    public int[] odd() {
        int[] returnArray = new int[array.length];
        int arrayCount = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0)
                returnArray[arrayCount++] = array[i];
        }
        return returnArray;
    }

}
