Ohjelma koostuu reitinhakualgoritmeist�, niiden tarvitsemista apuluokista kuten Maze, Node yms sek� simppelist� graafisesta k�ytt�liittym�st�. Kun graafisesta k�ytt�liittym�st� valitsee labyrintin ja algoritmin n�ytt�� ohjelma miten reintinhakualgoritmi l�yt�� reitin alkukohdasta loppukohtaan.

Ohjelmassa k�ytett�v�t reitinhakualgoritmit ovat A\* eri heuristiikoilla ja leveyshaku.

T�rkein itsetehty tietorakenne on labyrintin nodeille tehty minimikeko. Koska nodet yll�pit�v�t itse tietoa keon indeksist��n ja done-statuksestaan, olen saanut keon containsin ja A\*:n k�ytt�m�n node.isDone():n toteutettua vakioaikaisesti.  

A\*:lle on eri heuristiikoita: manhattan, manhattan nudged ja manhattan cross product vector. Koska labyrintiss� ei voi liikkua vinoittain, on manhattan huono tapauksessa, jossa lyhimpi� reittej� on useita. T�ll�in keossa tulee paljon tasapelej�, jolloin monia eri reittej� aletaan laajentamaan. Manhattan nudged poistaa tasapelit nostamalla heuristiikan arvoa 0.1 prosentilla. Manhattan cross product antaa paremman prioriteetin nodeille, jotka ovat alku- ja loppukohtien v�lisell� suoralla.

BFS:n aikavaativuus on O(|V|+|E|), koska jokaisen noden kohdalla voi joutua k�ym��n kaikki viereiset l�pi.

A\* aikavaativuus on tunnettu O((|E| + |V|) log |V|), koska node voidaan lis�t� kekoon vain kerran ja jokaisen noden kohdalla k�yd��n viereiset l�pi. A\*:n k�ytt�m�t node-oliot luodaan vasta tarvittaessa, joten niiden enneltatekemiseen ei k�ytet� turhaa aikaa.

Molempien algoritmien tilavaativuus on O(|V|), koska kekoon/jonoon ei lis�t� yht� nodea kuin kerran. Molemmat algoritmit my�s k�ytt�v�t O(|V|) verran tilaa pit�ess��n kirjaa k�ydyist� nodeista.

Ohjelmaa voisi parantaa lis��m�ll� enemm�n reintinhakualgoritmeja. Ehk�p� my�s benchmark mode olisi kiva.

L�hteet:
http://theory.stanford.edu/~amitp/GameProgramming/Heuristics.html
Introduction to Algorithms by Charles E. Leiserson, Clifford Stein, Ronald Rivest, and Thomas H. Cormen