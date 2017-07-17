package Hometask_5;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by vov on 11.07.2017.
 */
@Embeddable
public class ContragentId implements Serializable {
    private Integer id;
    private Integer siteid;

    public ContragentId(Integer id, Integer siteid) {
        this.id = id;
        this.siteid = siteid;
    }

    public ContragentId() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteid() {
        return siteid;
    }

    public void setSiteid(Integer siteid) {
        this.siteid = siteid;
    }

}
