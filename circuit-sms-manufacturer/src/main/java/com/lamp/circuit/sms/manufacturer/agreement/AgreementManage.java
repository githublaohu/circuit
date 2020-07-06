
package com.lamp.circuit.sms.manufacturer.agreement;

import java.net.InetSocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.lamp.circuit.sms.manufacturer.NetworkHandler;


// 管理 配置与协议之间关系
//
public class AgreementManage {
   
    
    private Map<InetSocketAddress , AgreementWrapper>  addressToManufacturer = new ConcurrentHashMap<>();
    
    
    public void addManufacturerConfig(ManufacturerConfig manufacturerConfig) {
        
    }
    
    public void deleteManufacturerConfig(ManufacturerConfig manufacturerConfig) {
        
    }
    
    
    public AgreementWrapper getAgreementWrapper(InetSocketAddress remoteAddress) {
        
        return null;
    }
    
    
    static class AgreementWrapper{
        
        private Agreement agreement;
        
        private AgreementReturn agreementReturn;
        
        private NetworkHandler networkHandler ;
    }
}
