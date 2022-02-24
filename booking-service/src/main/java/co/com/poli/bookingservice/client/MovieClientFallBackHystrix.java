package co.com.poli.bookingservice.client;

import co.com.poli.bookingservice.helpers.Response;
import co.com.poli.bookingservice.helpers.ResponseBuilder;
import co.com.poli.bookingservice.model.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MovieClientFallBackHystrix implements MovieClient {

    private final ResponseBuilder builder;

    @Override
    public Response findById(Long id) {
        Movie movie = new Movie();
                movie.setTitle("");
                movie.setDirector("");
                movie.setRating(0);
        return  builder.success(movie);
    }

}
