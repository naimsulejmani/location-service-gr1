package dev.naimsulejmani.locationservicegr1.controllers;


import dev.naimsulejmani.locationservicegr1.entities.reports.RoleGenderSummaryReport;
import dev.naimsulejmani.locationservicegr1.services.ReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/report")
public class ReportController {
    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/role-gender-summary") // ?roleId=1
    public ResponseEntity<List<RoleGenderSummaryReport>> getRoleGenderSummaryReport(@RequestParam Integer roleId) {
        var report = reportService.getRoleGenderSummaryReport(roleId);
        return ResponseEntity.ok(report);
    }
}


















