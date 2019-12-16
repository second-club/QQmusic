package cn.bdqn.domain;

public class Singger {
    private Integer sId;

    private String sName;

    private String sPhotourl;

    private String sRegion;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPhotourl() {
        return sPhotourl;
    }

    public void setsPhotourl(String sPhotourl) {
        this.sPhotourl = sPhotourl == null ? null : sPhotourl.trim();
    }

    public String getsRegion() {
        return sRegion;
    }

    public void setsRegion(String sRegion) {
        this.sRegion = sRegion == null ? null : sRegion.trim();
    }
}