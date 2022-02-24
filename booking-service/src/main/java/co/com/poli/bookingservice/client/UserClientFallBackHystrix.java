package co.com.poli.bookingservice.client;

import co.com.poli.bookingservice.helpers.Response;
import co.com.poli.bookingservice.helpers.ResponseBuilder;
import co.com.poli.bookingservice.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserClientFallBackHystrix implements UserClient {

    private final ResponseBuilder builder;

    @Override
    public Response findById(Long id) {
        User user = new User();
        user.setName("");
        user.setLastName("");
        return builder.success(user);
    }

}
