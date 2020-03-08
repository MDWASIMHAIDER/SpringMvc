package com.nt.test;




import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchAppTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Job job=null;
		JobLauncher launcher=null;
		JobExecution execution=null;
		ctx=new ClassPathXmlApplicationContext("com/nt/confg/simple-job.xml");
		
		try {
			launcher=ctx.getBean("launcher",JobLauncher.class);
			job=ctx.getBean("job1",Job.class);
			execution= launcher.run(job,new JobParameters());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		((AbstractApplicationContext) ctx).close();
	}

}
