package com.example.emiliedoyle.da01_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Context;
import android.widget.CheckBox;
public class FindPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_page);
        final Context context = this;
        Button search_results_button = (Button) findViewById(R.id.SearchResultsButton);
        search_results_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search_results_screen = new Intent(context,SearchResultsPage.class);
                startActivity(search_results_screen);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean EE_flag;
    public boolean ME_flag;
    public boolean BE_flag;
    public boolean CE_flag;
    public boolean CM_flag;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.EE_box:
                if (checked)
                    EE_flag = true;
                else
                    EE_flag = false;
                break;
            case R.id.ME_box:
                if (checked)
                    ME_flag = true;
                else
                    ME_flag = false;
                break;
            case R.id.CE_box:
                if (checked)
                    CE_flag = true;
                else
                    CE_flag = false;
                break;
            case R.id.BE_box:
                if (checked)
                    BE_flag = true;
                else
                    BE_flag = false;
                break;
            case R.id.CM_box:
                if (checked)
                    CM_flag = true;
                else
                    CM_flag = false;
                break;
        }
    }
}
