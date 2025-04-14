Feature: Kullanici chrome browseri acar ve ilgili testi yapar
  @browser
  Scenario: Kullanici browseri acar ve test görevlerinin yerine getirir
    #Given Kullanici hepsiburada adresine gider
    Given Kullanici "url" adresine gider
    Then Arama kutusunun oldugunu dogrular