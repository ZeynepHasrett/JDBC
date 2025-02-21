package manage;

public class QueryManage {

    private String cronSchedulesQuery = "SELECT name FROM cron_schedules LIMIT 2;";







    // ************ GETTERS **************

    public String getCronSchedulesQuery() {
        return cronSchedulesQuery;
    }

}
