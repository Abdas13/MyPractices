Feature: US_30 user be able to see all the countries in the ilanekle page

  Scenario:
    Given kullanici "http://environment.kielmarketplace.nl" adresine gider
    And kullanici giris yap linkine tiklar
    And kullanici sisteme "kullanici1@gmail.com" ve "Kullanici123." bilgileri ile giris yapar
    And kullanici ilan ekle butonuna tiklar
    Then kullanici add_ilan sayfasinda excel dosyasindaki ulkeler bilgilerinin ulkeler dropdownu icerisindeki varligini dogrular
