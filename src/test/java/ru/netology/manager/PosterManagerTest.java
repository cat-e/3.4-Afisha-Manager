package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Poster;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTestNonEmpty {
    @Test
    public void shouldRemoveIfExists() {
        PosterManager manager = new PosterManager();
        int idToRemove = 1;
        Poster first = new Poster(1, 1, "first", 1, 1);
        Poster second = new Poster(2, 2, "second", 1, 1);
        Poster third = new Poster(3, 3, "third", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{third, second};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotRemoveIfNotExists() {
        PosterManager manager = new PosterManager();
        int idToRemove = 4;
        Poster first = new Poster(1, 1, "first", 1, 1);
        Poster second = new Poster(2, 2, "second", 1, 1);
        Poster third = new Poster(3, 3, "third", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        Poster[] actual = manager.getAll();
        Poster[] expected = new Poster[]{third, second, first};

        assertArrayEquals(expected, actual);
    }
}