package com.borovyksv.SpringAngularJS.mvc.quarts;

/**
 * Created by user-pc on 09.01.2017.
 */
        import java.util.Calendar;

/**
 * look application-context.xml
 * 1. cronTrigger
 * 2. quartzCronJob
 * 3. bean id="cronQuartzTask"
 * 4. Quartz Scheduler
 */
public class CronQuartzTask {

    public void cronTaskMethod() {
        //you can send emails to users here
        System.out.println("Cron Time: " + Calendar.getInstance().getTime());
    }
}
