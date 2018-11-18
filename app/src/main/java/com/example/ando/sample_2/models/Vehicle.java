package com.example.ando.sample_2.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Vehicle  implements Parcelable {
    private String mModel;
    private String mNumber;

    public Vehicle() {}

    public Vehicle(String mModel, String mNumber) {
        this.mModel = mModel;
        this.mNumber = mNumber;
    }

    protected Vehicle(Parcel in) {
        mModel = in.readString();
        mNumber = in.readString();
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mModel);
        dest.writeString(mNumber);
    }
}
