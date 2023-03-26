package com.rxjavaedu;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;

import java.util.concurrent.TimeUnit;

/**
 * RxJava reactive stream 구현
 * reactive stream 데이터 스트림을 비동기로 처리하는 것을 의미한다.
 *
 * 데이터를 가져와서 처리하는 것이 아니고
 * 데이터를 받은 시점에 반응해서 처리하는 것.
 * 데이터 생산하는 publisher 열심히 생산,
 * 데이터를 소비하는 subscriber 는 열심히 소비하면 된다.
 * 마이크로 서비스와 어울린다.
 */
public class RxJava01 {

    public static void main(String[] args) {
        RxJava01 rxJava01 = new RxJava01();
        //rxJava01.basicConcept_001();
        //rxJava01.coldHot_002();
        rxJava01.disposable_003();
    }

    public void basicConcept_001(){
        Flowable<Integer> integerFlowable = Flowable.just(1,2,3,4,5,6);

        //구독해서 읽으면 된다.
        //배압(빽프레셔)이 된다.  ==> 생산자의 소비속도와 소비자의 생산속도가 다를 때. 조절기능...
        integerFlowable.subscribe(data -> System.out.println(data));

        integerFlowable.subscribe(data -> System.out.println("2: "+data)
                                ,error ->error.printStackTrace()  // 에러
                                ,() -> System.out.println("완료"));  //완료


        //배압이 안된다.
        Observable<Integer> integerObservable = Observable.just(1,2,3,4,5);
        integerObservable.subscribe(data -> System.out.println("Observable : "+data));
    }

    //기본 퍼블리셔 상태는 콜드상태다.
    //핫퍼블상태는 => 소비자가 실시간으로 받는 것.
    public void coldHot_002(){

        boolean isCold = false;

        if(isCold) {
            Flowable<Long> flowable = Flowable.interval(1, TimeUnit.SECONDS);
            flowable.subscribe(d -> System.out.println("1: " + d));
            ThreadUtil.sleep(3, true);

            flowable.subscribe(d -> System.out.println("2: " + d));
            ThreadUtil.sleep(3, true);
        }else{
            ConnectableFlowable<Long> flowable = ConnectableFlowable.interval(1, TimeUnit.SECONDS)
                    .doOnNext(data -> ThreadUtil.sleep(1,true))
                    .publish();
            flowable.connect();
            flowable.subscribe(d -> System.out.println("1: " + d));
            ThreadUtil.sleep(3, true);

            flowable.subscribe(d -> System.out.println("2: " + d));
            ThreadUtil.sleep(3, true);
        }
    }

    public void disposable_003(){
        Flowable<Long> flowable = Flowable.interval(1,TimeUnit.SECONDS);

        //flowable.subscribe(data -> System.out.println(data));

        Disposable disposable = flowable.subscribe(data -> System.out.println(data));

        ThreadUtil.sleep(5,true);
        disposable.dispose();
        ThreadUtil.sleep(5,true);

    }

}
