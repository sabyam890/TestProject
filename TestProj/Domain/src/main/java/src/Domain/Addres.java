package src.Domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ADDRES database table.
 * 
 */
@Entity
@Table(name="ADDRES")
@NamedQuery(name="Addre.findAll", query="SELECT a FROM Addre a")
public class Addres implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ADDRES_ADDRESID_GENERATOR", sequenceName="ADDRESID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADDRES_ADDRESID_GENERATOR")
	private long addresid;

	private String addrline1;

	private String addrline2;

	private String city;

	@Column(name="\"STATE\"")
	private String state;

	private BigDecimal zip;

	//bi-directional many-to-one association to Userdetail
	@OneToMany(mappedBy="addre")
	private List<Userdetail> userdetails;

	public Addres() {
	}

	public long getAddresid() {
		return this.addresid;
	}

	public void setAddresid(long addresid) {
		this.addresid = addresid;
	}

	public String getAddrline1() {
		return this.addrline1;
	}

	public void setAddrline1(String addrline1) {
		this.addrline1 = addrline1;
	}

	public String getAddrline2() {
		return this.addrline2;
	}

	public void setAddrline2(String addrline2) {
		this.addrline2 = addrline2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getZip() {
		return this.zip;
	}

	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}

	public List<Userdetail> getUserdetails() {
		return this.userdetails;
	}

	public void setUserdetails(List<Userdetail> userdetails) {
		this.userdetails = userdetails;
	}

	public Userdetail addUserdetail(Userdetail userdetail) {
		getUserdetails().add(userdetail);
		userdetail.setAddre(this);

		return userdetail;
	}

	public Userdetail removeUserdetail(Userdetail userdetail) {
		getUserdetails().remove(userdetail);
		userdetail.setAddre(null);

		return userdetail;
	}

}