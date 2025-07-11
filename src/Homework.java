public class Homework {

    public static void main(String[] args) {
        //Одномерные массивы
        //1. Создайте метод, который выводит массив в консоль.
        int[] arr = {13, 5, 3, 4, 6, 7, 8, 9, -3, -10};
        printArr(arr);

        //2. Напишите метод, который принимает массив целых чисел и вычисляет сумму всех его элементов.
        int[] arrForSum = {13, 5, 3, 4, 6, 7, 8, 9, -3, -10};
        System.out.println(sumArr(arrForSum));

        //3. Реализуйте метод для поиска минимального элемента в одномерном массиве.
        int[] arrForMin = {13, 5, 3, 4, 6, 7, 8, 9, -3, -10};
        System.out.println(minOfArr(arrForMin));

        //4. Создайте массив строк, инициализируйте его названиями месяцев года.
        // Выведите все строки, начинающиеся на букву "М".
        String[] months = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        printOfFirstChar(months, 'М');

        //5. Напишите метод, который инвертирует порядок элементов в одномерном массиве.
        int[] arrForInvert = {1, 2, 3, 4, 5};
        invertArr(arrForInvert);
        printArr(arrForInvert);

        //6. Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы.
        int[] arrDuplicate = {1, 2, 3, 4, 5, 2};
        System.out.println(foundDuplicates(arrDuplicate));

        //7. Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.
        int[] arrNegative = {1, -2, -3, 4, -5, -2};
        absNegative(arrNegative);
        printArr(arrNegative);

        //Многомерные массивы
        //1. Создайте двумерный массив 3x3, заполните его единицами на главной диагонали и нулями в остальных ячейках.
        // Выведите массив.
        int[][] matrixThree = new int[3][3];
        printDiagonalMatrix(matrixThree);

        //2. Напишите метод, вычисляющий сумму всех элементов в двумерном массиве.
        int[][] matrix = {{1, 3, 3}, {3, 9, 3}, {3, 3, 77}};
        System.out.println(sumMatrix(matrix));

        //3. Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец).
        int[][] matrixForMax = {{1, 3, 3}, {3, 9, 3}, {3, 3, 77}};
        maxItemInMatrix(matrixForMax);

        //4. Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов).
        int[][] squareArr = {{3, 3, 3}, {3, 9, 3}, {3, 3, 3}};
        System.out.println(isSquareArray(squareArr));
        int[][] notSquareArr = {{1, 3, 3}, {99, 9}, {3, 3, 77}};
        System.out.println(isSquareArray(notSquareArr));

        //5. Напишите метод, который находит сумму элементов каждой строки,
        // минимальное и максимальное значение двумерного массива и выводит результаты.
        int[][] arrSumRowMinMax = {{1, 3, 3}, {99, 9}, {3, 3, 77}};
        printSumRowAndMinMaxElement(arrSumRowMinMax);

        //6. Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных -1.
        int[][] mtxEvenOdd = new int[3][3];
        fillArrayByEvenOdd(mtxEvenOdd);
        for (int[] i : mtxEvenOdd) {
            printArr(i);
        }
    }

    /**
     * Назначение: Выводит массив в консоль
     *
     * @param arr - Одномерный целочисленный массив
     */
    static void printArr(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Назначение: Принимает массив целых чисел и вычисляет сумму всех его элементов
     *
     * @param arr - Одномерный целочисленный массив
     * @return - Сумма всех элементов массива
     */
    static int sumArr(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * Назначение: Поиск минимального элемента в одномерном массиве
     *
     * @param arr - Одномерный целочисленный массив
     * @return - Минимальный элемент массива
     */
    static int minOfArr(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * Назначение: Выводит все строки массива, по первому символу в строке
     *
     * @param arr       - Одномерный целочисленный массив
     * @param firstChar - Первый символ элемента массива, по которому будет произведен поиск
     */
    static void printOfFirstChar(String[] arr, char firstChar) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        boolean isFound = false;
        System.out.print("[");
        for (String i : arr) {
            if (i != null && !i.isEmpty() && i.charAt(0) == firstChar) {
                if (isFound) {
                    System.out.print(", ");
                }
                System.out.print(i);
                isFound = true;
            }
        }
        System.out.println("]");
    }

    /**
     * Назначение: Инвертирует порядок элементов в одномерном массиве
     *
     * @param arr - Одномерный целочисленный массив
     */
    static void invertArr(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        int buf = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            buf = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = buf;
        }
    }

    /**
     * Назначение: Проверяет, есть ли в массиве повторяющиеся элементы
     *
     * @param arr - Одномерный целочисленный массив
     * @return - Найден повторяющиеся элемент: true - да, false - нет
     */
    static boolean foundDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Назначение: Заменяет все отрицательные числа в массиве на их абсолютные значения
     *
     * @param arr - Одномерный целочисленный массив
     */
    static void absNegative(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
    }

    /**
     * Назначение: Заполняет массив единицами на главной диагонали и нулями в остальных ячейках. Выводит массив
     *
     * @param matrix - Двумерный целочисленный массив
     */
    static void printDiagonalMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
        for (int[] i : matrix) {
            printArr(i);
        }
    }

    /**
     * Назначение: Вычисляет сумму всех элементов в двумерном массиве
     *
     * @param matrix - Двумерный целочисленный массив
     * @return - Сумма всех элементов в двумерном массиве
     */
    static int sumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        int sum = 0;
        for (int[] i : matrix) {
            for (int j : i) {
                sum += j;
            }
        }
        return sum;
    }

    /**
     * Назначение: Ищет максимальный элемент в матрице и вывод его координаты (строка, столбец)
     *
     * @param matrix - Двумерный целочисленный массив
     */
    static void maxItemInMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        int max = Integer.MIN_VALUE;
        int x = -1;
        int y = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        if (x != -1) {
            printArr(new int[]{x, y});
        }
    }

    /**
     * Назначение: Проверяет, является ли двумерный массив квадратным (количество строк = количеству столбцов)
     *
     * @param matrix - Двумерный целочисленный массив
     * @return - Является квадратным: true - да, false - нет
     */
    static boolean isSquareArray(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        if (matrix.length == 0) {
            return true;
        }
        int size = matrix.length;
        for (int[] i : matrix) {
            if (i == null) {
                return false;
            }
            if (i.length != size) {
                return false;
            }
        }
        return true;
    }

    /**
     * Назначение: Находит сумму элементов каждой строки,
     * минимальное и максимальное значение двумерного массива и выводит результаты
     *
     * @param matrix - Двумерный целочисленный массив
     */
    static void printSumRowAndMinMaxElement(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        int minEl = matrix[0][0];
        int maxEl = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            int sumRow = 0;
            if (matrix[i].length == 0) {
                continue;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow += matrix[i][j];
                if (minEl > matrix[i][j]) {
                    minEl = matrix[i][j];
                }
                if (maxEl < matrix[i][j]) {
                    maxEl = matrix[i][j];
                }
            }
            System.out.printf("Сумма элементов строки %s: %s%s", i, sumRow, System.lineSeparator());
        }
        System.out.printf("Минимальный и максимальный элементы: %s и %s%s", minEl, maxEl, System.lineSeparator());
    }

    /**
     * Назначение: Заполняет двумерный массив так, чтобы элементы на четных позициях были 0, на нечетных -1
     *
     * @param matrix - Двумерный целочисленный массив
     */
    static void fillArrayByEvenOdd(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ((i + j) % 2 == 0) ? 0 : -1;
            }
        }
    }
}