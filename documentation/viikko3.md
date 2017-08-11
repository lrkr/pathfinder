# Viikkoraportti 3
Aloitin viikon A\*:lla, joka sin‰ns‰ toimi jotenkin, mutta ei antanut lyhint‰ reitti‰, koska koitin tehd‰ sit‰ liian simppelisti. Heuristiikka toimi kyll‰ hyvin. Siirryin helpompaan asiaan ja toteutin listan, pinon ja jonon niiden metodien osalta, joita tarvitsen. Palasin A\*:n pariin ja tein sen kuntoon uutta Node-luokkaa k‰ytt‰en. Nyt minulla on Location ja Node, jotka tekev‰t osittain samaa asiaa eri algoritmeissa. Node-luokkaa voisi kyll‰ k‰ytt‰‰ myˆs BFS:ss‰ mutta Location on "kevyempi" niin annan sen ainakin t‰ll‰ er‰‰ olla n‰in. Refaktoroin luokkia j‰rkeviin paketteihin sek‰ siirtelin ja yhdistelin muutamia metodeja.

JaCoCon kanssa on ollut pieni‰ ongelmia. Pit‰‰ ajaa clean build ennen testiraportin tekoa tai muuten raportista puuttuu parin luokan testit. Maze-luokan raportti on aika karua katseltavaa, koska en jaksanut testilabyrinttiin tehd‰ mit‰‰n testi‰. Ensi viikolla t‰m‰ poistuu, kun teen labyrintin lataamisen tiedostosta.

Ensi viikolla teen reitinhakualgoritmin tai pari lis‰‰, teen prioriteettijonon ja laajennan visualisaatiota. Ainakin algoritmin ja labyrintin valinta pit‰isi toteuttaa. Ehk‰ myˆs statsitekstiboksi. Testej‰ pit‰isi tehd‰ lis‰‰. Tietorakenteita pit‰isi varmaan tehd‰ hieman virhekest‰vimmiksi.

Tietorakenteet: 1.5 tuntia  
A*: 2 tuntia  
Refaktorointi + s‰‰tˆ: 1 tunti  
Javadoc + testit + JaCoCo: 2 tuntia  
Yhteens‰: 6.5 tuntia