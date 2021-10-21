package com.greenlightplanet.anantSinghProject.Batch;

import com.greenlightplanet.anantSinghProject.Model.Battles;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;


@Component
public class Processor implements ItemProcessor<Battles, Battles> {

    public Processor() {

    }

    @Override
    public Battles process(Battles battles) throws Exception {

        return battles;
    }
}


