package com.example.extractdata;

import com.example.extractdata.generated.DrugbankType;
import com.example.extractdata.entities.Drug;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JAXBException {
        System.out.println("Hello world!");
        JAXBContext jc = JAXBContext.newInstance(DrugbankType.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        File xml = new File("src/main/resources/full database.xml");

        JAXBElement<DrugbankType> root = unmarshaller.unmarshal(new StreamSource(xml), DrugbankType.class);
        DrugbankType foo = root.getValue();

        List<Drug> drugs = new ArrayList<>();
        foo.getDrug().forEach(drugType -> drugs.add(new Drug(drugType)));
        System.out.println("by");
    }
}
