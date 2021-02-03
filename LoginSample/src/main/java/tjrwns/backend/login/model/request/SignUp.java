package tjrwns.backend.login.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUp {
    private String pw;

    private String name;

    private String email;
}