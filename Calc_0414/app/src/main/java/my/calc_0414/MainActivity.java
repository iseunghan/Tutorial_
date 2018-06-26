package my.calc_0414;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btn1,btn2,btn3,btn4;
    TextView tv1;
    String x,y;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("간단한 계산기");

        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        btn1 =(Button)findViewById(R.id.btn1);
        btn2 =(Button)findViewById(R.id.btn2);
        btn3 =(Button)findViewById(R.id.btn3);
        btn4 =(Button)findViewById(R.id.btn4);
        tv1 = (TextView)findViewById(R.id.tv1);

        btn1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                x = et1.getText().toString();
                y = et2.getText().toString();
                result = Integer.parseInt(x) + Integer.parseInt(y);
                tv1.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        btn2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                x = et1.getText().toString();
                y = et2.getText().toString();
                result = Integer.parseInt(x) - Integer.parseInt(y);
                tv1.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        btn3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                x = et1.getText().toString();
                y = et2.getText().toString();
                result = Integer.parseInt(x) * Integer.parseInt(y);
                tv1.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        btn4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                x = et1.getText().toString();
                y = et2.getText().toString();
                result = Integer.parseInt(x) / Integer.parseInt(y);
                tv1.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
    }
}
