package lk.avalanche;

import lk.avalanche.battlebuddy.entity.User;

public class test {
    public static void main(String [] args){
        String abc123 = User.passwordEncoder.encode("abc123");
        System.out.println(abc123);
    }
}
