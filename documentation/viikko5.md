# Viikkoraportti 5
Alkuviikosta keskityin parantelemaan k�ytt�liittym�� demoa varten. Tein labyrintin ja algoritmin valitsemisen, nopeuden s��t�misen, labyrintin editoimisen klikkailemalla, simppelin statsitekstiboksin ja animaation skippaamisen.

Swingin s��t�minen oli t�ll� viikolla yll�tt�v�n helppoa. Esimerkiksi labyrintin ediointi onnistui kerrasta jollain 15 rivill� koodia. K�ytt�liittym� on viimeinkin tarpeeksi valmis ja tuskin siihen en�� hirve�sti panostan paitsi ehk� statseja hieman paremmaksi. K�yt�n Settings.javassa Javan omaa Hashtablea, koska nopeus-sliderin tekstien lis��misen sit� tarvitaan. En ala t�t� itse toteuttamaan, joten jos t�m� ei ole ok, poistan sliderin slow/fast labelit. 

Tein heuristiikasta rajapinnan ja lis�ilin A\*:lle parit eri heuristiikat. 

Katselmoin viime viikolla samantapaista projektia ja nappasin sielt� parit ideat omaan k�ytt��n: node oliot yll�pit�v�t itse tietoa heapin indeksist��n ja done-statuksesta, jolloin heapin containsin ja donen tarkistamisen aikavaativuudet tippuivat lineaarisesta vakioaikaiseen. Tein my�s kekoon decKey metodin. Pieniss� labyrinteiss�ni n�m� muutokset nopeuttivat A\*:ia 5-10 kertaisesti.

Ensi viikolla viimeinkin JPS:n kimppuun. Lis�ksi ajattelin korjailla ja refaktoroida koodia paremmaksi. Ainakin Mazen parsimisessa on viel� bugi parin viikon takaa.


K�ytt�liittym�: 6 tuntia  
Heuristiikat: 1 tunti  
A\* ja keon parantelut: 2 tuntia
Javadoc + testit: 1 tunti
Koodikatselmointi: 
Yhteens�:  tuntia