package com.example.ando.sample_2.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Employee implements Parcelable {

    private String mName;
    private String mId;

    public Employee() {
    }

    protected Employee(Parcel in) {
        mName = in.readString();
        mId = in.readString();
    }

    public static final Creator<Employee> CREATOR = new Creator<Employee>() {
        @Override
        public Employee createFromParcel(Parcel in) {
            return new Employee(in);
        }

        @Override
        public Employee[] newArray(int size) {
            return new Employee[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeString(mId);
    }
}
