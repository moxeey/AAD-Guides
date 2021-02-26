package com.gomtech.aad_guides;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table") public  class  Word {
     @ColumnInfo(name = "word") @PrimaryKey(autoGenerate = false) @NonNull
     private String mWord;

    Word(@NonNull String word){
        this.mWord = word;
    }
    public String getWord(){
        return this.mWord;
    }
}
