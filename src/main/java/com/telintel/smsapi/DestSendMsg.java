package com.telintel.smsapi;

public class DestSendMsg
{
    private String messagePrice;

    private String mobileNumber;

    public String getMessagePrice ()
    {
        return messagePrice;
    }

    public void setMessagePrice (String messagePrice)
    {
        this.messagePrice = messagePrice;
    }

    public String getMobileNumber ()
    {
        return mobileNumber;
    }

    public void setMobileNumber (String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString()
    {
        return "DestSendMsg [messagePrice = "+messagePrice+", mobileNumber = "+mobileNumber+"]";
    }
}