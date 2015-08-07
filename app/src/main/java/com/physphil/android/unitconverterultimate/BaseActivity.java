package com.physphil.android.unitconverterultimate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Base Activity class for application
 * Created by Phizz on 15-08-03.
 */
public class BaseActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // Set theme, must be called before onCreate()
        if(Preferences.getInstance(this).isLightTheme())
        {
            setTheme(R.style.AppThemeLight);
        }

        super.onCreate(savedInstanceState);
    }

    /**
     * Set backward navigation in toolbar
     * @param upAsHome if back button should close activity
     */
    public void setToolbarHomeNavigation(boolean upAsHome)
    {
        if(getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(upAsHome);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case android.R.id.home:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}