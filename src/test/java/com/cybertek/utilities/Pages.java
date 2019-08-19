package com.cybertek.utilities;

import com.cybertek.pages.ActivityPage;
import com.cybertek.pages.login_navigation.LoginPage;


public class Pages {
    private LoginPage loginPage;
    private ActivityPage activityPage;

    public ActivityPage activityPage() {
        if (activityPage == null) {
            activityPage = new ActivityPage();
        }
        return activityPage;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }


}
