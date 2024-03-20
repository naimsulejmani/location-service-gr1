package dev.naimsulejmani.locationservicegr1.services.impls;

import dev.naimsulejmani.locationservicegr1.entities.reports.RoleGenderSummaryReport;
import dev.naimsulejmani.locationservicegr1.infrastructure.data.DbDao;
import dev.naimsulejmani.locationservicegr1.services.ReportService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ReportServiceImpl implements ReportService {

    private final DbDao dbDao;

    public ReportServiceImpl(DbDao dbDao) {
        this.dbDao = dbDao;
    }

    @Override
    public List<RoleGenderSummaryReport> getRoleGenderSummaryReport(Integer roleId) {
        String query = """
                SELECT  r.id AS roleId,
                        r.name as roleName,
                        u.gender,
                        COUNT(*) AS totalUsers
                FROM roles AS r INNER JOIN users AS u ON u.role_id=r.id
                WHERE COALESCE(:roleId, r.id) = r.id
                GROUP BY r.id, r.name, u.gender
                """;
        Map<String, Object> inParams = new HashMap<>();
        inParams.put("roleId", roleId);
        return dbDao.getResultFromQuery(query, inParams, RoleGenderSummaryReport.class);
    }
}











