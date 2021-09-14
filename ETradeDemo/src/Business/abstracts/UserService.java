package Business.abstracts;

import Entities.concretes.User;

import java.util.ArrayList;

public interface UserService {
    void register(User user) throws Exception;
    void login(User user) throws Exception;
    void deleteAcc(User user);
    boolean alreadyInSystem(User user, ArrayList<String> mails);

}
