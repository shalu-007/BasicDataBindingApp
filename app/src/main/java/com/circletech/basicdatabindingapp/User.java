package com.circletech.basicdatabindingapp;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User  extends BaseObservable{

    String FirstName;
    String LastName;
    String textPrint;

    @Bindable
    public String getTextPrint() {
        return textPrint;
    }

    public void setTextPrint(String pTextPrint) {
        textPrint = pTextPrint;
        notifyPropertyChanged(com.circletech.basicdatabindingapp.BR.textPrint);
    }

    @Bindable
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String pFirstName) {
        FirstName = pFirstName;
        notifyPropertyChanged(com.circletech.basicdatabindingapp.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String pLAstName) {
        LastName = pLAstName;
    notifyPropertyChanged(com.circletech.basicdatabindingapp.BR.lastName);
    }
}
