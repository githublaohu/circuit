package com.lamp.circuit.sms.manufacturer.agreement;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ManufacturerManage {

    private AgreementManage agreementManage;
    
    private Map<String , List<ManufacturerConfig>> groupToManufacturerConfig = new ConcurrentHashMap<>();
    

    public ManufacturerManage(AgreementManage agreementManage) {
        this.agreementManage = agreementManage;
    }

    public void addManufacturerConfig(ManufacturerConfig manufacturerConfig) {
        
        agreementManage.addManufacturerConfig(manufacturerConfig);
    }

    public void deleteManufacturerConfig(ManufacturerConfig manufacturerConfig) {
        agreementManage.deleteManufacturerConfig(manufacturerConfig);
    }

}
