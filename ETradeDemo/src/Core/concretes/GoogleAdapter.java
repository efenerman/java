package Core.concretes;

import Business.abstracts.UserService;
import Core.abstracts.VerificationService;
import Entities.concretes.User;
import GoogleService.GoogleAuth;

public class GoogleAdapter implements VerificationService {
    private UserService userService;

    public GoogleAdapter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void verify(User user) {
        GoogleAuth googleAuth=new GoogleAuth();
        googleAuth.AuthWithGoogle(user);
    }
}
