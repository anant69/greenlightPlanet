package com.greenlightplanet.anantSinghProject.Controller;

import com.greenlightplanet.anantSinghProject.Model.Battles;
import com.greenlightplanet.anantSinghProject.Repository.BattlesRepository;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LoadController {

    @Autowired
    BattlesRepository battlesRepository;

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job job;

    @GetMapping("/load")
    public void load() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {


        Map<String, JobParameter> maps = new HashMap<>();
        maps.put("time", new JobParameter(System.currentTimeMillis()));
        JobParameters parameters = new JobParameters(maps);
        JobExecution jobExecution = jobLauncher.run(job, parameters);

    }
    @GetMapping(value="/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Object> getByColumn(){
        List<Object> battlesList = battlesRepository.getBattlesLocationAndRegion();
        return battlesList;
    }
    @GetMapping(value="/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public int getCount(){
        int count=battlesRepository.getCount();
        return count;
    }

    @GetMapping(value = "/{battle_number}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Battles> getStudent(@PathVariable long battle_number) {
        List<Battles> battlesResponse = battlesRepository.findByBattle_Number(battle_number);
        return battlesResponse;
    }

    }

