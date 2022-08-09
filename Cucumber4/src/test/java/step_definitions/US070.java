package step_definitions;



import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class US070 {

    Response response=null;
    RequestSpecification request=new RequestSpecBuilder().setBaseUri("http://environment.kielmarketplace.nl/api").build();

    @Given("kullanici {string} sayfasina post tipinde email {string} ve sifre {string} bilgileri ile baglanir")
    public void kullaniciSayfasinaPostTipindeEmailVeSifreBilgileriIleBaglanir(String endPoint, String email, String password) {
        JsonObject jsonObject=new JsonObject();
        jsonObject.add("email",email);
        jsonObject.add("sifre",password);

        response=given().
                contentType(ContentType.JSON).
                spec(request).
                body(jsonObject.toString()).
                post(endPoint);

    }

    @Then("kullanici gelen cevabin durum kodunun {int} oldugunu dogrular")
    public void kullaniciGelenCevabinDurumKodununOldugunuDogrular(int statusCode) {
        Assert.assertTrue(response.statusCode()==statusCode);
    }

    @Then("kullanici gelen cevap icerisinde kullaniciya ait verilerin bulundugunu dogrular")
    public void kullaniciGelenCevapIcerisindeKullaniciyaAitVerilerinBulundugunuDogrular() {
        String sonuc=response.jsonPath().getString("sonuc");
        String id = response.jsonPath().getString("_id");
        String username=response.jsonPath().getString("username");
        String rol=response.jsonPath().getString("rol");

        Assert.assertNotNull(sonuc);
        Assert.assertNotNull(id);
        Assert.assertNotNull(username);
        Assert.assertNotNull(rol);
    }

    @Then("kullanici gelen cevap icerisinde sonuc ozelliginin var oldugunu dogrular")
    public void kullaniciGelenCevapIcerisindeSonucOzelligininVarOldugunuDogrular() {

        String sonuc=response.jsonPath().getString("sonuc");
        Assert.assertNotNull(sonuc);
        Assert.assertTrue(response.getStatusCode()==200);
    }
}
