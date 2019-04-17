package com.class23;

public class Test {

	public static void main(String[] args) {
		System.out.println("----------Creating Employee object------");
		Employee emp = new Employee();
		System.out.println(Employee.department);
		Employee.work();
		// emp.work(): not the perfered way
		emp.salary = 90000;
		emp.getPaid();

		System.out.println("-----Creating Scrumteam object-------");
		ScrumTeam st = new ScrumTeam();
		st.salary = 100000;
		ScrumTeam.work();
		st.getPaid();
		st.artifacts = "Product Baclong, Sprint Backlong,Burndown Chart";
		st.ceremonies = "Sprit gromming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint RetroSpective";
		st.attendScrumMeetings();
		st.workOnArtifacts();

		System.out.println("----Front End Creating Developer object----");

		Developer dev = new Developer();
		Developer.work();
		dev.salary = 120000;
		dev.getPaid();
		dev.artifacts = "Product Baclong, Sprint Backlong,Burndown Chart";
		dev.ceremonies = "Sprit gromming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint RetroSpective";
		dev.attendScrumMeetings();
		dev.workOnArtifacts();
		dev.code();

		System.out.println("----Front End Creating Developer object----");
		FrontEnd FrDev = new FrontEnd();
		FrDev.salary = 120000;
		FrDev.getPaid();
		FrDev.artifacts = "Product Baclong, Sprint Backlong,Burndown Chart";
		FrDev.ceremonies = "Sprit gromming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint RetroSpective";
		FrDev.attendScrumMeetings();
		FrDev.workOnArtifacts();
		FrDev.code();
		FrDev.doHtml();

		System.out.println("----Back End Creating Developer object----");
		BackEnd BeDev = new BackEnd();
		BeDev.salary = 120000;
		BeDev.getPaid();
		BeDev.artifacts = "Product Baclong, Sprint Backlong,Burndown Chart";
		BeDev.ceremonies = "Sprit gromming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint RetroSpective";
		BeDev.attendScrumMeetings();
		BeDev.workOnArtifacts();
		BeDev.code();
		BeDev.doSql();

		System.out.println("-----Creating Tester object---");
		Tester Qa = new Tester();
		Qa.salary = 110000;
		Qa.getPaid();
		Qa.artifacts = "Product Baclong, Sprint Backlong,Burndown Chart";
		Qa.ceremonies = "Sprit gromming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint RetroSpective";
		Qa.attendScrumMeetings();
		Qa.workOnArtifacts();
		Qa.test();

		System.out.println("----Creating Business Analyst object----");
		BusinessAnalyst Ba = new BusinessAnalyst();
		Ba.salary = 110000;
		Ba.getPaid();
		Ba.artifacts = "Product Baclong, Sprint Backlong,Burndown Chart";
		Ba.ceremonies = "Sprit gromming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint RetroSpective";
		Ba.attendScrumMeetings();
		Ba.workOnArtifacts();
		Ba.userStories();

		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm = new ScrumMaster();
		sm.salary = 90000;
		sm.getPaid();
		sm.artifacts = "Burn Down Chart";
		sm.ceremonies = "Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.coordinat();

		System.out.println("-----Creating Product Owner----");
		ProductOwner po = new ProductOwner();
		po.salary = 150000;
		po.getPaid();
		po.artifacts = "Sprit backlog, Product Backlog";
		po.ceremonies = "Sprit grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
	}

}
