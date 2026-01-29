package owner.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "shopowners")

public class ShopOwner {


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer shopOwnerId;  

	    private String ownerName;
	    private String shopName;
	    private String email;
	    private String phone;

	    public ShopOwner() {
	        super();
	    }

	    public ShopOwner(Integer shopOwnerId, String ownerName, String shopName, String email, String phone) {
	        super();
	        this.shopOwnerId = shopOwnerId;
	        this.ownerName = ownerName;
	        this.shopName = shopName;
	        this.email = email;
	        this.phone = phone;
	    }

	    public Integer getShopOwnerId() {
	        return shopOwnerId;
	    }

	    public void setShopOwnerId(Integer shopOwnerId) {
	        this.shopOwnerId = shopOwnerId;
	    }

	    public String getOwnerName() {
	        return ownerName;
	    }

	    public void setOwnerName(String ownerName) {
	        this.ownerName = ownerName;
	    }

	    public String getShopName() {
	        return shopName;
	    }

	    public void setShopName(String shopName) {
	        this.shopName = shopName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }
	}
	
	

