package com.chapter1;

import com.chapter1.exeption.PerformanceException;

public class Contact implements Performer{
    private PhoneNumber phoneNumber;
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println(phoneNumber);
    }
}
