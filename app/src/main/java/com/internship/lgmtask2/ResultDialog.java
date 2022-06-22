package com.internship.lgmtask2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class ResultDialog extends DialogFragment {
    Button btnOk;
    TextView txtResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_layout,container,false);

        btnOk = view.findViewById(R.id.result_ok_button);
        txtResult = view.findViewById(R.id.result_text_view);

        String resultText = "";
        Bundle bundle = getArguments();
        resultText = bundle.getString(FaceDetection.RESULT_TEXT);
        txtResult.setText(resultText);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return view;
    }
}
