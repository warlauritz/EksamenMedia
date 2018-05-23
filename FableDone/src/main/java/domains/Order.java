package domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="domainId")
    private int domainId;
    @Column(name="domainName")
    private String domainName;
    @Column(name="status")
    private String status;
    @Column(name="expires")
    private String expires;
    @Column(name="renewAuto")
    private String renewAuto;
    @Column(name="createdAt")
    private String createdAt;
    @Column(name="domainProvider")
    private String domainProvider;


    public Order() {
        super();
    }

    public Order(int domainId, String domainName, String status, String expires, String autoRenew, String createdAt, String domainProvider) {
        this.domainId = domainId;
        this.domainName = domainName;
        this.status = status;
        this.expires = expires;
        this.renewAuto = autoRenew;
        this.createdAt = createdAt;
        this.domainProvider = domainProvider;
    }

    public int getDomainId() {
        return domainId;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getStatus() {
        return status;
    }

    public String getExpires() {
        return expires;
    }

    public String getRenewAuto() {
        return renewAuto;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setExpires(String expires) {
        this.expires = expires;
    }

    public void setRenewAuto(String renewAuto) {
        this.renewAuto = renewAuto;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDomainProvider() {
        return domainProvider;
    }

    public void setDomainProvider(String domainProvider) {
        this.domainProvider = domainProvider;
    }

    @Override
    public String toString() {
        return "Order{" +
                "domainId=" + domainId +
                ", domainName='" + domainName + '\'' +
                ", status='" + status + '\'' +
                ", expires='" + expires + '\'' +
                ", renewAuto='" + renewAuto + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", domainProvider='" + domainProvider + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if(domainId == ((Order)(o)).getDomainId() && domainName.equals(((Order)(o)).getDomainName()) && status.equals(((Order)(o)).getStatus()) && expires.equals(((Order)(o)).getExpires()) && renewAuto.equals(((Order)(o)).getRenewAuto()) && createdAt.equals(((Order)(o)).getCreatedAt()) && domainProvider.equals(((Order)(o)).getDomainProvider()))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + domainName.hashCode();
        result = 31 * result + domainId;
        result = 31 * result + domainProvider.hashCode();
        return result;
    }


}