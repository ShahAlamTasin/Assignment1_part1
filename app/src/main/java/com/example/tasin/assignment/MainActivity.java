package com.example.tasin.assignment;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout background;
    Button textButton;
    Button ColourButton;
    TextView txtview;
  EditText edittextview;
  ImageView image;
 CheckBox checkbox;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        background = (RelativeLayout) findViewById(R.id.background);
        textButton =  (Button) findViewById(R.id.textbutton);
        ColourButton =  (Button) findViewById(R.id.colourbutton);
                txtview =  (TextView) findViewById(R.id.textviewhello);
    edittextview = (EditText) findViewById(R.id.edittext);
   checkbox =(CheckBox) findViewById(R.id.box);
    image=(ImageView) findViewById(R.id.picture) ;
textButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        String  str = edittextview.getText().toString().trim();
        openDialog();
        txtview.setText(str);
  edittextview.setText(" ");


    }
});
ColourButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        openDialog();
        background.setBackgroundColor(Color.parseColor("#006699"));
    }
});
 checkbox.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         openDialog();
          if(checkbox.isChecked()){
              background.setBackgroundColor(Color.parseColor("#03DAC5"));
          }
          else
              background.setBackgroundColor(Color.parseColor("#006699"));
     }
 });

    }

public  void openDialog(){

ExampleDialouge exampleDialouge =  new ExampleDialouge();
exampleDialouge.show(getSupportFragmentManager(),"Example Dialog");

}

}
