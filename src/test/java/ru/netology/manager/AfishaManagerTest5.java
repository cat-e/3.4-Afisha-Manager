package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;
import ru.netology.manager.AfishaManager;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest5 {
    private AfishaManager manager = new AfishaManager(5);
    private Afisha first = new Afisha(1, 1, "first", "link", "genre");
    private Afisha second = new Afisha(2, 2, "second", "link", "genre");
    private Afisha third = new Afisha(3, 3, "third", "link", "genre");
    private Afisha fourth = new Afisha(4, 4, "fourth", "link", "genre");
    private Afisha fifth = new Afisha(5, 5, "fifth", "link", "genre");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
    }

    @Test
    public void shouldShowFivePosters() {
        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


}