package ir.ahmadnosratian.daggersampletut.domain;


import java.util.Random;
import ir.ahmadnosratian.daggersampletut.domain.blood.AB_Blood;
import ir.ahmadnosratian.daggersampletut.domain.blood.A_Blood;
import ir.ahmadnosratian.daggersampletut.domain.blood.B_Blood;
import ir.ahmadnosratian.daggersampletut.domain.blood.Blood;
import ir.ahmadnosratian.daggersampletut.domain.blood.O_Blood;
import dagger.Module;
import dagger.Provides;


@Module
public class RandomInjectionModule {


    private static Blood blood;

    public RandomInjectionModule() {

    }

    @Provides
    static Blood provideBlood() {
        if (blood != null) {
            return blood;
        }

        Random random = new Random();
        int rndNumber = random.nextInt(3);
        switch (rndNumber) {
            case 0:
                blood = new A_Blood();
                break;
            case 1:
                blood = new B_Blood();
                break;
            case 2:
                blood = new AB_Blood();
                break;
            case 4:
                blood = new O_Blood();
                break;
            default:
                return blood = new A_Blood();
        }


        return blood;
    }
}
