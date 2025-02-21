Feature: executeQuery Testleri

  Background: Database baglantisi olusturulur.
    * Database baglantisi kurulur.


    # Database icindeki "deposits" toblosunda
    # "amount" degeri 100$ ile 500$ arasinda olan
    # user_id'leri dogrulayiniz

  @executeQuery01
  Scenario: Amount degerine gore ID sorgulama testi

    * SQL Query'si hazirla ve calistir.
    * Sonuclari dogrula.
    * Database baglantisini sonlandir.



    # Database içindeki "cron_schedules" tablosunda ilk 2 kaydın
    # "name" bilgisini doğrulayınız

  @executeQuery02
  Scenario: cron_schedules tablosundan "Name" bilgisi dogrulama testi.

    * (cron_schedules) SQL query'si  calistirilir
    * (cron_schedules) sonuclari  dogrulanir.
    * Database baglantisini sonlandir.

