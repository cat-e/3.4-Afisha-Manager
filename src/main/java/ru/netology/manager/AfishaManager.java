package ru.netology.manager;

import ru.netology.domain.Afisha;

public class AfishaManager {
    int amountFilmsMax;
    private Afisha[] items = new Afisha[0];

    public void add(Afisha item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        Afisha[] tmp = new Afisha[length];


        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Afisha[] getAll() {
        Afisha[] result = new Afisha[amountFilmsMax];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = amountFilmsMax - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public AfishaManager(int amountFilmsMax) {
        this.amountFilmsMax = amountFilmsMax;
    }
}