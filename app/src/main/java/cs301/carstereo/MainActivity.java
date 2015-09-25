package cs301.carstereo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.graphics.Color;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends ActionBarActivity {

    boolean toggle = true;
    boolean AM = true;
    double fmStation = 88.1;
    int amStation = 530;

    private Button power;
    //first plus
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private TextView textView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        power = (Button) findViewById(R.id.power);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        textView = (TextView) findViewById(R.id.textView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
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
    //   private void toggleButton() {

    //       power.setOnClickListener(new View.OnClickListener() {
    //@Override
    //           public void onClick(View view) {
    //              if (view == power){
    //                  button.setBackgroundColor(Color.BLACK);
    //              }

    //          startActivity(new Intent(MainActivity.this, MainActivity2Activity.class));
    //          }
    //    });
    //  }
    public void toggleButton(View v) {
        if (toggle == true) {
            button.setBackgroundColor(Color.BLACK);
            button2.setBackgroundColor(Color.BLACK);
            button3.setBackgroundColor(Color.BLACK);
            button4.setBackgroundColor(Color.BLACK);
            textView.setBackgroundColor(Color.BLACK);
            progressBar.setBackgroundColor(Color.BLACK);
            toggle = false;
        } else {
            button.setBackgroundColor(Color.GRAY);
            button2.setBackgroundColor(Color.GRAY);
            button3.setBackgroundColor(Color.GRAY);
            button4.setBackgroundColor(Color.GRAY);
            textView.setBackgroundColor(Color.YELLOW);
            progressBar.setBackgroundColor(Color.RED);
            toggle = true;
        }
    }

    public void AMradio(View v){
        AM = true;
        if(toggle == false){
            //do nothing
        }
        else{
            if(AM == true){
                textView.setText(amStation + " AM");
            }
        }
    }

    public void FMradio(View v){
        AM = false;
        if(toggle == false){
            //do nothing
        }
        else{
            if(AM == false){
                DecimalFormat df = new DecimalFormat("###.#");

                textView.setText(df.format(fmStation) + " FM");
            }
        }
    }

    public void AMRadioTunerPlus(View v){
        if(toggle == true && AM == true && amStation < 1700){
            amStation = amStation + 10;
            textView.setText(amStation + " AM");
        }else if(toggle == true && amStation == 1700){
            amStation = 530;
            textView.setText(amStation + " AM");
        }

        if(toggle == true && AM == false && fmStation < 107.9){
            fmStation = fmStation + .2;
            DecimalFormat df = new DecimalFormat("###.#");
            textView.setText(df.format(fmStation) + " FM");
        }else if(toggle == true && fmStation == 107.9){
            fmStation = 88.1;
            DecimalFormat df = new DecimalFormat("###.#");
            textView.setText(df.format(fmStation) + " FM");
        }

    }

    public void AMRadioTunerMinus(View v){
        if(toggle == true && AM == true && amStation > 530){
            amStation = amStation - 10;
            textView.setText(amStation + " AM");
        }else if(toggle == true && AM == true && amStation == 530){
            amStation = 1700;
            textView.setText(amStation + " AM");
        }

        if(toggle == true && AM == false && fmStation > 88.1){
            fmStation = fmStation - .2;
            DecimalFormat df = new DecimalFormat("###.#");
            textView.setText(df.format(fmStation) + " FM");
        }else if(toggle == true && fmStation == 88.1){
        fmStation = 107.9;
        DecimalFormat df = new DecimalFormat("###.#");
        textView.setText(df.format(fmStation) + " FM");
    }

    }

    public void preset1(View v) {
        if (toggle == true) {
            if (AM == true) {
                amStation = 550;
                textView.setText(amStation + " AM");
            } else {
                fmStation = 90.9;
                DecimalFormat df = new DecimalFormat("###.#");
                textView.setText(df.format(fmStation) + " FM");
            }
        }
    }
    public void preset2(View v) {
        if (toggle == true) {
            if (AM == true) {
                amStation = 600;
                textView.setText(amStation + " AM");
            } else {
                fmStation = 92.9;
                DecimalFormat df = new DecimalFormat("###.#");
                textView.setText(df.format(fmStation) + " FM");
            }
        }
    }
    public void preset3(View v) {
        if (toggle == true) {
            if (AM == true) {
                amStation = 650;
                textView.setText(amStation + " AM");
            } else {
                fmStation = 94.9;
                DecimalFormat df = new DecimalFormat("###.#");
                textView.setText(df.format(fmStation) + " FM");
            }
        }
    }
    public void preset4(View v) {
        if (toggle == true) {
            if (AM == true) {
                amStation = 700;
                textView.setText(amStation + " AM");
            } else {
                fmStation = 96.9;
                DecimalFormat df = new DecimalFormat("###.#");
                textView.setText(df.format(fmStation) + " FM");
            }
        }
    }
    public void preset5(View v) {
        if (toggle == true) {
            if (AM == true) {
                amStation = 750;
                textView.setText(amStation + " AM");
            } else {
                fmStation = 98.9;
                DecimalFormat df = new DecimalFormat("###.#");
                textView.setText(df.format(fmStation) + " FM");
            }
        }
    }
    public void preset6(View v) {
        if (toggle == true) {
            if (AM == true) {
                amStation = 800;
                textView.setText(amStation + " AM");
            } else {
                fmStation = 100.9;
                DecimalFormat df = new DecimalFormat("###.#");
                textView.setText(df.format(fmStation) + " FM");
            }
        }
    }


}

