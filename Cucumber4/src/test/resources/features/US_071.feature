Feature: US_071 Bir kuullanici olarak "/api/user/account/logout" sayfasina "get" tipinde baglandigimda sistemde3n cikabilmeliyim.

  #TC_001_US_071 Gelen cevabin durum kodu 200 olmalidir.Feature: 200  200  Pass
  #TC_002_US_071 Gelen cevap icerisinde "sonuc=true" degeri yer almalidir.  {sonuc:true}  {sonuc:true}  Pass

  Scenario: kullanici durum kodunun 200 oldugunu dogrular
    Given kullanici "/user/account/logout" sayfasina get tipinde baglanir
    Then kullanici aldigi cevabin durum kodunun 200 oldugunu dogrular

  Scenario: kullanici gelen cevap icerisindeki sonuc:true ifadesinin varligini dogrular
    Given kullanici "/user/account/logout" sayfasina get tipinde baglanir
    Then kullanici gelen cevap icerisindeki sonuc ozelliginin degerinin true oldugunu dogrular

