package com.EmployeeDetails;
/*
 * This class is about Session and handles the session related methods.
 */
public class Session {
    
    private String username;
    private String role;
    private long loginTime;
    private long timeoutMillis;

    public Session(String username, String role) {
        this.username = username;
        this.role = role;
        this.loginTime = System.currentTimeMillis();
        this.timeoutMillis = 5 * 60 * 1000; // 5 minutes timeout
    }


    public boolean isExpired() {
        return (System.currentTimeMillis() - loginTime) > timeoutMillis;
    }

 
    public String getUsername() {
        return username;
    }


    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Session active for user: " + username + " (" + role + ")";
    }
}