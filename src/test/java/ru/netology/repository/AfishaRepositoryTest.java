package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Afisha;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {
    private AfishaRepository repository = new AfishaRepository(5);
    private Afisha first = new Afisha(1, 1, "first", "link1", "genre1");
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
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);
    }

    @Test
    public void shouldShowFivePosters() {
        Afisha[] actual = repository.findAll();
        Afisha[] expected = new Afisha[]{fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindById() {
        int idToFind = 1;
        repository.findById(idToFind);
        Afisha[] actual = repository.findById(idToFind);
        Afisha[] expected = new Afisha[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdIfExists() {
        int idToRemove = 1;
        repository.removeById(idToRemove);
        Afisha[] actual = repository.findAll();
        Afisha[] expected = new Afisha[]{fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveAll() {
        repository.removeAll();
        Afisha[] actual = repository.removeAll();
        Afisha[] expected = new Afisha[]{};

        assertArrayEquals(expected, actual);
    }
}