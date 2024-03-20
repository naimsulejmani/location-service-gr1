package dev.naimsulejmani.locationservicegr1.cronjobs;

import dev.naimsulejmani.locationservicegr1.infrastructure.data.DbDao;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CleanUpScheduler {
    private final DbDao dbDao;

    public CleanUpScheduler(DbDao dbDao) {
        this.dbDao = dbDao;
    }

    @Scheduled(cron = "0 51 18 * * WED")
    public void sayHelloEvery5Seconds() {

        dbDao.getResultFromProcedure("sp_test",null,null, Object.class);
        System.out.println("Hello");
    }
}
