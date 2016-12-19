package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;
import lombok.extern.slf4j.Slf4j;

/**
 * gkislin
 * 28.11.2016
 */
@Slf4j
public class MailWSClientMain {
    public static void main(String[] args) {
        ImmutableSet<Addressee> addressees = ImmutableSet.of(
                new Addressee("gkislin@javaops.ru"),
                new Addressee("Мастер Java <masterjava@javaops.ru>"),
                new Addressee("Bad Email <bad_email.ru>"));

        try {
            MailWSClient.sendIndividualMails(addressees, "Subject", "Body");
        } catch (Exception e) {
            log.error(e.toString(), e);
        }
    }
}