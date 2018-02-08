package com.sayagodshala.authui.demo;

import android.content.Context;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sayagodshala.authui.AuthUIFragment;
import com.sayagodshala.authui.AuthUISettings;
import com.sayagodshala.authui.AuthUIView;
import com.sayagodshala.authui.MaterialTheme;


public class LoginActivity extends AppCompatActivity implements AuthUIFragment.AuthUIFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AuthUISettings authUISettings = new AuthUISettings();
        authUISettings.setSocialPlatformRequired(true);
        authUISettings.setAppLogoRequired(true);
        authUISettings.setTermsRequired(true);
        authUISettings.setSignupRequired(true);
        authUISettings.setFacebookLoginRequired(true);
        authUISettings.setGoogleLoginRequired(true);
        authUISettings.setForgotPasswordRequired(true);
        authUISettings.setAppLogo(R.mipmap.my_logo);
        authUISettings.setLoginTitle(getString(R.string.login_title));
        authUISettings.setSignupTitle(getString(R.string.signup_title));
        authUISettings.setForgotPasswordTitle(getString(R.string.forgot_password_title));
        authUISettings.setLoginTerms(getString(R.string.loggin_terms));
        authUISettings.setSignupTerms(getString(R.string.signup_terms));
        authUISettings.setFacebookLoginTitle(getString(R.string.login_with_facebook));
        authUISettings.setFacebookSignupTitle(getString(R.string.signup_with_facebook));
        authUISettings.setGoogleLoginTitle(getString(R.string.login_with_google));
        authUISettings.setGoogleSignupTitle(getString(R.string.signup_with_google));
        authUISettings.setLoginToggleTitle(getString(R.string.have_an_account));
        authUISettings.setSignupToggleTitle(getString(R.string.dont_have_account));
        authUISettings.setDefaultView(AuthUIView.LOGIN);
        authUISettings.setMaterialTheme(MaterialTheme.TEAL);

        AuthUIFragment.loadFragment(this, AuthUIFragment.newInstance(authUISettings), R.id.frame);
    }

    @Override
    public void onLoginClicked(String username, String password) {

    }

    @Override
    public void onSignupClicked(String name, String email, String mobile, String password) {

    }

    @Override
    public void onForgotPasswordClicked(String email) {

    }

    @Override
    public void onFacebookClicked(boolean isRegistration) {

    }

    @Override
    public void onGoogleClicked(boolean isRegistration) {

    }
}
