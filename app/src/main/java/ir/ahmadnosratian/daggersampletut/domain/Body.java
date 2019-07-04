package ir.ahmadnosratian.daggersampletut.domain;

import javax.inject.Inject;

import ir.ahmadnosratian.daggersampletut.domain.blood.Blood;

public class Body {

    @Inject
    Blood blood;

    @Inject
    public Body(){

    }



    public Blood getBlood() {
        return blood;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }


}
