package dataAccess.concretes;

import Entities.concretes.User;
import dataAccess.abstracts.UserDao;

public class UserDatabaseDao implements UserDao {
    @Override
    public void add(User user) {
        System.out.println("User added to database ..."+user.getEmail());
    }

    @Override
    public void delete(User user) {
        System.out.println("User deleted from database ..."+user.getEmail());

    }

    @Override
    public void update(User user) {
        System.out.println("User updated in database ..."+user.getEmail());
    }

    @Override
    public void getUser(User user) {
        System.out.println("User :=> " +user.getEmail()+ " "+user.getFirstName()+ "  " + user.getLastName() );
    }
}
