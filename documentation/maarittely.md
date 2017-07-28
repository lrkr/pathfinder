Harjoitusty�n tavoitteena on toteuttaa Java-ohjelma, jolla voi visualisoida reitinhakualgoritmeja ja vertailla niiden suorituskyky�. 

Toteutan simppelin graafisen k�ytt�liittym�n, joka n�ytt�� algoritmien toiminnan askel kerrallaan. K�yt�n simppeli� ruudukkolabyrintti�, joka esitet��n joko ascii-merkkein� tai v�rillisin� neli�in�. Labyrintit ovat tehty etuk�teen, mutta niit� voi helpohkosti tiedostoista editoida. Ainakin alkuun kaikki kaaret/askeleet saman painoisia.

Toteutan ensimm�iseksi leveys- ja syvyyssuuntaiset l�pik�ynnit ja A*:n.

Pyrin toteuttamaan algoritmit niiden tunnetuilla aika- ja tilavaativuuksilla.

Toteutettavia tietorakenteita ovat ainakin lista, jono, pino, prioriteettijono ja ehk� hajautustaulu.

#### Lis�ominaisuuksia jos/kun aikaa riitt��:

- Lis�� reitinhakualgoritmeja

- Labyrintin esiprosessoiminen simppelimm�ksi verkoksi ja analysointi sen vaikutuksista. Esimerkkitilanne: k�yt�v� jossa on kuusi askelta. Normaalisti algoritmin pit�isi ottaa kuusi askelta, mutta jos labyrintti olisi muutettu verkoksi jossa on vain risteykset ja k��nn�kset, ei algoritmin tarvitsisi ottaa kuin yksi askel. T�m� luultavasti vaatii melko ison labyrintin, jotta esiprosessointiin sek� reitinhakuun k�ytetty aika olisi pienempi kuin pelkk� reitinhaku (jos se edes ikin� on). Voi aiheuttaa ongelmia visualisoinnissa jos labyrintin koko menee eritt�in isoksi..

- Mahdollisuus eri painoihin askeleissa

- Jos aikaa on aivan liikaa niin jonkinlainen labyrintin editointimahdollisuus k�ytt�liittym�n kautta. "Mit� tapahtuu jos lis��n t�h�n sein�n?"Harjoitusty�n tavoitteena on toteuttaa Java-ohjelma, jolla voi visualisoida reitinhakualgoritmeja ja vertailla niiden suorituskyky�. 

Toteutan simppelin graafisen k�ytt�liittym�n, joka n�ytt�� algoritmien toiminnan askel kerrallaan. K�yt�n simppeli� ruudukkolabyrintti�, joka esitet��n joko ascii-merkkein� tai v�rillisin� neli�in�. Labyrintit ovat tehty etuk�teen, mutta niit� voi helpohkosti tiedostoista editoida. Ainakin alkuun kaikki kaaret/askeleet saman painoisia.

Toteutan ensimm�iseksi leveys- ja syvyyssuuntaiset l�pik�ynnit ja A*:n.

Pyrin toteuttamaan algoritmit niiden tunnetuilla aika- ja tilavaativuuksilla.

Toteutettavia tietorakenteita ovat ainakin lista, jono, pino, prioriteettijono ja ehk� hajautustaulu.

#### Lis�ominaisuuksia jos/kun aikaa riitt��:

- Lis�� reitinhakualgoritmeja

- Labyrintin esiprosessoiminen simppelimm�ksi verkoksi ja analysointi sen vaikutuksista. Esimerkkitilanne: k�yt�v� jossa on kuusi askelta. Normaalisti algoritmin pit�isi ottaa kuusi askelta, mutta jos labyrintti olisi muutettu verkoksi jossa on vain risteykset ja k��nn�kset, ei algoritmin tarvitsisi ottaa kuin yksi askel. T�m� luultavasti vaatii melko ison labyrintin, jotta esiprosessointiin sek� reitinhakuun k�ytetty aika olisi pienempi kuin pelkk� reitinhaku (jos se edes ikin� on). Voi aiheuttaa ongelmia visualisoinnissa jos labyrintin koko menee eritt�in isoksi..

- Mahdollisuus eri painoihin askeleissa

- Jos aikaa on aivan liikaa niin jonkinlainen labyrintin editointimahdollisuus k�ytt�liittym�n kautta. "Mit� tapahtuu jos lis��n t�h�n sein�n?"