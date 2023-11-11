package com.solvd.library.interfaces;

import com.solvd.library.exceptions.NegativeCostException;

public interface IPurchasable {
    void setPrice(float newPrice)  throws NegativeCostException;
    float getPrice();
}
