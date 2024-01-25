package com.example.extractdata;

import com.example.extractdata.generated.DrugbankType;
import com.example.extractdata.entities.Drug;
import com.example.extractdata.service.DrugService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.annotation.PostConstruct;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExtractDataApplication {
    @Autowired
    public DrugService drugService;

    public static void main(String[] args) {
        SpringApplication.run(ExtractDataApplication.class, args);

    }
    @PostConstruct
    public void transher() throws JAXBException {
//        System.out.println("starting");
//        long start = System.currentTimeMillis();
//        JAXBContext jc = JAXBContext.newInstance(DrugbankType.class);
//
//        Unmarshaller unmarshaller = jc.createUnmarshaller();
//        File xml = new File("src/main/resources/full database.xml");
//
//        JAXBElement<DrugbankType> root = unmarshaller.unmarshal(new StreamSource(xml), DrugbankType.class);
//        DrugbankType foo = root.getValue();
//
//        List<Drug> drugs = new ArrayList<>();
//        foo.getDrug().forEach(drugType -> drugs.add(new Drug(drugType)));
//        drugService.addAll(drugs);
//        long end = System.currentTimeMillis();
//        System.out.println((end-start)*1000);
        List<Drug> drugs = drugService.getAllDrugs();
        System.out.println(drugs.get(0).getIndication());
    }

}
