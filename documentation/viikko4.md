# Viikkoraportti 4
Aloitin tekem�ll� Mazen lukemisen tiedostosta. Parsimisessa on pieni bugi mit� en muistanut/kerennyt korjaamaan t�h�n palautukseen, mutta se toimii palautuksen labyrinteill�.

Swing oli helvetillinen ty�maa ja siihen meni aivan liikaa aikaa, koska en vain osaa :(. Kaksi isoa ongelmaa oli Playback metodissa reitti� piirt�ess� MazePanesta tuli jostain syyst� toinen kopio ikkunan 0,0 koordinaatteihin (eli siis title barin alle) piirron ajaksi, mutta lopussa se hypp�si kiltisti omalle paikalleen. T�m� johtui kait frame.paintComponents(frame.getGraphics()) metodin k�yt�st�. T�m�n korjattuani playbackin aikana labyrintti piirtyi aina valkoiseksi ja sen j�lkeen normaaliksi jokaisessa stepiss�, joka aiheutti koko roskan v�lkkymist�. Sain korjattua k�ytt�m�ll� Swingin omaa timeri�. Mutta n�ist� johtuen GUI-luokan koodi on ehk� sekavaa t�ll� hetkell�. Ei kiinnosta korjata ainakaan viel�...

Jotta kurssiin liittyv�� asiaa saisi eteenp�in toteutin minimikeon, joka ehk� jopa toimii. En kerennyt hirve�sti testailemaan. Keko toimii pelk�st��n Node-olioilla, sill� en osannut tehd� sit� siististi kaikenlaisilla olioilla toimivaksi. Aloittelin my�s toteutusdokumentaatiota. Ohjaaja voi tiputtaa minut 3 nopan kerhoon, sill� en jaksanut ylim��r�ist� dokumentaatiota ja testausta tehd�.

Ensi viikolla teen algoritmin valinnan k�ytt�liittym��n, toivottavasti viimein lis�� reitinhakualgoritmeja ja ehk�p� statsiboksin jossen ole t�ysin hajonnut Swingiin.

Tiedoston lukeminen ja labyrintin parsiminen: 2 tuntia
Swing: 6 tuntia  
Minimikeko: 2 tuntia  
Random s��t�: 2 tuntia  
Javadoc + testit: 1 tunti  
Yhteens�: 13 tuntia