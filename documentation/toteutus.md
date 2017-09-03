Ohjelma koostuu reitinhakualgoritmeistä, niiden tarvitsemista apuluokista kuten Maze, Node yms sekä simppelistä graafisesta käyttöliittymästä. Kun graafisesta käyttöliittymästä valitsee labyrintin ja algoritmin näyttää ohjelma miten reintinhakualgoritmi löytää reitin alkukohdasta loppukohtaan.

Ohjelmassa käytettävät reitinhakualgoritmit ovat A\* eri heuristiikoilla ja leveyshaku.

Tärkein itsetehty tietorakenne on labyrintin nodeille tehty minimikeko. Koska nodet ylläpitävät itse tietoa keon indeksistään ja done-statuksestaan, olen saanut keon containsin ja A\*:n käyttämän node.isDone():n toteutettua vakioaikaisesti.  

A\*:lle on eri heuristiikoita: manhattan, manhattan nudged ja manhattan cross product vector. Koska labyrintissä ei voi liikkua vinoittain, on manhattan huono tapauksessa, jossa lyhimpiä reittejä on useita. Tällöin keossa tulee paljon tasapelejä, jolloin monia eri reittejä aletaan laajentamaan. Manhattan nudged poistaa tasapelit nostamalla heuristiikan arvoa 0.1 prosentilla. Manhattan cross product antaa paremman prioriteetin nodeille, jotka ovat alku- ja loppukohtien välisellä suoralla.

BFS:n aikavaativuus on O(|V|+|E|), koska jokaisen noden kohdalla voi joutua käymään kaikki viereiset läpi.

A\* aikavaativuus on tunnettu O((|E| + |V|) log |V|), koska node voidaan lisätä kekoon vain kerran ja jokaisen noden kohdalla käydään viereiset läpi. A\*:n käyttämät node-oliot luodaan vasta tarvittaessa, joten niiden enneltatekemiseen ei käytetä turhaa aikaa.

Molempien algoritmien tilavaativuus on O(|V|), koska kekoon/jonoon ei lisätä yhtä nodea kuin kerran. Molemmat algoritmit myös käyttävät O(|V|) verran tilaa pitäessään kirjaa käydyistä nodeista.

Ohjelmaa voisi parantaa lisäämällä enemmän reintinhakualgoritmeja. Ehkäpä myös benchmark mode olisi kiva.

Lähteet:
http://theory.stanford.edu/~amitp/GameProgramming/Heuristics.html
Introduction to Algorithms by Charles E. Leiserson, Clifford Stein, Ronald Rivest, and Thomas H. Cormen