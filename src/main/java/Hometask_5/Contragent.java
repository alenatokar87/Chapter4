package Hometask_5;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TMP_CONTRAGENT")
@Access(AccessType.PROPERTY)
public class Contragent {
    private ContragentId contragentPK;
    private String name;
    private String identycode;
    private List<Address> addressList;
    private Category category;
    private ContragentType contragentType;
    private List<Aaccaunt> accountList;
    private List<ContragentGroup> groupList;

    public Contragent() {
    }

    @EmbeddedId
    public ContragentId getContragentPK() {
        return contragentPK;
    }

    public void setContragentPK(ContragentId contragentPK) {
        this.contragentPK = contragentPK;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentycode() {
        return identycode;
    }

    public void setIdentycode(String identycode) {
        this.identycode = identycode;
    }

    /*@OneToMany(targetEntity = Address.class, mappedBy = "contragent")*/
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "TMP_CR_ADRESS",
            joinColumns = {
                    @JoinColumn(name = "CONTRAGENTID", referencedColumnName = "ID"),
                    @JoinColumn(name = "SITEID", referencedColumnName = "SITEID")},
            inverseJoinColumns = @JoinColumn(name = "ADDRESSID"))
    public List<Address> getAddressList() {
        return addressList;
    }


    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @OneToOne
    @JoinColumn(name = "CATEGORYID")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @OneToOne
    @JoinColumn(name = "CONTRAGENTTYPEID")
    public ContragentType getContragentType() {
        return contragentType;
    }

    public void setContragentType(ContragentType contragentType) {
        this.contragentType = contragentType;
    }

    @OneToMany(targetEntity = Aaccaunt.class, mappedBy = "contragent")
    public List<Aaccaunt> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Aaccaunt> accountList) {
        this.accountList = accountList;
    }

    @ManyToMany(mappedBy = "contragentList")
    public List<ContragentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<ContragentGroup> groupList) {
        this.groupList = groupList;
    }

    public Contragent(ContragentId contragentPK, String name, String identycode, Category category, ContragentType contragentType) {
        this.contragentPK = contragentPK;
        this.name = name;
        this.identycode = identycode;
        this.category = category;
        this.contragentType = contragentType;
    }

}
