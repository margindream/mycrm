package com.wax.lp.quartz;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.wax.lp.user.controller.UserController;

public class ThreadScheduler {

	public static void main(String[] args) throws SchedulerException, InterruptedException {
		UserController userController = new UserController();
		// 1、创建调度器工厂SchedulerFactory
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        //使用SchedulerFactory构建出Scheduler调度器
        Scheduler scheduler = schedulerFactory.getScheduler();
        // 2、创建JobDetail实例，并与ThreadJob类绑定(Job执行内容)
        JobDetail jobDetail = JobBuilder.newJob(ThreadJob.class)
                                        .withIdentity("job1", "group1").build();
        // 3、构建Trigger（触发器）实例,每隔1s执行一次
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "triggerGroup1")
                .startNow()//立即生效
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(1)//每隔1s执行一次
                .repeatForever()).build();//一直执行

        //4、执行
        scheduler.scheduleJob(jobDetail, trigger);
        System.out.println("--------scheduler start ! ------------");
        scheduler.start();

        //睡眠
//        TimeUnit.MINUTES.sleep(1);
//        scheduler.shutdown();
//        System.out.println("--------scheduler shutdown ! ------------");
        // 3、构建Trigger实例,每隔1s执行一次
        Date startDate = new Date();
        startDate.setTime(startDate.getTime() + 5000);

        Date endDate = new Date();
        endDate.setTime(startDate.getTime() + 5000);
        
        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "triggerGroup1")
                .usingJobData("trigger1", "这是jobDetail1的trigger")
                .startNow()//立即生效
                .startAt(startDate)
                .endAt(endDate)
                .withSchedule(CronScheduleBuilder.cronSchedule("* 30 10 ? * 1/5 2018"))//每周一到周五上午10:30执行定时任务
                .build();

    }
}

