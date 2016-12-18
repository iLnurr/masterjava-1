package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;

/**
 * gkislin
 * 28.11.2016
 */
public class MailWSClientMain {
    public static void main(String[] args) {
        ImmutableSet<Addressee> addressees = ImmutableSet.of(
                new Addressee("gkislin@javaops.ru"),
                new Addressee("Мастер Java <masterjava@javaops.ru>"),
                new Addressee("Bad Email <bad_email.ru>"));

        MailWSClient.sendIndividualMails(addressees, "Subject", "Body");
    }
}