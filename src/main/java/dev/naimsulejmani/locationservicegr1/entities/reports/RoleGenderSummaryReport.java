package dev.naimsulejmani.locationservicegr1.entities.reports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleGenderSummaryReport {
    private Integer roleId;
    private String roleName;
    private char gender;
    private long totalUsers;
}
