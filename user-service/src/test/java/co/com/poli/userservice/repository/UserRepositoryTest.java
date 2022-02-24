package co.com.poli.userservice.repository;

import co.com.poli.userservice.entity.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void FindByLastName() {
        User user = User.builder()
                .name("Angelica")
                .lastName("Orozco")
                .build();

        userRepository.save(user);
        List<User> users = userRepository.findUserByLastName(user.getLastName());

        Assertions.assertThat(users.size()).isEqualTo(2);
    }
}
