import Business.abstracts.UserService;
import Business.concretes.UserManager;
import Core.abstracts.EmailValidator;
import Core.concretes.GoogleAdapter;
import Core.concretes.RegexValidator;
import Entities.concretes.User;
import dataAccess.concretes.UserDatabaseDao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        User user=new User(5,"Efe","Nerman","efenerman@hotmail.com","123456788");
        ArrayList<String> emailList=new ArrayList<String>();

        UserService userService=new UserManager(new RegexValidator(),new UserDatabaseDao(),emailList);
        userService.register(user);
        //userService.alreadyInSystem(user,emailList);
       // userService.login(user);
        userService.deleteAcc(user);
        RegexValidator regexValidator=new RegexValidator();
        regexValidator.validate(user);
//        GoogleAdapter googleAdapter=new GoogleAdapter(userService);
//        googleAdapter.verify(user);
    }
}
