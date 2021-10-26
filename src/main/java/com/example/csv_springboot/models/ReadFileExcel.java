package com.example.csv_springboot.models;

import com.example.csv_springboot.dao.User;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadFileExcel {

    public static List<User> readFile(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet datatypeSheet = workbook.getSheetAt(0);
        DataFormatter formatter = new DataFormatter();

        Iterator<Row> iterator = datatypeSheet.iterator();
        Row firstRow = iterator.next();
        Cell firstCell = firstRow.getCell(0);
        System.out.println(firstCell.getStringCellValue());

        List<User> users = new ArrayList<>();

        while(iterator.hasNext()) {
            Row curRow = iterator.next();
            User user = new User(
                    Integer.parseInt(formatter.formatCellValue(curRow.getCell(0))),
                    curRow.getCell(1).getStringCellValue(),
                    curRow.getCell(2).getStringCellValue()
            );
            users.add(user);
        }

        return users;
    }

}
