package src.Domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USERDETAILS database table.
 * 
 */
@Entity
@Table(name="USERDETAILS")
@NamedQuery(name="Userdetail.findAll", query="SELECT u FROM Userdetail u")
public class Userdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USERDETAILS_USERDETAILDID_GENERATOR", sequenceName="USERDETAIL_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERDETAILS_USERDETAILDID_GENERATOR")
	private long userdetaildid;

	private String constituincy;

	private String email;

	private String firstname;

	private String lastname;

	private String phonenumber;

	private String status;

	private String userloginid;

	//bi-directional many-to-one association to Addre
	@ManyToOne
	@JoinColumn(name="ADDRESID")
	private Addres addre;

	//bi-directional one-to-one association to Userlogin
	@OneToOne
	@JoinColumn(name="USERDETAILDID")
	private Userlogin userlogin;

	public Userdetail() {
	}

	public long getUserdetaildid() {
		return this.userdetaildid;
	}

	public void setUserdetaildid(long userdetaildid) {
		this.userdetaildid = userdetaildid;
	}

	public String getConstituincy() {
		return this.constituincy;
	}

	public void setConstituincy(String constituincy) {
		this.constituincy = constituincy;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserloginid() {
		return this.userloginid;
	}

	public void setUserloginid(String userloginid) {
		this.userloginid = userloginid;
	}

	public Addres getAddre() {
		return this.addre;
	}

	public void setAddre(Addres addre) {
		this.addre = addre;
	}

	public Userlogin getUserlogin() {
		return this.userlogin;
	}

	public void setUserlogin(Userlogin userlogin) {
		this.userlogin = userlogin;
	}

}