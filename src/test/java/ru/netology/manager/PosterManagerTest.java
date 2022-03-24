package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {

    PosterManager poster = new PosterManager();

    Movie first = new Movie(1, "Бладшот", "Боевик", false);
    Movie second = new Movie(2, "Вперед", "Мультфильм", false);
    Movie third = new Movie(3, "Отель Белград", "Комедия", false);
    Movie fourth = new Movie(4, "Джентельмены", "Боевик", false);
    Movie fifth = new Movie(5, "Человек-невидимка", "Ужасы", false);
    Movie sixth = new Movie(6, "Тролли. Мировой тур", "Мультфильм", false);
    Movie seventh = new Movie(7, "Номер Один", "Комедия", false);
    Movie eighth = new Movie(8, "Илюзия контроля", "Триллер", false);
    Movie ninth = new Movie(9, "Анчартед: На картах не значится", "Боевик", true);
    Movie tenth = new Movie(10, "Смерть на ниле", "Детектив", false);
    Movie eleventh = new Movie(11, "Доктор свисток", "Комедия", true);
    Movie twelve = new Movie(12, "Флирт с дьяволом", "Триллер", false);

    @Test
    void shouldShowTenMovies() {

        poster.add(first);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(ninth);
        poster.add(tenth);
        poster.add(eleventh);
        poster.add(twelve);

        Movie[] expected = new Movie[]{
                twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

        assertArrayEquals(expected, poster.showMovies());
    }

    @Test
    void shouldShowAllMovies() {

        poster.add(first);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(ninth);
        poster.add(tenth);

        Movie[] expected = new Movie[]{
                tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, poster.showMovies());
    }

    @Test
    void shouldShowMoviesUnderTen() {

        poster.add(first);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);

        Movie[] expected = new Movie[]{
                sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, poster.showMovies());
    }

    @Test
    void shouldShowMoviesBelowTenCurrentMoviesLength() {

        PosterManager poster = new PosterManager(6);

        poster.add(first);
        poster.add(second);
        poster.add(third);
        poster.add(fourth);
        poster.add(fifth);
        poster.add(sixth);
        poster.add(seventh);
        poster.add(eighth);
        poster.add(ninth);
        poster.add(tenth);

        Movie[] expected = new Movie[]{
                tenth, ninth, eighth, seventh, sixth, fifth};

        assertArrayEquals(expected, poster.showMovies());
    }
}
