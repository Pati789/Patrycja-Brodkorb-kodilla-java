package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
            void testBigmacNew() {


        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .bun("with sesame")
                .sauce("standard")
                .ingredient("cheese")
                .burgers(2)
                .ingredient("becon")
                .ingredient("chilli peppers")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);

    }

}
