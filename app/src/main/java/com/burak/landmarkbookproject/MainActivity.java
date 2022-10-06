package com.burak.landmarkbookproject;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.burak.landmarkbookproject.databinding.ActivityMainBinding;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landmark> landmarkArrayList;
    private ActivityMainBinding binding;
    static  Landmark chosenLandmark;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        landmarkArrayList=new ArrayList<>();

        String newyorkexp = "The most populous city of the country." +
                " It is one of the financial, commerce, media, art and technology centers of both the country and the world." +
                " The heart of the city is the Manhattan region. It is also known as the city that does not sleep." +
                " It is also located in New York in the area of financial institutions known as Wall Street.";

        String sanfranciscoexp="San Francisco; It is a colorful city with houses overlooking the bay," +
                " the Golden Gate bridge and the Pacific Ocean. San Francisco is the Wall Street of the West," +
                " that is, the financial center. In addition, Silicon Valley, which is considered the center of the technology world," +
                " is also located within the territory of this city." +
                " It also hosts important places such as Alcatraz Island, Bay Bridge and Union Square.";

        String houstonexp="This city, which is a typical American metropolis," +
                " is this cosmopolitan city where you will encounter the latest examples" +
                " of modern architecture with its skyscrapers, wide lanes, bridges and intersections." +
                " Standing out with the energy and aviation industry, Houston is the heart of NASA.";

        String chicagoexp="Chicago, the capital of the State of Illinois," +
                " is a green city with lots of skyscrapers located around Lake Michigan." +
                " It is an important city in the American film and media industry.";

        Landmark newyork= new Landmark("NYC", newyorkexp, R.drawable.newyork);
        Landmark sanfrancisco= new Landmark("San Francisco", sanfranciscoexp, R.drawable.sanfrancisco);
        Landmark houston= new Landmark("Houston", houstonexp, R.drawable.houston);
        Landmark chicago= new Landmark("Chicago", chicagoexp, R.drawable.chicago);
        landmarkArrayList.add(newyork);
        landmarkArrayList.add(sanfrancisco);
        landmarkArrayList.add(houston);
        landmarkArrayList.add(chicago);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);
    }
}