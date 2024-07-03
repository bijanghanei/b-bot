package com.bijanghanei.bex.entity;

import lombok.*;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class WatchList {
    private boolean success;
    private ArrayList<String> symbols;
}


