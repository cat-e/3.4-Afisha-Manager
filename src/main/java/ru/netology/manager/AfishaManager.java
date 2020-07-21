package ru.netology.manager;

import ru.netology.domain.Afisha;
import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    int amountFilmsMax = 10;
    private AfishaRepository repository;


//
//    public void add(Afisha item) {
//        repository.save(item);
//    }

    public Afisha[] getAll() {
        Afisha[] items = repository.findAll();
        int filmsToShow;
        if (amountFilmsMax >= items.length) {
            filmsToShow = items.length;
        }
        filmsToShow = amountFilmsMax;
        Afisha[] result = new Afisha[filmsToShow];
// перебираем массив в прямом порядке
// но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = filmsToShow - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public AfishaManager(int amountFilmsMax) {
        this.amountFilmsMax = amountFilmsMax;
    }
}