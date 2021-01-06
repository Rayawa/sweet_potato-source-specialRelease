package io.github.teddyxlandlee.sweet_potato.util;

import io.github.teddyxlandlee.sweet_potato.SweetPotatoComponent;
import net.minecraft.item.FoodComponent;

import java.util.OptionalDouble;

public class NullSweetPotatoComponent extends SweetPotatoComponent {

    public NullSweetPotatoComponent() {
        super(1, 0.1F, 0.1F, OptionalDouble.empty());
    }

    @Override
    public FoodComponent asFoodComponent() {
        return new FoodComponent.Builder().build();
    }
}
