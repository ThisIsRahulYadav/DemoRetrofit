
package dumyprojects.com.demoretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("MUID")
    @Expose
    private Integer mUID;
    @SerializedName("MU_NAME")
    @Expose
    private String mUNAME;
    @SerializedName("MU_EmailID")
    @Expose
    private String mUEmailID;
    @SerializedName("MU_MobileNO")
    @Expose
    private String mUMobileNO;
    @SerializedName("MU_PersonalEmail")
    @Expose
    private String mUPersonalEmail;
    @SerializedName("MU_profileimage")
    @Expose
    private String mUProfileimage;
    @SerializedName("MU_userType")
    @Expose
    private Integer mUUserType;
    @SerializedName("MU_ISActive")
    @Expose
    private Boolean mUISActive;
    @SerializedName("MU_ISDeleted")
    @Expose
    private Boolean mUISDeleted;
    @SerializedName("MU_PartyCode")
    @Expose
    private String mUPartyCode;
    @SerializedName("MU_UserRole")
    @Expose
    private String mUUserRole;

    public Integer getMUID() {
        return mUID;
    }

    public void setMUID(Integer mUID) {
        this.mUID = mUID;
    }

    public String getMUNAME() {
        return mUNAME;
    }

    public void setMUNAME(String mUNAME) {
        this.mUNAME = mUNAME;
    }

    public String getMUEmailID() {
        return mUEmailID;
    }

    public void setMUEmailID(String mUEmailID) {
        this.mUEmailID = mUEmailID;
    }

    public String getMUMobileNO() {
        return mUMobileNO;
    }

    public void setMUMobileNO(String mUMobileNO) {
        this.mUMobileNO = mUMobileNO;
    }

    public String getMUPersonalEmail() {
        return mUPersonalEmail;
    }

    public void setMUPersonalEmail(String mUPersonalEmail) {
        this.mUPersonalEmail = mUPersonalEmail;
    }

    public String getMUProfileimage() {
        return mUProfileimage;
    }

    public void setMUProfileimage(String mUProfileimage) {
        this.mUProfileimage = mUProfileimage;
    }

    public Integer getMUUserType() {
        return mUUserType;
    }

    public void setMUUserType(Integer mUUserType) {
        this.mUUserType = mUUserType;
    }

    public Boolean getMUISActive() {
        return mUISActive;
    }

    public void setMUISActive(Boolean mUISActive) {
        this.mUISActive = mUISActive;
    }

    public Boolean getMUISDeleted() {
        return mUISDeleted;
    }

    public void setMUISDeleted(Boolean mUISDeleted) {
        this.mUISDeleted = mUISDeleted;
    }

    public String getMUPartyCode() {
        return mUPartyCode;
    }

    public void setMUPartyCode(String mUPartyCode) {
        this.mUPartyCode = mUPartyCode;
    }

    public String getMUUserRole() {
        return mUUserRole;
    }

    public void setMUUserRole(String mUUserRole) {
        this.mUUserRole = mUUserRole;
    }

}
