package task4;


public abstract class AbstractArrayOfPoints {
    // Запис нових координат точки:
    public abstract void setPoint(int i, double x, double y);

    // Отримання X точки i:
    public abstract double getX(int i);

    // Отримання Y точки i:
    public abstract double getY(int i);

    // Отримання кількості точок:
    public abstract int count();

    // Додавання точки в кінець масиву:
    public abstract void addPoint(double x, double y);

    // Видалення останньої точки:
    public abstract void removeLast();

    public void sortByY() {
        boolean mustSort; // Повторюємо доти,
        // доки mustSort дорівнює true
        do {
            mustSort = false;
            for (int i = 0; i < count() - 1; i++) {
                if (getY(i) > getY(i + 1)) {
                    // обмінюємо елементи місцями
                    double x = getX(i);
                    double y = getY(i);
                    setPoint(i, getX(i + 1), getY(i + 1));
                    setPoint(i + 1, x, y);
                    mustSort = true;
                }
            }
        }
        while (mustSort);
    }

    // Сортування за значеннями X:
    public void sortByX() {
        boolean mustSort; // Повторюємо доти,
        // доки mustSort дорівнює true
        do {
            mustSort = false;
            for (int i = 0; i < count() - 1; i++) {
                if (getX(i) > getX(i + 1)) {
                    // обмінюємо елементи місцями
                    double x = getX(i);
                    double y = getY(i);
                    setPoint(i, getX(i + 1), getY(i + 1));
                    setPoint(i + 1, x, y);
                    mustSort = true;
                }
            }
        }
        while (mustSort);
    }

    // Аналогічно можна реалізувати функцію sortByY()

    // Виведення точок у рядок:
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < count(); i++) {
            s += "x = " + getX(i) + " \ty = " + getY(i) + "\n";
        }
        return s + "\n";
    }

    // Тестуємо сортування на чотирьох точках:
    public void test() {
        System.out.println("Adding 4 points and sorting them by Y");
        addPoint(22, 45);
        addPoint(4, 11);
        addPoint(30, 5.5);
        addPoint(-2, 48);
        sortByY();
        System.out.println("Count: " + count());
        System.out.println(this);
        System.out.println("Removing 2 elem");
        removeLast();
        removeLast();
        System.out.println("Count: " + count());
        System.out.println(this);
        System.out.println("Trying to set another value for points 0 and 12");
        setPoint(12, 3,2);
        setPoint(0, 520, 1);
        System.out.println(this);
        System.out.println("Sorting them by X");
        sortByX();
        System.out.println(this);
    }

}

