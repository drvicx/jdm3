package ru.jdm.timesheet.cloud.service_orgdata.service.orgdata;

import ru.jdm.timesheet.cloud.service_orgdata.entity.orgdata.Orgdata;

import org.springframework.stereotype.Service;

import java.time.LocalDate;


/**
 *=PREDEFINED ORGDATA GENERATOR | ГЕНЕРАТОР ПРЕДУСТАНОВЛЕННЫХ ДАННЫХ
 */
@Service
public class OrgdataGenerator {

    //--return empty Orgdata Object
    public Orgdata getDefaultOrgdataObj() {

        //--это контора однодневка
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);

        //--создаем пустой Объект
        Orgdata orgData = new Orgdata();
        //--инициализируем поля объекта дефолтными значениями
        //  *id объекта/записи явно не заполняем: orgData.setId(null) - не нужно
        orgData.setOrgName("ООО Рога и копыта");
        orgData.setDepName("Отдел по заготовке рогов и копыт");
        orgData.setOkud("1234567890");
        orgData.setOkpo("0987654321");
        orgData.setDepBoss("З.П. Фунт");
        orgData.setResponder("З.П. Фунт");
        orgData.setDateBegin(today);
        orgData.setDateEnd(tomorrow);

        //(!)при установке полей объекта null значения явно указывать не нужно
        //--возвращаем созданный объект с инициализированными полями
        return orgData;
    }

}
