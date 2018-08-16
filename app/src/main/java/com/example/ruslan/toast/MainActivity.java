package com.example.ruslan.toast;

import android.animation.TimeAnimator;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.date_time_layout);

        TextView dateDefault = (TextView)findViewById(R.id.dateDefault);
        TextView timeDefault = (TextView)findViewById(R.id.timeDefault);

        DatePicker dp = (DatePicker)this.findViewById(R.id.datePicker);
        // Месяц начиная с нуля. Для отображения добавляем 1.
        dateDefault.setText("Дата по умолчанию " + dp.getDayOfMonth() + "/" +
                (dp.getMonth() + 1) + "/" + dp.getYear());

        dp.init(2015, 02, 01, null);
        TimePicker tp = (TimePicker)this.findViewById(R.id.timePicker);
        java.util.Formatter timeF = new java.util.Formatter();
        timeF.format("Время по умолчанию %d:%02d", tp.getCurrentHour(),
                tp.getCurrentMinute());
        timeDefault.setText(timeF.toString());
        tp.setIs24HourView(true);
        tp.setCurrentHour(new Integer(10));
        tp.setCurrentMinute(new Integer(10));


//        setContentView(R.layout.radiobutton_layout);
//        setContentView(R.layout.toggle_layout);
//        setContentView(R.layout.checkbox_layout);
//        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
//        Toast toast = Toast.makeText(this, "Zhumabek Ruslan", Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.TOP, 0,160);
//        toast.show();


        Snackbar.make(view, "Zhumabek Ruslan", Snackbar.LENGTH_LONG).show();

    }

    public void onCheckboxClicked(View view) {
//        CheckBox language = (CheckBox) view;
//        boolean checked = language.isChecked();
//
//        TextView selection = (TextView) findViewById(R.id.selection);
////        switch (view.getId()) {
////            case R.id.java:
////                if (checked) {
////                    selection.setText("Java");
////                } break;
////            case R.id.javascript:
////                if (checked)
////                    selection.setText("JavaScript");
////                break;
////        }
//
//        if (language.isChecked())
//            selection.setText(language.getText());

        CheckBox java = (CheckBox) findViewById(R.id.java);
        CheckBox javascript = (CheckBox) findViewById(R.id.javascript);
        TextView selection = (TextView) findViewById(R.id.selection);

        String selectedItems = "";

        if(java.isChecked())
            selectedItems +=java.getText();
        if(javascript.isChecked())
            selectedItems +=javascript.getText();


        selection.setText(selectedItems);
    }

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            Toast.makeText(this, "Свет включен!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Свет выключен!", Toast.LENGTH_LONG).show();
        }
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView selection = (TextView) findViewById(R.id.selection);

        switch (view.getId()) {
            case R.id.java:
                if (checked)
                    selection.setText("Выбран Java");
                break;
            case R.id.javascript:
                if (checked)
                    selection.setText("Выбран JavaScript");
                break;
        }
    }
}