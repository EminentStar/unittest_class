package com.company;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;
import java.util.Map;


/**
 * Created by junkyu on 2017. 7. 11..
 */
public class MapTest {

    /**
     * verify()는 해당 구문이 호출 되었는지를 체크, 호출 횟수도 지정가능
     */
    public void step1(){
        Map testMock=mock(Map.class);
        testMock.put("blog2book test", 10000);
        verify(testMock).put("blog2book test", 10000);
    }

    public void step2(){
        Map testMock = mock(Map.class);
        testMock.put("blog2book", 2);
        testMock.put("blog2book", 2);
        //testMock.put("blog2book", 8888);

        verify(testMock, atLeastOnce()).put("blog2book", 2);
        verify(testMock, atLeast(2)).put("blog2book", 2);
        verify(testMock, times(2)).put("blog2book", 2);
        verify(testMock, atMost(3)).put("blog2book", 2);
        verify(testMock, never()).put("blog2book", 8888);

    }

    /**
     * 특정 목 객체를 생성 후 이 객체로부터 특정 조건을 지정할 수 있음
     */
    public void step3(){
        Map testMock = mock(Map.class);
        when(testMock.get("blog2book test")).thenReturn(10000);
        when(testMock.get("blog2book java tuning"))
                .thenReturn(20000);
        System.out.println(testMock.get("blog2book"));
        System.out.println(testMock.get("blog2book test"));
        System.out.println(testMock.get("blog2book java tuning"));

    }

    public void step3_2(){
        Map testMock = mock(Map.class);
        when(testMock.get(anyString())).thenReturn(0);
        when(testMock.get("blog2book test"))
                .thenReturn(10, 20, 30, 40, 50);
        when(testMock.get("blog2book java tuning"))
                .thenAnswer(new Answer() {
                    @Override
                    public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                            Object[] args = invocationOnMock.getArguments();
                            return args[0] + " is a good book!!!";
                    }
                });

        System.out.println(testMock.get("blog2book"));
        for(int loop = 0; loop < 5; loop++){
            System.out.println(testMock.get("blog2book test"));
        }
        System.out.println(testMock.get("blog2book java tuning"));

        when(testMock.get(any(Integer.class))).thenReturn(4848484);
        System.out.println(testMock.get(1));

        when(testMock.put(eq("HAHA"), anyInt()))
                .thenAnswer(new Answer() {
                    @Override
                    public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                        System.out.println("HAHA, anyInt");
                        return null;
                    }
                });
        testMock.put("HAHA", 1);

    }

    public void step4() {
        Map testMock = mock(Map.class);
        doThrow(new RuntimeException("Exception is called")).
                when(testMock).clear();
        try{
             testMock.clear(); //RuntimeException
        } catch(RuntimeException ex){
            System.out.println("Occured RuntimeException");
        }

        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                return "doAnswer!!!!!";
            }
        }).when(testMock).put("blog2book", 10000);
        System.out.println(testMock.put("blog2book", 10000));

        doReturn(7777)
                .when(testMock).get("blog2book");


        System.out.println(testMock.get("blog2book"));



    }
}
