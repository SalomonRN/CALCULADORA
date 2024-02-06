package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number_1;
    EditText number_2;
    TextView result;
    Button btn_suma;
    Button btn_resta;
    Button btn_multi;
    Button btn_divi;
    Button btn_expo;
    Button btn_fibo;
    Button btn_facto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_1 = findViewById(R.id.numero1);
        number_2 = findViewById(R.id.numero2);

        btn_suma = findViewById(R.id.btn_suma);
        btn_resta = findViewById(R.id.btn_resta);
        btn_multi = findViewById(R.id.btn_multi);
        btn_divi = findViewById(R.id.btn_divi);
        btn_expo = findViewById(R.id.btn_expo);
        btn_fibo = findViewById(R.id.btn_fibo);
        btn_facto = findViewById(R.id.btn_factorial);
        result = findViewById(R.id.resultado);

        //
        btn_suma.setOnClickListener(w -> {
            int rs = Suma(Integer.parseInt(number_1.getText().toString()), Integer.parseInt(number_2.getText().toString()));
            result.setText((String.valueOf(rs)));
        });
        btn_resta.setOnClickListener(w -> {
            int rs = Resta(Integer.parseInt(number_1.getText().toString()), Integer.parseInt(number_2.getText().toString()));
            result.setText((String.valueOf(rs)));
        });
        btn_multi.setOnClickListener(w -> {
            int rs = Multi(Integer.parseInt(number_1.getText().toString()), Integer.parseInt(number_2.getText().toString()));
            result.setText((String.valueOf(rs)));
        });
        btn_divi.setOnClickListener(w -> Divi(Integer.parseInt(number_1.getText().toString()), Integer.parseInt(number_2.getText().toString())));

        btn_expo.setOnClickListener(w -> {
            int rs = Expo(Integer.parseInt(number_1.getText().toString()), Integer.parseInt(number_2.getText().toString()));
            result.setText((String.valueOf(rs)));
        });
        btn_fibo.setOnClickListener(w -> {
            Fibonacci(Integer.parseInt(number_1.getText().toString()), 0,1);
        });
        btn_facto.setOnClickListener(w -> {
            int rs = Factorial(Integer.parseInt(number_1.getText().toString()));
            result.setText((String.valueOf(rs)));
        });
    }

    private int Suma(int a, int b) {
        return a + b;
    }

    private int Resta(int a, int b) {
        return a - b;
    }

    private int Multi(int a, int b) {
        return a * b;
    }

    private void Divi(double a, double b) {
        if (b == 0) {
            result.setText("No se puede dividir entre 0.");
            return;
        }
        double rs = a / b;
        result.setText((String.valueOf(rs)));
    }

    private int Expo(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * Expo(base, exponente - 1);
        }
    }

    private void Fibonacci(int cantidadDeVeces, int anterior, int actual) {
        int res = anterior + actual;
        if (cantidadDeVeces == 1) {
            result.setText((String.valueOf(actual)));
            return;
        }
        Fibonacci(cantidadDeVeces - 1, actual, res);

    }


    static private int Factorial(int num) {
        int res = 1;
        for (int i = num; i > 0; i--) {
            res *= i;
        }
        return res;
    }
}