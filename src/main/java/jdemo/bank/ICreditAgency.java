package jdemo.bank;

import java.io.*;

public interface ICreditAgency
{
    boolean report(Account account)
        throws IOException;
}