package Core.concretes;

import Core.abstracts.EmailValidator;
import Entities.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator implements EmailValidator {
    @Override
    public boolean validate(User user) throws Exception {
        String mail= user.getEmail();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        if (matcher.matches()){
            return true;
        }else{
            return false;

        }
    }
}
