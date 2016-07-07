package com.telintel.smsapi;

public class Data
{
    private DestSendMsg[] destSendMsg;

    private String remainingBalance;

    public DestSendMsg[] getDestSendMsg ()
    {
        return destSendMsg;
    }

    public void setDestSendMsg (DestSendMsg[] destSendMsg)
    {
        this.destSendMsg = destSendMsg;
    }

    public String getRemainingBalance ()
    {
        return remainingBalance;
    }

    public void setRemainingBalance (String remainingBalance)
    {
        this.remainingBalance = remainingBalance;
    }

    @Override
    public String toString()
    {
        return "Data [destSendMsg = "+destSendMsg.toString()+", remainingBalance = "+remainingBalance+"]";
    }
}
		