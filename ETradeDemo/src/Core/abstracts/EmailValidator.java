package Core.abstracts;

import Entities.concretes.User;

public interface EmailValidator {
    boolean validate(User user) throws Exception;
}
