package com.domain.pickupassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerLesson;
    private TextView textViewLessonDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerLesson = findViewById(R.id.spinnerLesson);
        textViewLessonDescription = findViewById(R.id.textViewLessonDescription);

    }

    public void showDescription(View view) {
        int position = spinnerLesson.getSelectedItemPosition(); //Получаем номер выбранной позиции из спиннера
        String description = getDescriptionByPosition(position);
        textViewLessonDescription.setText(description); // присваиваем нашему вью элементу описание
    }

    private String getDescriptionByPosition(int position) {
        String[] descriptions = getResources().getStringArray(R.array.description_lesson); //получаем массив строк со всеми описаниями
        return descriptions[position]; //возвращаем элемент массива совпадающего с выбранного элемента в спинере
    }
}