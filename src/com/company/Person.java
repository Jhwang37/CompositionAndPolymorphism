package com.company;

public class Person extends Education {
        //composition has-a relationship
        private Job job;
        private Education education;
        public Person(){
            this.job=new Job();
            job.setSalary(1000L);
            this.education=new Education();
            education.setSchool("Essrig");
            education.setState("Florida");
            System.out.println(toString());

        }

    @Override
    public String toString() {
        return "Person{" +
                "job=" + job +
                ", education=" + education +
                '}';
    }

    public long getSalary() {
            return job.getSalary();
        }
    }



