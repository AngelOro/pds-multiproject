package co.com.poli.movieservice.repository;

import co.com.poli.movieservice.entity.Movie;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class MoviRepositoryTest {
    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void FindByRating() {
        Movie movie = Movie.builder()
                .title("Inglourious Basterds")
                .director("Quentin tarantino")
                .rating(9)
                .build();

        movieRepository.save(movie);
        List<Movie> movies = movieRepository.findByDirector(movie.getDirector());

        Assertions.assertThat(movies.size()).isEqualTo(2);
    }
}
