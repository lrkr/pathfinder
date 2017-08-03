# Viikkoraportti 2

Aloitin viikon tekem�ll� perusluokat reitinhakualgoritmien k�ytt�� varten, jonka j�lkeen toteutin leveyshaun labyrinttiin. Tarkoituksena oli t�ll� viikolla toteuttaa my�s A*, mutta sen sijaan teinkin simppelin graafisen visualisaation. Halusin tehd� t�m�n nopeasti saadakseni kasaan walking skeletonin ettei my�hemmin tule isoja yll�tyksi� visualisaation kanssa. T�h�n pohjaan pit�isi olla helppo lis�t� uusia reitinhakualgoritmeja sek� toiminnallisuutta visualisaatioon.

Mainiin jouduin lis��m��n sleepin, koska v�lill� MazePanen labelMap on null kun steppej� aletaan v�ritt�m��n. 

Testaus tuntuu hieman vajaavaiselta. En n�hnyt j�rke� testata Maze ja Step luokkia, koska ne ovat k�yt�nn�ss� vain get/set metodeja ja ne testaantuvat esim. BFS testien kanssa joka tapauksessa. Visualisaatiota en testaa.

Ensi viikolla teen reitinhakualgoritmin tai pari lis��, aloitan omien tietorakenteiden tekemisen ja ehk� laajennan visualisaatiota. Ehk� my�s enemm�n ja isompia labyrinttej� ja niiden lataaminen tiedostoista. Pient� refaktorointia pit�isi my�s tehd�. Ainakin siirt�� luokat j�rkeviin paketteihin.

Perusclassit ja BFS: 1.5 tuntia  
GUI: 2 tuntia  
Javadoc + testit: 1.5 tuntia  
Yhteens�: 5 tuntia