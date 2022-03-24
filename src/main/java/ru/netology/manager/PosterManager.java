package ru.netology.manager;

import ru.netology.domain.Movie;

public class PosterManager {
    private Movie[] movies = new Movie[0];
    private int currentMoviesLength = 10;

    public PosterManager() {
    }

    public PosterManager(int currentMoviesLength) {
        this.currentMoviesLength = currentMoviesLength;
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastCell = tmp.length - 1;
        tmp[lastCell] = movie;
        movies = tmp;
    }

    public Movie[] showMovies() {
        int resultLength = currentMoviesLength;
        if (movies.length < resultLength) {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int cell = movies.length - i - 1;
            result[i] = movies[cell];
        }
        return result;
    }
}
