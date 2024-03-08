package dev.naimsulejmani.locationservicegr1.mappers;

import dev.naimsulejmani.locationservicegr1.dtos.UserDto;
import dev.naimsulejmani.locationservicegr1.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper extends Convertable<User, UserDto> {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
}
