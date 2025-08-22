package com.example.bombay_hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailActivity extends AppCompatActivity {

    String[][] doctor_detail1 = {
            {"Doctor's Name: Dr. Arjun Patel, Hospital Name: Apollo Hospital, Experience: 12 years, Mobile No: 9876543210, Amount: ₹1500"},
            {"Doctor's Name: Dr. Nisha Gupta, Hospital Name: Fortis Hospital, Experience: 8 years, Mobile No: 9876543211, Amount: ₹1200"},
            {"Doctor's Name: Dr. Rakesh Verma, Hospital Name: AIIMS, Experience: 15 years, Mobile No: 9876543212, Amount: ₹1800"},
            {"Doctor's Name: Dr. Priya Singh, Hospital Name: Max Hospital, Experience: 10 years, Mobile No: 9876543213, Amount: ₹1400"},
            {"Doctor's Name: Dr. Aditya Rao, Hospital Name: Manipal Hospital, Experience: 7 years, Mobile No: 9876543214, Amount: ₹1300"},
    };

    String[][] doctor_detail2 = {
            {"Doctor's Name: Dr. Meera Iyer, Hospital Name: Narayana Health, Experience: 9 years, Mobile No: 9876543215, Amount: ₹1250"},
            {"Doctor's Name: Dr. Sanjay Sharma, Hospital Name: Medanta, Experience: 20 years, Mobile No: 9876543216, Amount: ₹2000"},
            {"Doctor's Name: Dr. Kavita Pillai, Hospital Name: Kokilaben Dhirubhai Ambani Hospital, Experience: 5 years, Mobile No: 9876543217, Amount: ₹1100"},
            {"Doctor's Name: Dr. Rajesh Deshmukh, Hospital Name: Lilavati Hospital, Experience: 18 years, Mobile No: 9876543218, Amount: ₹1700"},
            {"Doctor's Name: Dr. Sneha Chawla, Hospital Name: Artemis Hospital, Experience: 6 years, Mobile No: 9876543219, Amount: ₹1350"}
    };

    String[][] doctor_detail3 = {
            {"Doctor's Name: Dr. Vikram Sinha, Hospital Name: Fortis Escorts, Experience: 14 years, Mobile No: 9876543220, Amount: ₹1600"},
            {"Doctor's Name: Dr. Sunita Rao, Hospital Name: Ruby Hall Clinic, Experience: 11 years, Mobile No: 9876543221, Amount: ₹1450"},
            {"Doctor's Name: Dr. Manish Khanna, Hospital Name: Sir Ganga Ram Hospital, Experience: 16 years, Mobile No: 9876543222, Amount: ₹1550"},
            {"Doctor's Name: Dr. Anjali Menon, Hospital Name: Global Hospital, Experience: 8 years, Mobile No: 9876543223, Amount: ₹1250"},
            {"Doctor's Name: Dr. Abhishek Thakur, Hospital Name: Jaslok Hospital, Experience: 12 years, Mobile No: 9876543224, Amount: ₹1500"}
    };

    String[][] doctor_detail4 = {
            {"Doctor's Name: Dr. Neha Bajaj, Hospital Name: Fortis Malar Hospital, Experience: 7 years, Mobile No: 9876543225, Amount: ₹1300"},
            {"Doctor's Name: Dr. Rohan Das, Hospital Name: Saifee Hospital, Experience: 10 years, Mobile No: 9876543226, Amount: ₹1400"},
            {"Doctor's Name: Dr. Smita Kulkarni, Hospital Name: Hinduja Hospital, Experience: 9 years, Mobile No: 9876543227, Amount: ₹1250"},
            {"Doctor's Name: Dr. Ashok Mishra, Hospital Name: Wockhardt Hospital, Experience: 17 years, Mobile No: 9876543228, Amount: ₹1600"},
            {"Doctor's Name: Dr. Pooja Joshi, Hospital Name: Bombay Hospital, Experience: 5 years, Mobile No: 9876543229, Amount: ₹1100"}
    };

    String[][] doctor_detail5 = {
            {"Doctor's Name: Dr. Suresh Bhatia, Hospital Name: Hiranandani Hospital, Experience: 13 years, Mobile No: 9876543230, Amount: ₹1500"},
            {"Doctor's Name: Dr. Rajiv Sharma, Hospital Name: Columbia Asia, Experience: 15 years, Mobile No: 9876543231, Amount: ₹1700"},
            {"Doctor's Name: Dr. Arti Singh, Hospital Name: Bharti Hospital, Experience: 6 years, Mobile No: 9876543232, Amount: ₹1300"},
            {"Doctor's Name: Dr. Prakash Nair, Hospital Name: Holy Family Hospital, Experience: 10 years, Mobile No: 9876543233, Amount: ₹1400"},
            {"Doctor's Name: Dr. Vandana Reddy, Hospital Name: CARE Hospitals, Experience: 12 years, Mobile No: 9876543234, Amount: ₹1500"}
    };

    String[][] doctor_detail6 = {
            {
                    "Doctor's Name: Dr. Rohit Mehta",
                    "Hospital Name: Apollo Spectra Hospital",
                    "Experience: 14 years",
                    "Mobile No: 9876543235",
                    "Amount: ₹1550"
            },
            {
                    "Doctor's Name: Dr. Seema Aggarwal",
                    "Hospital Name: Max Super Specialty Hospital",
                    "Experience: 9 years",
                    "Mobile No: 9876543236",
                    "Amount: ₹1300"
            },
            {
                    "Doctor's Name: Dr. Vikash Kumar",
                    "Hospital Name: BLK Super Specialty Hospital",
                    "Experience: 18 years",
                    "Mobile No: 9876543237",
                    "Amount: ₹1700"
            },
            {
                    "Doctor's Name: Dr. Anita Saxena",
                    "Hospital Name: Columbia Asia Hospital",
                    "Experience: 11 years",
                    "Mobile No: 9876543238",
                    "Amount: ₹1450"
            },
            {
                    "Doctor's Name: Dr. Pankaj Jain",
                    "Hospital Name: Fortis Memorial Research Institute",
                    "Experience: 20 years",
                    "Mobile No: 9876543239",
                    "Amount: ₹2000"
            }
    };


    TextView tv;
    Button btn;
    String[][] Doctor_detail = {};
    ArrayList List;
    SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doctor_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tv = findViewById(R.id.tvdoctorDDTitle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        assert title != null;
        if (title.compareTo("Family Physician")==0){
            Doctor_detail = doctor_detail1;
        }
        else if (title.compareTo("Dietitian")==0){
            Doctor_detail = doctor_detail2;
        }
        else if (title.compareTo("Dentist")==0){
            Doctor_detail = doctor_detail3;
        }
        else if (title.compareTo("Surgeon")==0){
            Doctor_detail = doctor_detail4;
        }
        else if (title.compareTo("Cardiologist")==0){
            Doctor_detail = doctor_detail5;
        }
        else{
            Doctor_detail = doctor_detail6;
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailActivity.this,FindDoctorActivity.class));
            }
        });

        List = new ArrayList();
        for (String[] strings : Doctor_detail) {
            HashMap<String, String> item = new HashMap<String, String>();
            item.put("line1", strings[0]);
            item.put("line2", strings[1]);
            item.put("line3", strings[2]);
            item.put("line4", strings[3]);
            item.put("line5", strings[4] + "/-");
            List.add(item);
        }
        sa = new SimpleAdapter(this,List,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
        );
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

    }
}