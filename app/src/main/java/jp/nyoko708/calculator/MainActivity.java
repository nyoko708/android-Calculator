package jp.nyoko708.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void numberOnClick(View view) {
        int num = 0;
        switch(view.getId()) {
            case R.id.one:
                num = 1;
                break;
            case R.id.two:
                num = 2;
                break;
            case R.id.three:
                num = 3;
                break;
            case R.id.four:
                num = 4;
                break;
            case R.id.five:
                num = 5;
                break;
            case R.id.six:
                num = 6;
                break;
            case R.id.seven:
                num = 7;
                break;
            case R.id.eight:
                num = 8;
                break;
            case R.id.nine:
                num = 9;
                break;
            case R.id.zero:
                num = 0;
                break;
            default:
                num = 0;
        }

        String strNum = String.valueOf(num);
        Toast.makeText(getApplicationContext(), strNum, Toast.LENGTH_SHORT).show();
    }
}
