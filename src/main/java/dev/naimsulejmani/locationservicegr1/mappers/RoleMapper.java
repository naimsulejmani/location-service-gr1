package dev.naimsulejmani.locationservicegr1.mappers;

import dev.naimsulejmani.locationservicegr1.dtos.RoleDto;
import dev.naimsulejmani.locationservicegr1.entities.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface RoleMapper extends Convertable<Role, RoleDto> {
    RoleMapper MAPPER = Mappers.getMapper(RoleMapper.class);


}
