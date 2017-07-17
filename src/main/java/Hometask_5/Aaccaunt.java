package Hometask_5;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "TMP_ACCOUNT")
@Access(AccessType.PROPERTY)

public class Aaccaunt {
    private Integer id;
    private Contragent contragent;
    private Date timeChange;
    private String accountno;
    private Date dateopen;
    private BigDecimal summa;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_sequence")
    @SequenceGenerator(name = "account_sequence",
            sequenceName = "sequence_account",
            initialValue = 1,
            allocationSize = 1)
    @Column(name = "ACCOUNTID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumns(
            {@JoinColumn(name = "CONTRAGENTID", referencedColumnName = "ID"),
                    @JoinColumn(name = "SITEID", referencedColumnName = "SITEID")
            }
    )
    public Contragent getContragent() {
        return contragent;
    }

    public void setContragent(Contragent contragent) {
        this.contragent = contragent;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SYNCTIMESTAMP", nullable = false)
    public Date getTimeChange() {
        return timeChange;
    }

    public void setTimeChange(Date timeChange) {
        this.timeChange = timeChange;
    }

    @Column(nullable = false)
    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    @Column(name = "DATE_OPEN")
    public Date getDateopen() {
        return dateopen;
    }

    public void setDateopen(Date dateopen) {
        this.dateopen = dateopen;
    }

    @Column(name = "SUMMANOW", nullable = false)
    public BigDecimal getSumma() {
        return summa;
    }

    public void setSumma(BigDecimal summa) {
        this.summa = summa;
    }

    public  Aaccaunt() {

    }

    public  Aaccaunt(Contragent contragent, Date timeChange, String accountno, Date dateopen, BigDecimal summa) {
        this.contragent = contragent;
        this.timeChange = timeChange;
        this.accountno = accountno;
        this.dateopen = dateopen;
        this.summa = summa;
    }
}
