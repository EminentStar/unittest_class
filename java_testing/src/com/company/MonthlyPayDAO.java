package com.company;

/**
 * Created by junkyu on 2017. 7. 12..
 * 보통 웹 개발 할 때는 DB 처리하는 부분인 DAO(Data Access Object)를 많이 사용
 * 그리고 이 DAO가 DB와 붙을 수 있어야 개발이 쉬워짐
 */
public interface MonthlyPayDAO {
    public long getPay(String empId);
    public void setPay(String empId, long pay);
}
