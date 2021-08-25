package day8.adapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AdapterCostableToPricable implements Pricable{
    private final Costable costable;

    @Override
    public int getPrice(){
        return costable.cost();
    }

}
