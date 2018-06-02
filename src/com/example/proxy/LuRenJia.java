package com.example.proxy;

/**
 * @author amzing
 * 代理人－－路人甲
 */
public class LuRenJia implements Basketballer {

    private Basketballer basketballer;

    /** 默认代理库里打篮球 **/
    public LuRenJia(){
        this.basketballer = new Curry();
    }

    /** 代理其他人打篮球 **/
    public LuRenJia(Basketballer basketballer){
        this.basketballer = basketballer;
    }

    @Override
    public void twoPoint() {
        basketballer.twoPoint();
    }

    @Override
    public void threePoint() {
       basketballer.threePoint();
    }
}
