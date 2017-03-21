package com.example.parkar;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


/**
 * Created by karim chamaa on 10/11/2016.
 */
public class DateSettings implements DatePickerDialog.OnDateSetListener {
    Context context;
    public static int year;
    public static int month;
    public static int day;
    public DateSettings(Context context){
        this.context=context;

    }


    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        year=i;
        month=i1;
        day=i2;


    }






}
