package com.greenlightplanet.anantSinghProject.Batch;

import com.greenlightplanet.anantSinghProject.Model.Battles;
import com.greenlightplanet.anantSinghProject.Repository.BattlesRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
public class DBWriter implements ItemWriter<Battles> {

    private BattlesRepository battlesRepository;

    @Autowired
    public DBWriter (BattlesRepository battlesRepository) {
        this.battlesRepository = battlesRepository;
    }

    @Override
    public void write(List<? extends Battles> battles) throws Exception{
        System.out.println("Data Saved for Users: " + battles);
        battlesRepository.saveAll(battles);
    }
}