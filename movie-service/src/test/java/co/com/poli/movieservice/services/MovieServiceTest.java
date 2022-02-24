package co.com.poli.movieservice.services;

import co.com.poli.movieservice.entity.Movie;
import co.com.poli.movieservice.repository.MovieRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class MovieServiceTest {
    @Mock
    private MovieRepository movieRepository;
    private MovieService movieService;

    @BeforeEach
    public void begin(){
        MockitoAnnotations.initMocks(this);
        movieService = new MovieServiceImpl(movieRepository, null, null);

        Movie movie = Movie.builder()
                .title("Inglourious Basterds")
                .director("Quentin tarantino")
                .rating(9)
                .build();
        Mockito.when(movieRepository.findById(11L))
                .thenReturn(Optional.of(movie));
    }

    @Test
    public void when_findById_return_movie(){
        Movie movie = movieService.findById(11L);
        Assertions.assertThat(movie.getTitle()).isEqualTo("Inglourious Basterds");
    }

}
