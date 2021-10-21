package tn.esprit.loldatastorage.utils

import android.content.Context

//TODO 8 "Change to a ROOMDataBase"
abstract class AppDataBase  {

    //TODO 8.1 "Add the DAO"

    companion object {
        @Volatile
        private var instance: AppDataBase? = null

        fun getDatabase(context: Context): AppDataBase {
            if (instance == null) {
                synchronized(this) {
                    //TODO 8.2 "Build the DataBase"
                }
            }
            return instance!!
        }
    }
}


