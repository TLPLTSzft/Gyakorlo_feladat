package com.example.gyakorlo_feladat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

  private EditText editTextInput;
  private Button buttonSubmitUpperCase;
  private Button buttonSubmitLowerCase;
  private Button buttonSubmitRandomColor;
  private TextView textViewResult;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init();
    upperCase();
    lowerCase();
    randomColor();
  }

  private void randomColor() {
    buttonSubmitRandomColor.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        textViewResult.setBackgroundColor(Color.rgb(red, green, blue));
      }
    });
  }

  private void lowerCase() {
    buttonSubmitLowerCase.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String lowerCase = editTextInput.getText().toString().toLowerCase();
        textViewResult.setText(lowerCase);
      }
    });
  }

  private void upperCase() {
    buttonSubmitUpperCase.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String upperCase = editTextInput.getText().toString().toUpperCase();
        textViewResult.setText(upperCase);
      }
    });
  }

  public void init() {
    editTextInput = findViewById(R.id.editTextInput);
    buttonSubmitUpperCase = findViewById(R.id.buttonSubmitUpperCase);
    buttonSubmitLowerCase = findViewById(R.id.buttonSubmitLowerCase);
    buttonSubmitRandomColor = findViewById(R.id.buttonSubmitRandomColor);
    textViewResult = findViewById(R.id.textViewResult);
  }
}