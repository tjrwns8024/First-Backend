package tjrwns.backend.login.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tjrwns.backend.login.model.entity.User;
import tjrwns.backend.login.model.request.SignUp;
import tjrwns.backend.login.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void signUp(SignUp signUp) {
        userRepository.save(
                User.builder()
                        .email(signUp.getEmail())
                        .pw(signUp.getPw())
                        .name(signUp.getName())
                        .build());
    }
}
