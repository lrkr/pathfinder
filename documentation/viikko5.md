# Viikkoraportti 5
Alkuviikosta keskityin parantelemaan käyttöliittymää demoa varten. Tein labyrintin ja algoritmin valitsemisen, nopeuden säätämisen, labyrintin editoimisen klikkailemalla, simppelin statsitekstiboksin ja animaation skippaamisen.

Swingin säätäminen oli tällä viikolla yllättävän helppoa. Esimerkiksi labyrintin ediointi onnistui kerrasta jollain 15 rivillä koodia. Käyttöliittymä on viimeinkin tarpeeksi valmis ja tuskin siihen enää hirveästi panostan paitsi ehkä statseja hieman paremmaksi. Käytän Settings.javassa Javan omaa Hashtablea, koska nopeus-sliderin tekstien lisäämisen sitä tarvitaan. En ala tätä itse toteuttamaan, joten jos tämä ei ole ok, poistan sliderin slow/fast labelit. 

Tein heuristiikasta rajapinnan ja lisäilin A\*:lle parit eri heuristiikat. 

Katselmoin viime viikolla samantapaista projektia ja nappasin sieltä parit ideat omaan käyttöön: node oliot ylläpitävät itse tietoa heapin indeksistään ja done-statuksesta, jolloin heapin containsin ja donen tarkistamisen aikavaativuudet tippuivat lineaarisesta vakioaikaiseen. Tein myös kekoon decKey metodin. Pienissä labyrinteissäni nämä muutokset nopeuttivat A\*:ia 5-10 kertaisesti.

Ensi viikolla viimeinkin JPS:n kimppuun. Lisäksi ajattelin korjailla ja refaktoroida koodia paremmaksi. Ainakin Mazen parsimisessa on vielä bugi parin viikon takaa.


Käyttöliittymä: 6 tuntia  
Heuristiikat: 1 tunti  
A\* ja keon parantelut: 2 tuntia
Javadoc + testit: 1 tunti
Koodikatselmointi: 
Yhteensä:  tuntia