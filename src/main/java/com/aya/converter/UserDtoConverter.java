package com.aya.converter;
import com.aya.dto.UserDTO;
import com.aya.service.UserService;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
@ConfigurationPropertiesBinding
public class UserDtoConverter implements Converter<String, UserDTO>{

    UserService userService;

    public UserDtoConverter(@Lazy UserService userService) {
        this.userService = userService;
    }

    @Override
        public UserDTO convert(String username) {
            return userService.findByUserName(username);
        }

}
