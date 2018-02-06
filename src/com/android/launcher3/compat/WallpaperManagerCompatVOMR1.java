/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.launcher3.compat;

import android.annotation.TargetApi;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.Log;

import java.lang.reflect.Method;


@TargetApi(27)
public class WallpaperManagerCompatVOMR1 extends WallpaperManagerCompat {

    private static final String TAG = "WMCompatVOMR1";

    private Method mWCColorHintsMethod;

    WallpaperManagerCompatVOMR1(Context context) throws Throwable {

    }

    @Nullable
    @Override
    public WallpaperColorsCompat getWallpaperColors(int which) {
        return new WallpaperColorsCompat(Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK);
    }

    @Override
    public void addOnColorsChangedListener(final OnColorsChangedListenerCompat listener) {
        //listener.onColorsChanged(new WallpaperColorsCompat(Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK),1);

    }
}
