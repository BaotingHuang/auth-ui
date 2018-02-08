package com.sayagodshala.authui;

import android.os.Parcel;
import android.os.Parcelable;

public class AuthUISettings implements Parcelable {

    private boolean socialPlatformRequired = true;
    private boolean appLogoRequired = true;
    private boolean termsRequired = true;
    private boolean signupRequired = true;
    private boolean facebookLoginRequired = true;
    private boolean googleLoginRequired = true;
    private AuthView defaultView = AuthView.LOGIN;
    private int appLogo;
    private int bg;
    private String loginTitle;
    private String signupTitle;
    private String nameHint;
    private String emailHint;
    private String mobileHint;
    private String passwordHint;
    private String loginTerms;
    private String signupTerms;
    private String facebookLoginTitle;
    private String facebookSignupTitle;
    private String googleLoginTitle;
    private String googleSignupTitle;
    private String loginToggleTitle;
    private String signupToggleTitle;


    public AuthUISettings() {
    }

    public boolean isSocialPlatformRequired() {
        return socialPlatformRequired;
    }

    public void setSocialPlatformRequired(boolean socialPlatformRequired) {
        this.socialPlatformRequired = socialPlatformRequired;
    }

    public boolean isAppLogoRequired() {
        return appLogoRequired;
    }

    public void setAppLogoRequired(boolean appLogoRequired) {
        this.appLogoRequired = appLogoRequired;
    }

    public boolean isTermsRequired() {
        return termsRequired;
    }

    public void setTermsRequired(boolean termsRequired) {
        this.termsRequired = termsRequired;
    }

    public boolean isSignupRequired() {
        return signupRequired;
    }

    public void setSignupRequired(boolean signupRequired) {
        this.signupRequired = signupRequired;
    }

    public boolean isFacebookLoginRequired() {
        return facebookLoginRequired;
    }

    public void setFacebookLoginRequired(boolean facebookLoginRequired) {
        this.facebookLoginRequired = facebookLoginRequired;
    }

    public boolean isGoogleLoginRequired() {
        return googleLoginRequired;
    }

    public void setGoogleLoginRequired(boolean googleLoginRequired) {
        this.googleLoginRequired = googleLoginRequired;
    }

    public AuthView getDefaultView() {
        return defaultView;
    }

    public void setDefaultView(AuthView defaultView) {
        this.defaultView = defaultView;
    }

    public int getAppLogo() {
        return appLogo;
    }

    public void setAppLogo(int appLogo) {
        this.appLogo = appLogo;
    }

    public int getBg() {
        return bg;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }

    public String getLoginTitle() {
        return loginTitle;
    }

    public void setLoginTitle(String loginTitle) {
        this.loginTitle = loginTitle;
    }

    public String getSignupTitle() {
        return signupTitle;
    }

    public void setSignupTitle(String signupTitle) {
        this.signupTitle = signupTitle;
    }

    public String getNameHint() {
        return nameHint;
    }

    public void setNameHint(String nameHint) {
        this.nameHint = nameHint;
    }

    public String getEmailHint() {
        return emailHint;
    }

    public void setEmailHint(String emailHint) {
        this.emailHint = emailHint;
    }

    public String getMobileHint() {
        return mobileHint;
    }

    public void setMobileHint(String mobileHint) {
        this.mobileHint = mobileHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }


    public String getLoginTerms() {
        return loginTerms;
    }

    public void setLoginTerms(String loginTerms) {
        this.loginTerms = loginTerms;
    }

    public String getSignupTerms() {
        return signupTerms;
    }

    public void setSignupTerms(String signupTerms) {
        this.signupTerms = signupTerms;
    }

    public String getFacebookLoginTitle() {
        return facebookLoginTitle;
    }

    public void setFacebookLoginTitle(String facebookLoginTitle) {
        this.facebookLoginTitle = facebookLoginTitle;
    }

