package com.example.b;

import java.io.Serializable;

public class SampleData implements Serializable {
    private static final long serialVersionUID = 1000000L;

    private int mIntData = 0;
    private String mStrData = "Superdroid";

    public int getIntData() {
        return mIntData;
    }

    public String getStringData() {
        return mStrData;
    }

    public void setIntData(int intData) {
        mIntData = intData;
    }

    public void setStringData(String strData) {
        mStrData = strData;
    }
}
