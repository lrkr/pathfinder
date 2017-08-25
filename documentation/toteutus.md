Ohjelma koostuu reitinhakualgoritmeistä, niiden tarvitsemista apuluokista kuten Maze, Node yms sekä simppelistä graafisesta käyttöliittymästä. Kun graafisesta käyttöliittymästä valitsee labyrintin ja algoritmin näyttää ohjelma miten reintinhakualgoritmi löytää reitin alkukohdasta loppukohtaan. Labyrinttiä voi editoida klikkailemalla seiniä tai reittejä.

Ohjelmassa käytettävät reitinhakualgoritmit ovat leveyshaku, A\* ja jump point serch (kunhan kerkiää). 

Tärkein itsetehty tietorakenne on labyrintin nodeille tehty minikeko. Koska nodet ylläpitävät itse tietoa keon indeksistään ja done-statuksestaan, olen saanut keon containsin ja reitinhakualgoritmien käyttämän node.isDone():n toteutettua vakioaikaisesti. A\*:n käyttämät nodet luodaan vasta tarvittaessa.

Ohjelmaa voisi parantaa lisäämällä enemmän reintinhakualgoritmeja. Ehkäpä myös benchmark mode olisi kiva.