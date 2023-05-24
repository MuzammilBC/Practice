package com.rakuten.ems.date_time;

public class Department {
	 int did;
     String dname;
     String designation;

    public Department(int did, String dname, String designation) {
        this.did = did;
        this.dname = dname;
        this.designation = designation;
    }

    public int getDid() {
        return did;
    }

    public String getDname() {
        return dname;
    }

    public String getDesignation() {
        return designation;
    }
}

