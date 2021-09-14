package dataAccess.abstracts;

import Entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
    void getUser(User user);



}
