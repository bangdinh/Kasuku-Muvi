package tz.co.hosannahighertech.kasukumuvi.injection.modules;

import android.content.Context;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;
import tz.co.hosannahighertech.kasukumuvi.data.models.db.DatabaseManager;
import tz.co.hosannahighertech.kasukumuvi.data.models.db.MovieDao;

/**
 * @package tz.co.hosannahighertech.kasukumuvi.injection.modules
 * Created by Stefano D. Mtangoo <stefano@hosannahighertech.co.tz> on
 * Created at 26/06/2018 19:25.
 * Copyright (c) 2018, Hosanna Higher Technologies Co. Ltd
 * This Code is Provided under Hosanna HTCL Licensing Conditions.
 */

@Module
public class DatabaseModule {
    private DatabaseManager mDatabase;

    @Inject
    public DatabaseModule(Context context) {
        mDatabase = DatabaseManager.getInstance(context);
    }

    @Provides
    MovieDao provideMovieDao()
    {
        return mDatabase.movieDao();
    }
}
