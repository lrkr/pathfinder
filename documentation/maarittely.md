Harjoitustyön tavoitteena on toteuttaa Java-ohjelma, jolla voi visualisoida reitinhakualgoritmeja ja vertailla niiden suorituskykyä. 

Toteutan simppelin graafisen käyttöliittymän, joka näyttää algoritmien toiminnan askel kerrallaan. Käytän simppeliä ruudukkolabyrinttiä, joka esitetään joko ascii-merkkeinä tai värillisinä neliöinä. Labyrintit ovat tehty etukäteen, mutta niitä voi helpohkosti tiedostoista editoida. Ainakin alkuun kaikki kaaret/askeleet saman painoisia.

Toteutan ensimmäiseksi leveys- ja syvyyssuuntaiset läpikäynnit ja A*:n.

Pyrin toteuttamaan algoritmit niiden tunnetuilla aika- ja tilavaativuuksilla.

Toteutettavia tietorakenteita ovat ainakin lista, jono, pino, prioriteettijono ja ehkä hajautustaulu.

#### Lisäominaisuuksia jos/kun aikaa riittää:

- Lisää reitinhakualgoritmeja

- Labyrintin esiprosessoiminen simppelimmäksi verkoksi ja analysointi sen vaikutuksista. Esimerkkitilanne: käytävä jossa on kuusi askelta. Normaalisti algoritmin pitäisi ottaa kuusi askelta, mutta jos labyrintti olisi muutettu verkoksi jossa on vain risteykset ja käännökset, ei algoritmin tarvitsisi ottaa kuin yksi askel. Tämä luultavasti vaatii melko ison labyrintin, jotta esiprosessointiin sekä reitinhakuun käytetty aika olisi pienempi kuin pelkkä reitinhaku (jos se edes ikinä on). Voi aiheuttaa ongelmia visualisoinnissa jos labyrintin koko menee erittäin isoksi..

- Mahdollisuus eri painoihin askeleissa

- Jos aikaa on aivan liikaa niin jonkinlainen labyrintin editointimahdollisuus käyttöliittymän kautta. "Mitä tapahtuu jos lisään tähän seinän?"Harjoitustyön tavoitteena on toteuttaa Java-ohjelma, jolla voi visualisoida reitinhakualgoritmeja ja vertailla niiden suorituskykyä. 

Toteutan simppelin graafisen käyttöliittymän, joka näyttää algoritmien toiminnan askel kerrallaan. Käytän simppeliä ruudukkolabyrinttiä, joka esitetään joko ascii-merkkeinä tai värillisinä neliöinä. Labyrintit ovat tehty etukäteen, mutta niitä voi helpohkosti tiedostoista editoida. Ainakin alkuun kaikki kaaret/askeleet saman painoisia.

Toteutan ensimmäiseksi leveys- ja syvyyssuuntaiset läpikäynnit ja A*:n.

Pyrin toteuttamaan algoritmit niiden tunnetuilla aika- ja tilavaativuuksilla.

Toteutettavia tietorakenteita ovat ainakin lista, jono, pino, prioriteettijono ja ehkä hajautustaulu.

#### Lisäominaisuuksia jos/kun aikaa riittää:

- Lisää reitinhakualgoritmeja

- Labyrintin esiprosessoiminen simppelimmäksi verkoksi ja analysointi sen vaikutuksista. Esimerkkitilanne: käytävä jossa on kuusi askelta. Normaalisti algoritmin pitäisi ottaa kuusi askelta, mutta jos labyrintti olisi muutettu verkoksi jossa on vain risteykset ja käännökset, ei algoritmin tarvitsisi ottaa kuin yksi askel. Tämä luultavasti vaatii melko ison labyrintin, jotta esiprosessointiin sekä reitinhakuun käytetty aika olisi pienempi kuin pelkkä reitinhaku (jos se edes ikinä on). Voi aiheuttaa ongelmia visualisoinnissa jos labyrintin koko menee erittäin isoksi..

- Mahdollisuus eri painoihin askeleissa

- Jos aikaa on aivan liikaa niin jonkinlainen labyrintin editointimahdollisuus käyttöliittymän kautta. "Mitä tapahtuu jos lisään tähän seinän?"