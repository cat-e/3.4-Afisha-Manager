package ru.netology.repository;

import ru.netology.domain.Afisha;

public class AfishaRepository {
    int amountFilmsMax = 10;
    private Afisha[] items = new Afisha[0];

    public AfishaRepository(int amountFilmsMax) {
        this.amountFilmsMax = amountFilmsMax;

    }

    public Afisha[] findAll() {
        int filmsToShow;
        if (amountFilmsMax >= items.length) {
            filmsToShow = items.length;
        }
        filmsToShow = amountFilmsMax;
        Afisha[] result = new Afisha[filmsToShow];
        for (int i = 0; i < result.length; i++) {
            int index = filmsToShow - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public Afisha[] findById(int id) {
        Afisha[] tmp = new Afisha[items.length];
        int index = 0;
        for (Afisha item : items) {
            if (item.getId() == id) {
                tmp[index] = item;
            }
            return null;
        }
        return tmp;
    }

    public Afisha[] save(Afisha item) {
        int length = items.length + 1;
        Afisha[] tmp = new Afisha[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
        return items;
    }

    public Afisha[] removeById(int id) {
        int length = items.length - 1;
        Afisha[] tmp = new Afisha[length];
        int idx = 0;
        for (Afisha item : items) {
            if (item.getId() != id) {
                tmp[idx] = item;
                idx++;
            }
        }
        items = tmp;
        return items;
    }

    public Afisha[] removeAll() {
        Afisha[] items = new Afisha[0];
        return items;
    }

}