package ru.netology.manager;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Afisha;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AfishaManager8PosterTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager = new AfishaManager(8);
    private Afisha first = new Afisha(1, 1, "first", "link1", "genre1");
    private Afisha second = new Afisha(2, 2, "second", "link2", "genre2");
    private Afisha third = new Afisha(3, 3, "third", "link3", "genre3");
    private Afisha fourth = new Afisha(4, 4, "fourth", "link4", "genre4");
    private Afisha fifth = new Afisha(5, 5, "fifth", "link5", "genre5");
    private Afisha sixth = new Afisha(6, 6, "sixth", "link6", "genre6");
    private Afisha seventh = new Afisha(7, 7, "seventh", "link7", "genre7");
    private Afisha eighth = new Afisha(8, 8, "eighth", "link8", "genre8");
    private Afisha ninth = new Afisha(9, 9, "ninth", "link9", "genre9");


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

    }

    @Test
    public void shouldShow8Posters() {
        repository.findAll();
        Afisha[] returned = new Afisha[]{first, second, third, fourth, fifth, sixth, seventh, eighth};
        doReturn(returned).when(repository).findAll();

        Afisha[] actual = manager.getAll();
        Afisha[] expected = new Afisha[]{eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }


}