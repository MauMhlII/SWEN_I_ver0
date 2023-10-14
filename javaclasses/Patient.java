
/*---///-----///---*/

/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/

import java.util.Date;

public class Patient {
    
//Variables
/*---///-----///---*/
private String patID;
private String vorname;
private String nachname;
private Date birthday;
private String wohnort;
/*---///-----///---*/

//Konstruktor
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/
public Patient(String patID, String vorname, String nachname)
{
this.vorname = vorname;
this.nachname = nachname;
setPatID(patID);
}
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/


//Getter und Setter
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/
public String getVorname() {
    return vorname;
}

public void setVorname(String vorname) {
    this.vorname = vorname;
}
/*---///-----///---*//*---///-----///---*/
public String getNachname() {
    return nachname;
}

public void setNachname(String nachname) {
    this.nachname = nachname;
}
/*---///-----///---*//*---///-----///---*//*---///-----///---*/
public String getPatID() {
return patID;
}

public void setPatID(String patID) {
if (patID != null && patID.matches("[A-Za-z]{2}\\d{8}")) 
{
this.patID = patID;
} 
else 
{
System.out.println("Ungültige Patientenidentifikationsnummer");
}
}
/*---///-----///---*//*---///-----///---*//*---///-----///---*/
public Date getBirthday() {
    return birthday;
}

public void setBirthday(Date birthday) {
    this.birthday = birthday;
}
/*---///-----///---*//*---///-----///---*/
public String getWohnort() {
    return wohnort;
}
public String setWohnort(String wohnort) {
    return this.wohnort = wohnort;
}
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/





}
/*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*//*---///-----///---*/