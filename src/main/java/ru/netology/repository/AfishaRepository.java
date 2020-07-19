package ru.netology.repository;

import ru.netology.domain.Afisha;

public class AfishaRepository {
    private Afisha[] items = new Afisha[0];
    int amountFilmsMax;

    public Afisha[] findAll() {
        return items;
    }

    public Afisha[] findById(int id) {
        Afisha[] tmp = new Afisha[amountFilmsMax];
        int index = 0;
        for (Afisha item : items) {
            Afisha[] result = new Afisha[0];
            if (item.getId() == id) {
                result[index] = item;
                index++;
            }
            items = result;
        }

    public void save(Afisha item) {
        int length = items.length + 1;
        Afisha[] tmp1 = new Afisha[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        Afisha[] tmp = new Afisha[length];
        int idx = 0;
        for (Afisha item : items) {
            if (item.getId() != id) {
                tmp[idx] = item;
                idx++;
            }
        }
    }

    public Afisha[] removeAll() {
        Afisha[] items = new Afisha[0];
        return items;
    }

}
