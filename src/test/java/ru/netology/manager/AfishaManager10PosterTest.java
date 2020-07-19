package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;


import static org.junit.jupiter.api.Assertions.*;

public class AfishaManager10PosterTest {

    private AfishaManager manager = new AfishaManager(10);
    public Afisha first = new Afisha(1, 1, "first", "link1", "genre1");
    private Afisha second = new Afisha(2, 2, "second", "link2", "genre2");
    private Afisha third = new Afisha(3, 3, "third", "link3", "genre3");
    private Afisha fourth = new Afisha(4, 4, "fourth", "link4", "genre4");
    private Afisha fifth = new Afisha(5, 5, "fifth", "link5", "genre5");
    private Afisha sixth = new Afisha(6, 6, "sixth", "link6", "genre6");
    private Afisha seventh = new Afisha(7, 7, "seventh", "link7", "genre7");
    private Afisha eighth = new Afisha(8, 8, "eighth", "link8", "genre8");
    private Afisha ninth = new Afisha(9, 9, "ninth", "link9", "genre9");
    private Afisha tenth = new Afisha(10, 10, "tenth", "link10", "genre10");

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