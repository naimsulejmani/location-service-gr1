package dev.naimsulejmani.locationservicegr1.infrastructure.data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Repository
public class DataAccessObject<T, ID extends Serializable> implements DbDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public <T> List<T> getResultFromProcedure(String procedureName, Map<String, Object> inParams, Map<String, Object> outParams, Class className) {
        Session session = entityManager.unwrap(Session.class); // krijo nje session te lidhur me databaze
        ProcedureCall procedureCall = session.createStoredProcedureCall(procedureName); // krijo nje procedure call
        //shto parametrat prej inParams
        addParametersToProcedure(procedureCall, inParams, outParams);

        List<T> resultSet = (List<T>) procedureCall.getResultList();
        session.close();

        return resultSet;
    }

    private void addParametersToProcedure(ProcedureCall procedureCall, Map<String, Object> inParams, Map<String, Object> outParams) {
        
    }
}















