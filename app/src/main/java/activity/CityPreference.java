package activity;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Adriel on 10/17/2015.
 */
public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity() {
        return prefs.getString("city", "Sydney, AU");
    }

    public void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }
}