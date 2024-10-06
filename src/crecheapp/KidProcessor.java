package crecheapp;

import java.util.ArrayList;

public class KidProcessor implements KiddyInterface {

    private ArrayList<Kiddy> kids;

    public KidProcessor() {
        kids = new ArrayList<>();
    }

    @Override
    public void registerKid(Kiddy kid) {
        kids.add(kid);
    }

    @Override
    public ArrayList<Kiddy> getKids() {
        return kids;
    }

    @Override
    public int countBoys() {

        int count = 0;

        for (Kiddy kid : kids) {
            if (Character.toLowerCase(kid.getGender()) == 'm') {
                count++;

            }
        }
        return count;

    }

}
