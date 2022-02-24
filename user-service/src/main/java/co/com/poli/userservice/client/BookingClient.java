package co.com.poli.userservice.client;

import co.com.poli.userservice.helpers.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "booking-service", fallback = BookingClientFallBackHystrix.class)
public interface BookingClient {
    @GetMapping("/bookings/bookingsUserId/{userId}")
    Response findAllUserIds(@PathVariable("userId") Long userId );
}
