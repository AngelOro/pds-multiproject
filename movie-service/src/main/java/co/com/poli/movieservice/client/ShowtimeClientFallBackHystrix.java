package co.com.poli.movieservice.client;

import co.com.poli.movieservice.helpers.Response;
import co.com.poli.movieservice.helpers.ResponseBuilder;
import co.com.poli.movieservice.model.Showtime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class ShowtimeClientFallBackHystrix implements ShowtimeClient {

    private final ResponseBuilder builder;

    @Override
    public Response findAllIds(Long id) {
        Showtime showtime = new Showtime();
        showtime.setDate(new Date());
        showtime.setItems(null);
        return builder.success(showtime);
    }

}
