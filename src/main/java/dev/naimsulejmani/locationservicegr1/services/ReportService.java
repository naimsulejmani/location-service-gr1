package dev.naimsulejmani.locationservicegr1.services;

import dev.naimsulejmani.locationservicegr1.entities.reports.RoleGenderSummaryReport;

import java.util.List;

public interface ReportService {
    public List<RoleGenderSummaryReport> getRoleGenderSummaryReport(Integer roleId);
}
