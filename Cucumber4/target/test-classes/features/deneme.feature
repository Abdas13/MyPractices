Feature: Kullanici islemleri
  Background: senaryodan once baslayacaklar
    Given deneme
    Then islem tamamdir
  Scenario: Kullanici dogru bilgilerle kayit olur
    Given deneme
    And ikinci adim
    Then son adim

  Scenario Outline: birden fazla detayla ayni testi tekrar etmek
    Given kullanici amazon.com a gider
    And kullanici <"kelime"> aramasi yapar
