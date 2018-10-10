package com.circletech.basicdatabindingapp;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.circletech.basicdatabindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mMainBinding;
    User dataUser=new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        mMainBinding.setUser(dataUser);
        setViews("Adrew ","Carnegie");
    }
    private void setViews(String f,String l) {
        dataUser.setFirstName(f);
        dataUser.setLastName(l);
    }

    public void printData(View view) {  // onclick on "Print" button listener
        String f=mMainBinding.edtFirstname.getText().toString();
        String l=mMainBinding.edtLastname.getText().toString();
        setViews(f,l);
        dataUser.setTextPrint("My name is  "+f+" "+l);
    }
}
