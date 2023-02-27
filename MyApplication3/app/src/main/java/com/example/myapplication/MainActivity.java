package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String,String>> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.recyclerView);

       itemList();


    }
    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

        private class MyViewHolder extends RecyclerView.ViewHolder{

            TextView textView;
            ImageView imageView;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                textView = itemView.findViewById(R.id.textView);
                imageView = itemView.findViewById(R.id.imageView);

            }
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View myView = layoutInflater.inflate(R.layout.recycler_item,parent,false);

            return new MyViewHolder(myView);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String vidio_ID = hashMap.get("video_id");
            String vidTitle = hashMap.get("title");
            String imageUrl = "https://img.youtube.com/vi/"+vidio_ID+"/0.jpg";


            holder.textView.setText(vidTitle);
            Picasso.get()
                    .load(imageUrl)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(holder.imageView);

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }


    }
    private void itemList(){

        arrayList = new ArrayList<>();

        hashMap = new HashMap<>();
        hashMap.put("video_id","zW6oQyqotYs");
        hashMap.put("title","AM DO JURI // RAKESH HANSDA & TINA HEMBROM");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","4uW_iEgS4sY");
        hashMap.put("title","OKA KHON CHOM SETER AKAN || TINA HEMBROM & MR ROMEO ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","VfF_5kJzO9k");
        hashMap.put("title","BOMEM PHUTAU KURI RE || NEW SANTHALI FULL VIDEO");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","VRTTk8YkI5A");
        hashMap.put("title","Hai Re Sajni Full Video Romeo Baskey & Puja Soren Chotu Lohar");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","uxTK42t1TtQ");
        hashMap.put("title","DULAR WADA (FULL VIDEO) || New Santali Video Song 2023 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","ChcsEaEUPl4");
        hashMap.put("title","NEW SANTALI VIDEO | BAI BAI TE | ROMEO & MIRANDA | SHIVENDRA MURMU & PARAYNI SOREN | FULL VIDEO SONG");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","zW6oQyqotYs");
        hashMap.put("title","AM DO JURI // RAKESH HANSDA & TINA HEMBROM");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","4uW_iEgS4sY");
        hashMap.put("title","OKA KHON CHOM SETER AKAN || TINA HEMBROM & MR ROMEO ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","VfF_5kJzO9k");
        hashMap.put("title","BOMEM PHUTAU KURI RE || NEW SANTHALI FULL VIDEO");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","VRTTk8YkI5A");
        hashMap.put("title","Hai Re Sajni Full Video Romeo Baskey & Puja Soren Chotu Lohar");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","uxTK42t1TtQ");
        hashMap.put("title","DULAR WADA (FULL VIDEO) || New Santali Video Song 2023 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","ChcsEaEUPl4");
        hashMap.put("title","NEW SANTALI VIDEO | BAI BAI TE | ROMEO & MIRANDA | SHIVENDRA MURMU & PARAYNI SOREN | FULL VIDEO SONG");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","zW6oQyqotYs");
        hashMap.put("title","AM DO JURI // RAKESH HANSDA & TINA HEMBROM");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","4uW_iEgS4sY");
        hashMap.put("title","OKA KHON CHOM SETER AKAN || TINA HEMBROM & MR ROMEO ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","VfF_5kJzO9k");
        hashMap.put("title","BOMEM PHUTAU KURI RE || NEW SANTHALI FULL VIDEO");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","VRTTk8YkI5A");
        hashMap.put("title","Hai Re Sajni Full Video Romeo Baskey & Puja Soren Chotu Lohar");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","uxTK42t1TtQ");
        hashMap.put("title","DULAR WADA (FULL VIDEO) || New Santali Video Song 2023 ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("video_id","ChcsEaEUPl4");
        hashMap.put("title","NEW SANTALI VIDEO | BAI BAI TE | ROMEO & MIRANDA | SHIVENDRA MURMU & PARAYNI SOREN | FULL VIDEO SONG");
        arrayList.add(hashMap);




        MyAdapter myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }
}