package dev.naimsulejmani.locationservicegr1.infrastructure.data;

import java.util.List;
import java.util.Map;

public interface DbDao {
    <T> List<T> getResultFromProcedure(
            String procedureName,
            Map<String, Object> inParams,
            Map<String, Object> outParams,
            Class className);
}
