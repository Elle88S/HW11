package ru.netology.HW11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testFindAll() {
        FilmManager manager = new FilmManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой Тур");
        manager.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентльмены", "Человек-невидимка", "Тролли.Мировой Тур", "Номер один" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllIfNoAdded() {
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllIfOneAdded() {
        FilmManager manager = new FilmManager();
        manager.addMovie("Номер один");
        String[] expected = {"Номер один" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        FilmManager manager = new FilmManager();
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой Тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой Тур", "Человек-невидимка", "Джентльмены", "Отель Белград" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOne() {
        FilmManager manager = new FilmManager(1);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой Тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastAboveLimit() {
        FilmManager manager = new FilmManager(10);
        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли.Мировой Тур");
        manager.addMovie("Номер один");

        String[] expected = {"Номер один", "Тролли.Мировой Тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
