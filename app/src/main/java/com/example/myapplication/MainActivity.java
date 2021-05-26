package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private EditText newcontactpopup_imie, newcontactpopup_nazwisko, newcontactpopup_telefon;
    private Button newcontactpopup_anuluj, newcontactpopup_zapisz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id==R.id.menu1){
            Toast.makeText(getApplicationContext(), "Witaj!", Toast.LENGTH_LONG) .show();

        }
        if (id==R.id.menu2){
            //Toast.makeText(getApplicationContext(), "Witaj!", Toast.LENGTH_LONG) .show();
            createNewContactDialog();
        }
        if (id==R.id.menu3){
            Toast.makeText(getApplicationContext(), "Witaj!", Toast.LENGTH_LONG) .show();
        }
        if (id==R.id.submenu1){
            Toast.makeText(getApplicationContext(), "Witaj!", Toast.LENGTH_LONG) .show();
        }
        if (id==R.id.submenu2){
            Toast.makeText(getApplicationContext(), "Witaj!", Toast.LENGTH_LONG) .show();
        }
    return super.onOptionsItemSelected(item);
}

public void createNewContactDialog(){
      dialogBuilder = new AlertDialog.Builder(this);
      final View contactPopupView = getLayoutInflater().inflate(R.layout.popup, null);
      newcontactpopup_imie = (EditText) contactPopupView.findViewById(R.id.newcontactpopup_Imie);
      newcontactpopup_nazwisko = (EditText) contactPopupView.findViewById(R.id.newcontactpopup_Nazwisko);
      newcontactpopup_telefon= (EditText) contactPopupView.findViewById(R.id.newcontactpopup_Telefon);

      newcontactpopup_zapisz = (Button) contactPopupView.findViewById(R.id.saveButton);
      newcontactpopup_anuluj = (Button) contactPopupView.findViewById(R.id.cancelButton);

      dialogBuilder.setView(contactPopupView);
      dialog = dialogBuilder.create();
      dialog.show();

      newcontactpopup_zapisz.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              //definicja save button
          }
      });

      newcontactpopup_anuluj.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              //definicja cancel button
              dialog.dismiss();
          }
      });
}

}