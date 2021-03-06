// Generated by view binder compiler. Do not edit!
package com.xsens.dot.android.example.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.xsens.dot.android.example.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemData1Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView AccLabel1;

  @NonNull
  public final TextView AngularVelocityLabel1;

  @NonNull
  public final TextView QueternionLabel1;

  @NonNull
  public final TextView accData1;

  @NonNull
  public final TextView gyrData1;

  @NonNull
  public final TextView quatData1;

  @NonNull
  public final TextView sensorName1;

  @NonNull
  public final TextView sensorNameLabel1;

  private ItemData1Binding(@NonNull ConstraintLayout rootView, @NonNull TextView AccLabel1,
      @NonNull TextView AngularVelocityLabel1, @NonNull TextView QueternionLabel1,
      @NonNull TextView accData1, @NonNull TextView gyrData1, @NonNull TextView quatData1,
      @NonNull TextView sensorName1, @NonNull TextView sensorNameLabel1) {
    this.rootView = rootView;
    this.AccLabel1 = AccLabel1;
    this.AngularVelocityLabel1 = AngularVelocityLabel1;
    this.QueternionLabel1 = QueternionLabel1;
    this.accData1 = accData1;
    this.gyrData1 = gyrData1;
    this.quatData1 = quatData1;
    this.sensorName1 = sensorName1;
    this.sensorNameLabel1 = sensorNameLabel1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemData1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemData1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_data_1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemData1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Acc_label_1;
      TextView AccLabel1 = rootView.findViewById(id);
      if (AccLabel1 == null) {
        break missingId;
      }

      id = R.id.AngularVelocity_label_1;
      TextView AngularVelocityLabel1 = rootView.findViewById(id);
      if (AngularVelocityLabel1 == null) {
        break missingId;
      }

      id = R.id.Queternion_label_1;
      TextView QueternionLabel1 = rootView.findViewById(id);
      if (QueternionLabel1 == null) {
        break missingId;
      }

      id = R.id.acc_data_1;
      TextView accData1 = rootView.findViewById(id);
      if (accData1 == null) {
        break missingId;
      }

      id = R.id.gyr_Data_1;
      TextView gyrData1 = rootView.findViewById(id);
      if (gyrData1 == null) {
        break missingId;
      }

      id = R.id.quat_data_1;
      TextView quatData1 = rootView.findViewById(id);
      if (quatData1 == null) {
        break missingId;
      }

      id = R.id.sensor_name_1;
      TextView sensorName1 = rootView.findViewById(id);
      if (sensorName1 == null) {
        break missingId;
      }

      id = R.id.sensor_name_label_1;
      TextView sensorNameLabel1 = rootView.findViewById(id);
      if (sensorNameLabel1 == null) {
        break missingId;
      }

      return new ItemData1Binding((ConstraintLayout) rootView, AccLabel1, AngularVelocityLabel1,
          QueternionLabel1, accData1, gyrData1, quatData1, sensorName1, sensorNameLabel1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
