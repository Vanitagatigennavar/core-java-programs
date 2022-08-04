package com.xworkz.DTO;

import com.xworkz.constants.PartyName;
import com.xworkz.constants.PartySymbol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class PoliticianDTO {
     private int id;
     private PartyName partyName;
     private String president;
     private double TotalMembers;
     private PartySymbol partySymbol;
     private String partylocation;
     private String partycolour;
     private String partystate;
     private double partybudget;
}
