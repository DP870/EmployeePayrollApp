package com.Payroll;

import com.EmployeeDetails.*;


public class DownloadToken {
    private long createdTime;
    private long expiryMillis;

    /**
     * Initializes the token with a 1-minute expiration timer.
     */
    public DownloadToken() {
        this.createdTime = System.currentTimeMillis();
        this.expiryMillis = 60 * 1000;
    }

    /**
     * Checks if the download token is still valid.
     * 
     */
    public boolean Expired() {
        long now = System.currentTimeMillis();
        return (now - createdTime) > expiryMillis;
    }
}