package my.and20161543application;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText editText;
    Button btn1,btn2;
    RadioGroup rgroup;
    RadioButton rbtn1,rbtn2;
    ImageView imageView1,imageView2;
    String x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("좀 그럴듯한 앱");

        editText = (EditText)findViewById(R.id.edittext);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        rgroup = (RadioGroup)findViewById(R.id.rgroup);
        rbtn1 = (RadioButton)findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton)findViewById(R.id.rbtn2);
        imageView1 = (ImageView)findViewById(R.id.imageview1);
        //imageView2 = (ImageView)findViewById(R.id.imageview2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = editText.getText().toString();
                Toast.makeText(getApplicationContext(),x,Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = editText.getText().toString();
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(x));
                startActivity(mIntent);
            }
        });
        rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rbtn1:
                        imageView1.setVisibility(View.VISIBLE);
                        imageView2.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.rbtn2:
                        imageView1.setVisibility(View.INVISIBLE);
                        imageView2.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

    }
}
