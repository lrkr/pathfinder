Ohjelma koostuu reitinhakualgoritmeist�, niiden tarvitsemista apuluokista kuten Maze, Node yms sek� simppelist� graafisesta k�ytt�liittym�st�. Kun graafisesta k�ytt�liittym�st� valitsee labyrintin ja algoritmin n�ytt�� ohjelma miten reintinhakualgoritmi l�yt�� reitin alkukohdasta loppukohtaan. Labyrintti� voi editoida klikkailemalla seini� tai reittej�.

Ohjelmassa k�ytett�v�t reitinhakualgoritmit ovat leveyshaku, A\* ja jump point serch (kunhan kerki��). 

T�rkein itsetehty tietorakenne on labyrintin nodeille tehty minikeko. Koska nodet yll�pit�v�t itse tietoa keon indeksist��n ja done-statuksestaan, olen saanut keon containsin ja reitinhakualgoritmien k�ytt�m�n node.isDone():n toteutettua vakioaikaisesti. A\*:n k�ytt�m�t nodet luodaan vasta tarvittaessa.

Ohjelmaa voisi parantaa lis��m�ll� enemm�n reintinhakualgoritmeja. Ehk�p� my�s benchmark mode olisi kiva.