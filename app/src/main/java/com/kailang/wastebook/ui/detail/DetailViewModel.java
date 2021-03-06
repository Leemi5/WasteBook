package com.kailang.wastebook.ui.detail;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.kailang.wastebook.data.Entity.WasteBook;
import com.kailang.wastebook.data.WasteBookRepository;

import java.util.List;

public class DetailViewModel extends AndroidViewModel {

    private WasteBookRepository wasteBookRepository;
    public DetailViewModel(@NonNull Application application) {
        super(application);
        wasteBookRepository = new WasteBookRepository(application);
    }
    public LiveData<List<WasteBook>> getAllWasteBookLive(){
        return wasteBookRepository.getAllWasteBooksLive();
    }
    public LiveData<List<WasteBook>> findWasteBookWithPattern(String pattern){
        return wasteBookRepository.findWasteBookWithPattern(pattern);
    }

    public void insertWasteBook(WasteBook... wasteBooks) {
        wasteBookRepository.insertWasteBook(wasteBooks);
    }

    public void updateWasteBook(WasteBook... wasteBooks){
        wasteBookRepository.updateWasteBook(wasteBooks);
    }
    public void deleteWasteBook(WasteBook... wasteBooks){
        wasteBookRepository.deleteWasteBook(wasteBooks);
    }

//    public LiveData<List<WasteBook>> selectWasteBookByLongTime(long a,long b){
//        return wasteBookRepository.selectWasteBookByLongTime(a,b);
//    }

}