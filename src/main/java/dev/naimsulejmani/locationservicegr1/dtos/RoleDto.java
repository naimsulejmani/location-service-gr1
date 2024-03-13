package dev.naimsulejmani.locationservicegr1.dtos;

import dev.naimsulejmani.locationservicegr1.infrastructure.helpers.HasId;
import lombok.Data;

@Data
public class RoleDto implements HasId<Integer> {
    private Integer id;
    private String name;
    private String description;
}
