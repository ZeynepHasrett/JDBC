Feature: executeQuery Testleri


  // Database icindeki "deposits" toblosunda
  // "amount" degeri 100$ ile 500$ arasinda olan
  // user_id'leri dogrulayiniz

  Scenario: Amount degerine gore ID sorgulama testi

    * Database baglantisi kurulur.
    * SQL Query'si hazirla ve calistir.
    * Sonuclari dogrula.
    * Database baglantisini sonlandir.