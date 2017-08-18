# Viikkoraportti 4
Aloitin tekemällä Mazen lukemisen tiedostosta. Parsimisessa on pieni bugi mitä en muistanut/kerennyt korjaamaan tähän palautukseen, mutta se toimii palautuksen labyrinteillä.

Swing oli helvetillinen työmaa ja siihen meni aivan liikaa aikaa, koska en vain osaa :(. Kaksi isoa ongelmaa oli Playback metodissa reittiä piirtäessä MazePanesta tuli jostain syystä toinen kopio ikkunan 0,0 koordinaatteihin (eli siis title barin alle) piirron ajaksi, mutta lopussa se hyppäsi kiltisti omalle paikalleen. Tämä johtui kait frame.paintComponents(frame.getGraphics()) metodin käytöstä. Tämän korjattuani playbackin aikana labyrintti piirtyi aina valkoiseksi ja sen jälkeen normaaliksi jokaisessa stepissä, joka aiheutti koko roskan välkkymistä. Sain korjattua käyttämällä Swingin omaa timeriä. Mutta näistä johtuen GUI-luokan koodi on ehkä sekavaa tällä hetkellä. Ei kiinnosta korjata ainakaan vielä...

Jotta kurssiin liittyvää asiaa saisi eteenpäin toteutin minimikeon, joka ehkä jopa toimii. En kerennyt hirveästi testailemaan. Keko toimii pelkästään Node-olioilla, sillä en osannut tehdä sitä siististi kaikenlaisilla olioilla toimivaksi. Aloittelin myös toteutusdokumentaatiota. Ohjaaja voi tiputtaa minut 3 nopan kerhoon, sillä en jaksanut ylimääräistä dokumentaatiota ja testausta tehdä.

Ensi viikolla teen algoritmin valinnan käyttöliittymään, toivottavasti viimein lisää reitinhakualgoritmeja ja ehkäpä statsiboksin jossen ole täysin hajonnut Swingiin.

Tiedoston lukeminen ja labyrintin parsiminen: 2 tuntia
Swing: 6 tuntia  
Minimikeko: 2 tuntia  
Random säätö: 2 tuntia  
Javadoc + testit: 1 tunti  
Yhteensä: 13 tuntia