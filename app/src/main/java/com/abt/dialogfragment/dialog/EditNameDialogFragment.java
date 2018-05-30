package com.abt.dialogfragment.dialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.abt.dialogfragment.R;

/**
 * @描述： @EditNameDialogFragment
 * @作者： @黄卫旗
 * @创建时间： @2018/5/30
 */
public class EditNameDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.fragment_edit_name, container);
        return view;
    }

}
