package cn.bdqn.domain;

public class Music {
    private Integer mId;

    private String mName;

    private String mPhotourl;

    private String mMusicurl;

    private String mTexturl;

    private Integer mSingerid;

    private Integer mAid;

    private Integer mVip;

    private Integer mStatus;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmPhotourl() {
        return mPhotourl;
    }

    public void setmPhotourl(String mPhotourl) {
        this.mPhotourl = mPhotourl == null ? null : mPhotourl.trim();
    }

    public String getmMusicurl() {
        return mMusicurl;
    }

    public void setmMusicurl(String mMusicurl) {
        this.mMusicurl = mMusicurl == null ? null : mMusicurl.trim();
    }

    public String getmTexturl() {
        return mTexturl;
    }

    public void setmTexturl(String mTexturl) {
        this.mTexturl = mTexturl == null ? null : mTexturl.trim();
    }

    public Integer getmSingerid() {
        return mSingerid;
    }

    public void setmSingerid(Integer mSingerid) {
        this.mSingerid = mSingerid;
    }

    public Integer getmAid() {
        return mAid;
    }

    public void setmAid(Integer mAid) {
        this.mAid = mAid;
    }

    public Integer getmVip() {
        return mVip;
    }

    public void setmVip(Integer mVip) {
        this.mVip = mVip;
    }

    public Integer getmStatus() {
        return mStatus;
    }

    public void setmStatus(Integer mStatus) {
        this.mStatus = mStatus;
    }
}