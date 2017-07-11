package com.company;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by junkyu on 2017. 7. 12..
 */
public class MonthlyPayDAOMock {
    MonthlyPayDAO daoMock;

    public MonthlyPayDAOMock(){
        daoMock = mock(MonthlyPayDAO.class);
    }

    public void setPay(String empId, long pay){
        if (pay > 0){
            when(daoMock.getPay(empId)).thenReturn(pay); // getPay가 호출되면 pay를 리턴하도록.
        } else{
            when(daoMock.getPay(empId))
                    .thenThrow(new RuntimeException("Low Employee."));
        }
    }

    /**
     * getPay는 단순히 daoMock에서 구현해주면 됨.
     * */
    public long getPay(String empId){
        return daoMock.getPay(empId);
    }
}
