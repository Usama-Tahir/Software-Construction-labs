import javax.persistence.*;

/**
 * Created by Usama Tahir on 4/11/2017.
 */
@Entity
@Table(name = "location")
public class persistantClass {


    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "country")
    private String country;
    @Column(name = "region")
    private String region;

    @Column(name = "city")
    private String city;

    @Column(name = "postalcode")
    private String postalCode;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "metrocode")
    private String metroCode;

    @Column(name = "areacode")
    private String areaCode;
    public persistantClass(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMetroCode() {
        return metroCode;
    }

    public void setMetroCode(String metroCode) {
        this.metroCode = metroCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    public persistantClass(int id, String country, String region, String city, String postalCode, String latitude, String longitude, String metroCode, String areaCode)
    {
        this.id = id;
        this.country=country;
        this.region=region;
        this.city=city;
        this.postalCode=postalCode;
        this.latitude=latitude;
        this.longitude=longitude;
        this.metroCode=metroCode;
        this.areaCode=areaCode;
    }








}
