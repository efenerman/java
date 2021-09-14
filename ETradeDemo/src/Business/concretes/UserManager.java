package Business.concretes;

import Business.abstracts.UserService;
import Core.abstracts.EmailValidator;
import Entities.concretes.User;
import dataAccess.abstracts.UserDao;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager implements UserService {
    private EmailValidator emailValidator;
    private UserDao userDao;
    private ArrayList<String> maillist;

    public UserManager(EmailValidator emailValidator, UserDao userDao, ArrayList<String> maillist) {
        this.emailValidator = emailValidator;
        this.userDao = userDao;
        this.maillist = maillist;
    }


    @Override
    public void register(User user) throws Exception {
    if (alreadyInSystem(user,maillist)) {
        throw new Exception("This mail already register please login");
    }else{
        if (emailValidator.validate(user)&&user.getPassword().length()>=6&&user.getFirstName().length()>=2&&user.getLastName().length()>=2){
            System.out.println("Verification mail sent");
            Scanner validationmail=new Scanner(System.in);
            String mailRespond= validationmail.nextLine();
            if (mailRespond=="Validate"){
                maillist.add(user.getEmail());
                userDao.add(user);
            }else{
                throw new Exception("Verification unsuccessful");
            }
        }
    }
}


    @Override
    public void login(User user) throws Exception {
if (alreadyInSystem(user,maillist)){
    userDao.getUser(user);
    System.out.println("Welcome to system " + user.getFirstName());
}else{
    throw new Exception("We cannot find this user in system Please register first! ");
}
    }

    @Override
    public void deleteAcc(User user) {
try {
    maillist.remove(user.getEmail());

}catch (Exception e){
    System.out.println("This user cannot found");
    return;
}
userDao.delete(user);
    }

    @Override
    public boolean alreadyInSystem(User user, ArrayList<String> mails) {
       if (mails.isEmpty()){
           return false;
       }
       else{
           for (String email:mails){
               if (email.equals(user.getEmail())){
                   return true;
               }

           }
       }
        return false;
    }
}
