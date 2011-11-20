package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Handshake extends Model
{
    public enum Status {
        WAITING_APPROVAL, ACCEPTED, REJECTED, UNKNOWN
    }

    @Required
    @ManyToOne
    public Offer offer;

    @Required
    @ManyToOne
    public Request request;

    @Required
    @Temporal(TemporalType.TIMESTAMP)
    public Date creationDate;

    @Required
    @Temporal(TemporalType.TIMESTAMP)
    public Date actualStartDate;

    @Required
    @Temporal(TemporalType.TIMESTAMP)
    public Date actualEndDate;

    // FIXME: do we need credit here?
    //@Required
    //public Credit credit;

    @Required
    @Enumerated(EnumType.STRING)
    public Status status;
}