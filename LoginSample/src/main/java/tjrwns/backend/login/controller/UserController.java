package tjrwns.backend.login.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tjrwns.backend.login.model.request.SignUp;
import tjrwns.backend.login.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public void signUp(@RequestBody SignUp signUp) {
        userService.signUp(signUp);
    }

}