    public String getFacebookSignupTitle() {
        return facebookSignupTitle;
    }

    public void setFacebookSignupTitle(String facebookSignupTitle) {
        this.facebookSignupTitle = facebookSignupTitle;
    }

    public String getGoogleLoginTitle() {
        return googleLoginTitle;
    }

    public void setGoogleLoginTitle(String googleLoginTitle) {
        this.googleLoginTitle = googleLoginTitle;
    }

    public String getGoogleSignupTitle() {
        return googleSignupTitle;
    }

    public void setGoogleSignupTitle(String googleSignupTitle) {
        this.googleSignupTitle = googleSignupTitle;
    }

    public String getLoginToggleTitle() {
        return loginToggleTitle;
    }

    public void setLoginToggleTitle(String loginToggleTitle) {
        this.loginToggleTitle = loginToggleTitle;
    }

    public String getSignupToggleTitle() {
        return signupToggleTitle;
    }

    public void setSignupToggleTitle(String signupToggleTitle) {
        this.signupToggleTitle = signupToggleTitle;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.socialPlatformRequired ? (byte) 1 : (byte) 0);
        dest.writeByte(this.appLogoRequired ? (byte) 1 : (byte) 0);
        dest.writeByte(this.termsRequired ? (byte) 1 : (byte) 0);
        dest.writeByte(this.signupRequired ? (byte) 1 : (byte) 0);
        dest.writeByte(this.facebookLoginRequired ? (byte) 1 : (byte) 0);
        dest.writeByte(this.googleLoginRequired ? (byte) 1 : (byte) 0);
        dest.writeInt(this.defaultView == null ? -1 : this.defaultView.ordinal());
        dest.writeInt(this.appLogo);
        dest.writeInt(this.bg);
        dest.writeString(this.loginTitle);
        dest.writeString(this.signupTitle);
        dest.writeString(this.nameHint);
        dest.writeString(this.emailHint);
        dest.writeString(this.mobileHint);
        dest.writeString(this.passwordHint);
        dest.writeString(this.loginTerms);
        dest.writeString(this.signupTerms);
        dest.writeString(this.facebookLoginTitle);
        dest.writeString(this.facebookSignupTitle);
        dest.writeString(this.googleLoginTitle);
        dest.writeString(this.googleSignupTitle);
        dest.writeString(this.loginToggleTitle);
        dest.writeString(this.signupToggleTitle);
    }

    protected AuthUISettings(Parcel in) {
        this.socialPlatformRequired = in.readByte() != 0;
        this.appLogoRequired = in.readByte() != 0;
        this.termsRequired = in.readByte() != 0;
        this.signupRequired = in.readByte() != 0;
        this.facebookLoginRequired = in.readByte() != 0;
        this.googleLoginRequired = in.readByte() != 0;
        int tmpDefaultView = in.readInt();
        this.defaultView = tmpDefaultView == -1 ? null : AuthView.values()[tmpDefaultView];
        this.appLogo = in.readInt();
        this.bg = in.readInt();
        this.loginTitle = in.readString();
        this.signupTitle = in.readString();
        this.nameHint = in.readString();
        this.emailHint = in.readString();
        this.mobileHint = in.readString();
        this.passwordHint = in.readString();
        this.loginTerms = in.readString();
        this.signupTerms = in.readString();
        this.facebookLoginTitle = in.readString();
        this.facebookSignupTitle = in.readString();
        this.googleLoginTitle = in.readString();
        this.googleSignupTitle = in.readString();
        this.loginToggleTitle = in.readString();
        this.signupToggleTitle = in.readString();
    }

    public static final Creator<AuthUISettings> CREATOR = new Creator<AuthUISettings>() {
        @Override
        public AuthUISettings createFromParcel(Parcel source) {
            return new AuthUISettings(source);
        }

        @Override
        public AuthUISettings[] newArray(int size) {
            return new AuthUISettings[size];
        }
    };
}