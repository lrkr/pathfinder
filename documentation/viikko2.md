# Viikkoraportti 2

Aloitin viikon tekemällä perusluokat reitinhakualgoritmien käyttöä varten, jonka jälkeen toteutin leveyshaun labyrinttiin. Tarkoituksena oli tällä viikolla toteuttaa myös A*, mutta sen sijaan teinkin simppelin graafisen visualisaation. Halusin tehdä tämän nopeasti saadakseni kasaan walking skeletonin ettei myöhemmin tule isoja yllätyksiä visualisaation kanssa. Tähän pohjaan pitäisi olla helppo lisätä uusia reitinhakualgoritmeja sekä toiminnallisuutta visualisaatioon.

Mainiin jouduin lisäämään sleepin, koska välillä MazePanen labelMap on null kun steppejä aletaan värittämään. 

Testaus tuntuu hieman vajaavaiselta. En nähnyt järkeä testata Maze ja Step luokkia, koska ne ovat käytännössä vain get/set metodeja ja ne testaantuvat esim. BFS testien kanssa joka tapauksessa. Visualisaatiota en testaa.

Ensi viikolla teen reitinhakualgoritmin tai pari lisää, aloitan omien tietorakenteiden tekemisen ja ehkä laajennan visualisaatiota. Ehkä myös enemmän ja isompia labyrinttejä ja niiden lataaminen tiedostoista. Pientä refaktorointia pitäisi myös tehdä. Ainakin siirtää luokat järkeviin paketteihin.

Perusclassit ja BFS: 1.5 tuntia  
GUI: 2 tuntia  
Javadoc + testit: 1.5 tuntia  
Yhteensä: 5 tuntia