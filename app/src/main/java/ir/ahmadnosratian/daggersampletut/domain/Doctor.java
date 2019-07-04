package ir.ahmadnosratian.daggersampletut.domain;


import dagger.Component;

@Component(modules = RandomInjectionModule.class)
public interface Doctor {

    Body injectBlood();

}
