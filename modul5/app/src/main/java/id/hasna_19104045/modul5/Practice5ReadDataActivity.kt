package id.hasna_19104045.modul5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Practice5ReadDataActivity : AppCompatActivity(){
    private lateinit var lblProdiSaya : TextView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5_read_data)

        // inisiasi view
        lblProdiSaya = findViewById(R.id.lblProdiSaya)

//        if(intent.extras != null){
//            val bundle = intent.extras
//            lblProdiSaya.setText(bundle.getString("data1"))
//        }else{
//            lblProdiSaya.setText(intent.getStringExtra("data1"))
//        }
        val prodi = intent.getStringExtra(EXTRA_PRODI)
        lblProdiSaya.text = "Prodi Saya Adalah $prodi"
    }

    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }
}