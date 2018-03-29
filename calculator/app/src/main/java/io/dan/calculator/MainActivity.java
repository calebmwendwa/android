package io.dan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button ADD, SUB;
private EditText num1, num2;
private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        ADD=(Button) findViewById(R.id.button);
        SUB=(Button) findViewById(R.id.button2);
        num1=(EditText) findViewById(R.id.editText);
        num2=(EditText) findViewById(R.id.editText2);
        result=(TextView) findViewById(R.id.result);
        ADD.setOnClickListener(this);
        SUB.setOnClickListener(this);

    }
    public void onClick(View view){
        String number1=num1.getText().toString();
        String number2=num1.getText().toString();
        switch (view.getId()){
            case R.id.button:
                double addition=Double.parseDouble(number1)+Double.parseDouble(number2);
                        result.setText(String.valueOf(addition));
                break;
            case R.id.button2:
                double subtract=Double.parseDouble(number1)-Double.parseDouble(number2);
                        result.setText(String.valueOf(subtract));
                break;
        }
    }
}
