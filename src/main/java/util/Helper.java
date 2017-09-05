package util;

import sites.CWJobs_bak;
import sites.Totaljobs_bak;

/* *
 * Created by Sampath on 17/02/2017.
 */
public class Helper {

    public static String getSpecialism(String title){
        String specialism = "QA Engineer";

        if(title.contains("Test Analyst")){
            specialism = "Test Analyst";
        }

        if(title.contains("QA Analyst")){
            specialism = "QA Analyst";
        }

        if(title.contains("Big Data")){
            specialism = "Big Data Tester";
        }

        if(title.contains("Graduate")){
            specialism = "Graduate Test Analyst";
        }

        if(title.contains("Junior QA")||title.contains("Junior Test")){
            specialism = "Junior QA Engineer";
        }

        if(title.contains("Lead QA")||title.contains("Lead Test")||title.contains("QA Lead")){
            specialism = "Lead QA Engineer";
        }

        if(title.contains("Manual Tester")||title.contains("Manual QA")){
            specialism = "Manual Tester";
        }

        if(title.contains("Mobile Automation")){
            specialism = "Mobile Automation Tester";
        }

        if(title.contains("Performance")){
            specialism = "Performance Tester";
        }

        if(title.contains("QA Manager")||title.contains("Test Manager")){
            specialism = "QA Manager";
        }

        if(title.contains("Developer in")||title.contains("SDET")){
            specialism = "Software Developer in Test (SDET)";
        }

        if(title.contains("Senior Automation Test Engineer")||title.contains("Senior Test Automation Engineer")||title.contains("Senior QA Automated Tester")){
            specialism = "Senior Automation Test Engineer";
        }

        if(title.contains("QA Automation Engineer")||title.contains("Automation Tester")||title.contains("Automation QA")){
            specialism = "QA Automation Engineer";
        }

        if(title.contains("Automation Test Engineer")||title.contains("Automation Software Tester")){
            specialism = "Automation Test Engineer";
        }

        if(title.contains("Automation Tester")||title.contains("Automation Software Tester")){
            specialism = "Automation Tester";
        }

        if(title.contains("Automation Lead")){
            specialism = "Automation Lead";
        }

        if(title.contains("Quality Assurance Officer")){
            specialism = "Quality Assurance Officer";
        }

        if(title.contains("Quality Assurance (QA) Manager")){
            specialism = "Quality Assurance (QA) Manager";
        }

        if(title.contains("Software Test Engineer")){
            specialism = "Software Test Engineer";
        }

        if(title.contains("Test Lead")){
            specialism = "Test Lead";
        }

        if(title.contains("Mobile Tester ")){
            specialism = "Mobile Tester ";
        }

        if(title.contains("Software Tester")){
            specialism = "Software Tester";
        }

        if(title.contains("Senior Quality Test Engineer")){
            specialism = "Senior Quality Test Engineer";
        }

        if(title.contains("Software Test Engineer")){
            specialism = "Software Test Engineer";
        }

        if(title.contains("QA Specialist")){
            specialism = "QA Specialist";
        }

        if(title.contains("Senior QA Tester")){
            specialism = "Senior QA Tester";
        }

        if((title.contains("Test")||title.contains("QA"))&&title.contains("Manager")){
            specialism = "QA Manager";
        }

        if(title.contains("Senior QA Analyst")){
            specialism = "Senior QA Analyst";
        }

        if(title.contains("QA Test Engineer")){
            specialism = "QA Test Engineer";
        }

        return specialism;
    }

    public static boolean isValidQAJob(String jobTitle){
        boolean status = false;
        String[] keywords = new String[] {"QA", "test", "automation", "tester", "quality", "testing", "SDET", "Q A"};

        for (String s : keywords)
        {
            if (jobTitle.toLowerCase().contains(s.toLowerCase()))
            {
                status = true;
            }
        }

        return status;
    }


    public static String getSalaryBrand(String salary, String jobType){
        String salaryBrand = "Unspecified";

        if(salary.toLowerCase().contains("unspecified")) {
            salaryBrand = "Unspecified";
        }


        else {
            if(jobType.equals("Contract")){

            }


        }

        return salaryBrand;
    }

    public static void getIntSalary(String salary){

        String sal = salary.toLowerCase().replaceAll("[a-z]","");
        sal = sal.substring(sal.indexOf("£"));

        if(sal.contains("+")){
            sal = sal.substring(0,sal.indexOf("+"));
        }

        sal = sal.replaceAll("-","").replaceAll(",","").replaceAll(" ","");

        if((sal.length()-sal.replaceAll("£","").length())>1){
            sal = sal.substring(0,sal.lastIndexOf("£"));
        }

        System.out.printf("My New String is: " + sal);
        //int myInt = Integer.valueOf(salary.replaceAll("[^0-9]", ""));

        //return myInt;
    }

    public static Boolean isExistingJob(String url){
        return true;
    }

    public static String getJobDescription(String jobDetailsLink) throws Exception{

        String jobLongDescription = "";
        if(jobDetailsLink.contains("cwjobs.co.uk"))
            jobLongDescription =  CWJobs_bak.getJobDescription(jobDetailsLink);

        if(jobDetailsLink.contains("totaljobs.com"))
            jobLongDescription =  Totaljobs_bak.getJobDescription(jobDetailsLink);

        return jobLongDescription;
    }
}
