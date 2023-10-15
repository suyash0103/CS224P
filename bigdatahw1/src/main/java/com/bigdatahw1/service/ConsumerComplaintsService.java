package com.bigdatahw1.service;

import com.bigdatahw1.model.ConsumerComplaints;
import com.bigdatahw1.repository.ConsumerComplaintsRepository;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerComplaintsService {

    @Autowired
    private ConsumerComplaintsRepository consumerComplaintsRepository;

    public void fillTable() {
        String filePath = "/Applications/Fall-2023/Big-Data/Assignment-1/ConsumerComplaints.csv";

        List<ConsumerComplaints> complaintsList = new ArrayList<>();

        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(filePath)).withSkipLines(1).build()) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                ConsumerComplaints complaint = new ConsumerComplaints();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");

                complaint.setDateReceived(Date.valueOf(outputDateFormat.format(dateFormat.parse(line[0]))));
                complaint.setProductName(line[1]);
                complaint.setIssue(line[2]);
                complaint.setCompanyName(line[3]);
                complaint.setStateName(line[4]);
                complaint.setZipCode(line[5]);
                complaint.setSubmittedVia(line[6]);
                complaint.setDateSentToCompany(Date.valueOf(outputDateFormat.format(dateFormat.parse(line[7]))));
                complaint.setCompanyResponse(line[8]);
                complaint.setTimelyResponse(line[9]);
                complaint.setConsumerDisputed(line[10]);
                complaint.setComplaintId(Integer.parseInt(line[11]));

                complaintsList.add(complaint);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(complaintsList.size());
        consumerComplaintsRepository.saveAll(complaintsList);
    }

}
