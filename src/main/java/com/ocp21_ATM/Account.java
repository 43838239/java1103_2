package com.ocp21_ATM;

public class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // 提款 x
    //誰 (執行續)先執行到此方法,該物件就歸誰掌管,其他人(執行續)則在外面排隊
    //Synchronized 是保證一次只會有一個人進來提款
    
    public synchronized void withdraw(int x) {
        String name = Thread.currentThread().getName();
        System.out.printf("%s 進來提款了\n", name);
        // 取得帳戶餘額
        int temp_money = getMoney();
        if(temp_money >= x) { // 餘額充足
            // 提款成功, 回寫餘額
            setMoney(temp_money - x);
            System.out.printf("%s 提款: $%d 成功, 帳戶餘額: $%d\n", name, x, getMoney());
        } else {
            System.out.printf("%s 提款: $%d 失敗, 帳戶餘額: $%d\n", name, x, getMoney());
        }
        System.out.printf("%s 完成提款了\n", name);
    }
    
}