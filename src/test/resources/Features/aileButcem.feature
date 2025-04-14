Feature: Kullanici Aile Butcem uygulamasinda verilen görevleri yapar


  Background:
    Given Ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    When "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
    Then Uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin


  @aile
  Scenario: Kullanici Aile Butcem uygulamasinda test yapar
    Given Sol kisimdaki menuden "Hesabım" bolumune gidin
    When Hesabim sayfasindaki bilgileri degistirerek "isim" "soyisim" "sehir" "yas" "meslek" ve cinsiyet "Kadın" degisikleri kaydedin ve değişikleri dogrulayin
    Then Uygulamayi kapatir