package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.Afisha;
import ru.netology.manager.AfishaManager;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AfishaRepositoryTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;
    private Afisha first = new Afisha(1, 1, "first", "link1", "genre1");
    private Afisha second = new Afisha(2, 2, "second", "link2", "genre2");
    private Afisha third = new Afisha(3, 3, "third", "link3", "genre3");
    private Afisha fourth = new Afisha(4, 4, "fourth", "link4", "genre4");
    private Afisha fifth = new Afisha(5, 5, "fifth", "link5", "genre5");

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
    }

    @Test
    public void shouldShowAllItems() {
//        repository.findAll();
        Afisha[] returned = new Afisha[]{first, second, third, fourth, fifth};
        doReturn(returned).when(repository).findAll();
//        doNothing().when(repository).findAll();

        repository.findAll();
        Afisha[] expected = new Afisha[]{fifth, fourth, third, second, first};
//        Afisha[] actual = repository.findAll();
//        verify(repository).findAll();
    }

    @Test
    public void findById() {
        repository.findById(0);
        Afisha[] returned = new Afisha[]{first};
        doReturn(returned).when(repository).findAll();
//        doNothing().when(repository).findAll();

        repository.findById(0);
        Afisha[] expected = new Afisha[]{first};
        Afisha[] actual = repository.findAll();
        verify(repository).findAll();
    }

    @Test
    void save() {
        repository.save(first);
        Afisha[] returned = new Afisha[]{first};
        doReturn(returned).when(repository).findAll();
//        doNothing().when(repository).findAll();

        repository.save(first);
        Afisha[] expected = new Afisha[]{first};
        Afisha[] actual = repository.findAll();
        verify(repository).findAll();
    }

    @Test
    void removeById() {
        repository.removeById(0);
        Afisha[] returned = new Afisha[]{first};
        doReturn(returned).when(repository).findAll();
//        doNothing().when(repository).findAll();

        repository.removeById(0);
        Afisha[] expected = new Afisha[]{first};
        Afisha[] actual = repository.findAll();
        verify(repository).findAll();
    }

    @Test
    void removeAll() {
        repository.removeAll();
        Afisha[] returned = new Afisha[]{};
        doReturn(returned).when(repository).findAll();
//        doNothing().when(repository).findAll();

        repository.removeAll();
        Afisha[] expected = new Afisha[]{};
        Afisha[] actual = repository.findAll();
        verify(repository).findAll();
    }
}