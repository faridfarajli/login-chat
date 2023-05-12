package az.chatapp.service;

import az.chatapp.dto.UserDto;
import az.chatapp.model.User;


public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
}
