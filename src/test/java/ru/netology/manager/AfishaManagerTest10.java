package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;
import ru.netology.manager.AfishaManager;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AfishaManagerTest10 {
    private AfishaManager manager = new AfishaManager(10);
    private Afisha first = new Afisha(1, 1, "first", "link", "genre");
    private Afisha second = new Afisha(2, 2, "second", "link", "genre");
    private Afisha third = new Afisha(3, 3, "third", "link", "genre");
    private Afisha fourth = new Afisha(4, 4, "fourth", "link", "genre");
    private Afisha fifth = new Afisha(5, 5, "fifth", "link", "genre");
    private Afisha sixth = new Afisha(6, 6, "sixth", "link", "genre");
    private Afisha seventh = new Afisha(7, 7, "seventh", "link", "genre");
    private Afisha eighth = new Afisha(8, 8, "eighth", "link", "genre");
    private Afisha ninth = new Afisha(9, 9, "ninth", "link", "genre");
    private Afisha tenth = new Afisha(10, 10, "tenth", "link", "genre");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
    }

    @Test
    public void shouldShowTenPosters() {

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

}