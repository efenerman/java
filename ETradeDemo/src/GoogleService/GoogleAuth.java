package GoogleService;

import Entities.concretes.User;

public class GoogleAuth {
    public void AuthWithGoogle(User user){
        System.out.println("Google verification completed "+ user.getEmail());
    }
}
