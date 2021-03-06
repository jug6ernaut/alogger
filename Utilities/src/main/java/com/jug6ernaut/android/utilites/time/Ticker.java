package com.jug6ernaut.android.utilites.time;

/*
 * Copyright (C) 2011 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A time source; returns a time value representing the number of nanoseconds
 * elapsed since some fixed but arbitrary point in time.
 *
 * @author Kevin Bourrillion
 * @since Guava release 09
 */

public abstract class Ticker {
    /**
     * Returns the number of nanoseconds elapsed since this ticker's fixed
     * point of reference.
     */
    public abstract long read();

    /**
     * A ticker that reads the current time using {@link System#nanoTime}.
     */
    public static Ticker systemTicker() {
        return SYSTEM_TICKER;
    }

    private static final Ticker SYSTEM_TICKER = new Ticker() {
        @Override
        public long read() {
            return System.nanoTime();
        }
    };
}