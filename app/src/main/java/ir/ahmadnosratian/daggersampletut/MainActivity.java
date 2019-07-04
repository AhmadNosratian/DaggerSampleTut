package ir.ahmadnosratian.daggersampletut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import ir.ahmadnosratian.daggersampletut.domain.Body;
import ir.ahmadnosratian.daggersampletut.domain.DaggerDoctor;
import ir.ahmadnosratian.daggersampletut.domain.Doctor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Body body = createBody();

        TextView txtViewBloodKinf = findViewById(R.id.txt_bloodKind);
        txtViewBloodKinf.setText(body.getBlood().getKindOfBlood());

    }

    private Body createBody() {
        Doctor doctor = DaggerDoctor.create();
        return doctor.injectBlood();
    }
}
