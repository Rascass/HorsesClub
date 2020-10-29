package com.java.automation.lab.fall.antonyuk.core22.domain.person;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.Horse;
import com.java.automation.lab.fall.antonyuk.core22.domain.rate.Subscription;

import javax.naming.InvalidNameException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Client extends Person{

    private List<Horse> horses;
    private Subscription subscription;
    final private Date signIn;
    private boolean isBan;

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Client() {
        signIn = new Date();
    }

    public Client(PersonInfo personInfo, List<Horse> horses, Date signIn, boolean isBan, Subscription subscription) {
        super(personInfo);
        this.horses = horses;
        this.signIn = signIn;
        this.isBan = isBan;
        this.subscription = subscription;
    }

    public Client(PersonInfo personInfo) {
        super(personInfo);
        this.signIn = new Date();
    }

    public Client(String firstName, String secondName, String lastName, Date birthday, Gender gender, List<Horse> horses,
                  Date signIn, boolean isBan, Subscription subscription) throws InvalidNameException {
        super(firstName, secondName, lastName, birthday, gender);
        this.horses = horses;
        this.signIn = signIn;
        this.isBan = isBan;
        this.subscription = subscription;
    }

    public void addHorse(Horse horse) {
        horses.add(horse);
    }

    public boolean getBan() {
        return isBan;
    }

    public void setBan(boolean ban) {
        isBan = ban;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void setHorses(List<Horse> horses) {
        this.horses = horses;
    }

    public Date getSignIn() {
        return signIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass() ) {
            return false;
        }
        Client client = (Client) o;
        return isBan == client.isBan &&
                Objects.equals(horses, client.horses) &&
                Objects.equals(subscription, client.subscription) &&
                Objects.equals(signIn, client.signIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horses, signIn, isBan, subscription);
    }

    @Override
    public String toString() {
        return "Client{" +
                "personInfo=" + getPersonInfo() +
                ", horses=" + horses +
                ", signIn=" + signIn +
                ", isBan=" + isBan +
                ", subscription=" + subscription +
                '}';
    }
}

