package dev.naimsulejmani.locationservicegr1.infrastructure.data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class DataAccessObject implements DbDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public <T> List<T> getResultFromProcedure(String procedureName, Map<String, Object> inParams, Map<String, Object> outParams, Class<T> className) {
        Session session = entityManager.unwrap(Session.class); // krijo nje session te lidhur me databaze
        ProcedureCall procedureCall = session.createStoredProcedureCall(procedureName); // krijo nje procedure call
        //shto parametrat prej inParams
        addParametersToProcedure(procedureCall, inParams, outParams);

        List<T> resultSet = (List<T>) procedureCall.getResultList();
        session.close();

        return resultSet;
    }

    @Override
    public <T> List<T> getResultFromQuery(String query, Map<String, Object> inParams, Class<T> className) {
        Session session = entityManager.unwrap(Session.class);
        TypedQuery<T> nativeQuery = session.createNativeQuery(query, className);

        for (var key : inParams.keySet()) {
            var object = inParams.get(key);
            nativeQuery.setParameter(key, object);
        }

        var resultSet = nativeQuery.getResultList();
        session.close();
        return resultSet;
    }

    private void addParametersToProcedure(ProcedureCall procedureCall, Map<String, Object> inParams, Map<String, Object> outParams) {

    }
}















