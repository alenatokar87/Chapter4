package Hometask_5;

import javax.persistence.*;

/**
 * Created by vov on 16.06.2017.
 */
@Entity
@Table(name = "CONTRAGENT_TYPE")
public class ContragentType {
    @Id
    @GeneratedValue
    @Column(name = "CID")
    private String id;
    private String name;
    private int officialtype = 0;

    public ContragentType(String id,String name, int officialtype) {
        this.id=id;
        this.name = name;
        this.officialtype = officialtype;
    }

    public ContragentType() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOfficialtype() {
        return officialtype;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOfficialtype(int officialtype) {
        this.officialtype = officialtype;
    }
}
