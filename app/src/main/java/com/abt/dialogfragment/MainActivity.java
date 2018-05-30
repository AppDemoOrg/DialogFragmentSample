package com.abt.dialogfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.abt.dialogfragment.dialog.EditNameDialogFragment;
import com.abt.dialogfragment.dialog.LoginDialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showEditDialog(View view) {
        EditNameDialogFragment editNameDialog = new EditNameDialogFragment();
        editNameDialog.show(getFragmentManager(), DialogConstant.EDIT_NAME_DIALOG_TAG);
    }

    public void showLoginDialog(View view) {
        LoginDialogFragment dialog = new LoginDialogFragment();
        dialog.show(getFragmentManager(), DialogConstant.LOGIN_DIALOG_TAG);
    }
}
