package com.example.petshop;

import android.os.Bundle;
import java.util.ArrayList;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        //model objects
        Pet pet = new Cat("Lucy");
        Pet dog = new Dog("Snoopy");
        Pet scorpion = new Scorpion("Scorponok");

        ArrayList<Pettable> pettablePets = new ArrayList<>();
        pettablePets.add(new Cat("Lucy"));
        pettablePets.add(new Dog("Snoopy"));
        //pettablePets.add(new Scorpion("Scorponok")); //produces an error, not pettable

        //polymorphic collection
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(pet);
        petList.add(dog);
        petList.add(scorpion);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}