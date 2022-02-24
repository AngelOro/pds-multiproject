package co.com.poli.userservice.client;

import co.com.poli.userservice.helpers.Response;
import co.com.poli.userservice.helpers.ResponseBuilder;
import co.com.poli.userservice.model.Booking;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookingClientFallBackHystrix implements BookingClient {

    private final ResponseBuilder builder;

    @Override
    public Response findAllUserIds(Long id) {
        Booking booking = new Booking();
        booking.setUserId(0L);
        booking.setUser(null);
        booking.setShowtimeId(0L);
        booking.setShowtime(null);
        booking.setItems(null);
        return builder.success(booking);
    }

}
