package co.com.poli.userservice.services;

import co.com.poli.userservice.entity.User;
import co.com.poli.userservice.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class UserServiceTest {
    @Mock
    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    public void begin(){
        MockitoAnnotations.initMocks(this);
        userService = new UserServiceImpl(userRepository, null);

        User user = User.builder()
                .name("Angelica")
                .lastName("Orozco")
                .build();
        Mockito.when(userRepository.findById(4L))
                .thenReturn(Optional.of(user));
    }

    @Test
    public void when_findById_return_user(){
        User user = userService.findById(4L);
        Assertions.assertThat(user.getName()).isEqualTo("Angelica");
    }
}
