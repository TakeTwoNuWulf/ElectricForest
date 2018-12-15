package com.example.android.electricforest;

public class stageInfo {


        /**
         * Artist name
         */
        private String mArtist;

        /**
         * Track Name
         */
        private String mSetTime;


        /**
         * Create a Music object.
         */


        public stageInfo(String artistInfo, String setTime) {
            mArtist = artistInfo;
            mSetTime = setTime;
        }
        ;

        /**
         * Get Artist name
         */
        public String getArtistName() {
            return mArtist;
        }

        /**
         * Get Track name
         */
        public String getmSetTime() {
            return mSetTime;
        }

    }

