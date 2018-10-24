package edu.cnm.deepdive.megamillions;

import android.app.Application;
import com.facebook.stetho.Stetho;
import edu.cnm.deepdive.megamillions.model.db.PickDataBase;

public class PickApplication extends Application {


  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }

}
