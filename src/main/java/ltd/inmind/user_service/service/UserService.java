package ltd.inmind.user_service.service;


import ltd.inmind.user_service.constants.LoginConst.SignUpStatusEnum;
import ltd.inmind.user_service.model.User;

public interface UserService {

    SignUpStatusEnum signUp(User user);

    User getUserByUsername(String username);

}
